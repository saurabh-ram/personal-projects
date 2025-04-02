package com.saurabh.clinicalsapi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.clinicalsapi.model.ClinicalData;
import com.saurabh.clinicalsapi.model.Patient;
import com.saurabh.clinicalsapi.repos.PatientRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Product REST Endpoint")
@CrossOrigin
public class PatientController {

	@Autowired
	private PatientRepository repository;
	Map<String, String> filters = new HashMap<>();

	@GetMapping("/patients")
	@Operation(summary = "Returns a list of Patient", description = "Returns a list of Patient records")
	public @ApiResponse(description = "OK", responseCode = "200", useReturnTypeSchema = true) List<Patient> getPatients() {
		return repository.findAll();
	}

	@GetMapping("/patients/{id}")
	@Operation(/* (Changes the name of the method in Swagger JSON Response) *//* operationId = "P001", */summary = "Returns a Patient", description = "Takes an ID and returns a single Patient record associated with that ID")
	public @ApiResponse(description = "Returns a Patient Object", responseCode = "200") Patient getPatient(
			@Parameter(description = "ID of the Patient", example = "8") @PathVariable("id") int id) {
		return repository.findById(id).get();
	}

	@PostMapping("/patients/create")
	@Operation(summary = "Returns a Patient", description = "Saves the Patient and returns the saved Patient record")
	public @ApiResponse(description = "Patient record Created", responseCode = "201") Patient savePatient(
			@RequestBody Patient patient) {
		return repository.save(patient);
	}

	@GetMapping("/patients/analyze/{id}")
	public Patient analyze(@PathVariable("id") int id) {

		Patient patient = repository.findById(id).get();
		List<ClinicalData> clinicalDatas = patient.getClinicalDatas();
		List<ClinicalData> processedClinicalDatas = clinicalDatas.stream()
				.filter(d -> d.getComponentName().equals("hw") && d.getComponentValue() != null).map(d -> {
					if (filters.containsKey(d.getComponentName())) {
						clinicalDatas.remove(d);
						return null;
					} else {
						filters.put(d.getComponentName(), null);
					}
					String[] heightAndWeight = d.getComponentValue().split("/");
					if (heightAndWeight.length > 1) {
						return processComponentValue(heightAndWeight);
					}
					return null;
				}).filter(Objects::nonNull).collect(Collectors.toList());

//		List<ClinicalData> clinicalDatas = patient.getClinicalDatas();
//		ArrayList<ClinicalData> duplicateClinicalDatas = new ArrayList<>(clinicalDatas);
//		for (ClinicalData clinicalData : duplicateClinicalDatas) {
//			if (filters.containsKey(clinicalData.getComponentName())) {
//				clinicalDatas.remove(clinicalData);
//				continue;
//			} else {
//				filters.put(clinicalData.getComponentName(), null);
//			}
//			if (clinicalData.getComponentName().equals("hw")) {
//				if (heightAndWeight != null && heightAndWeight.length > 1) {
//					String[] heightAndWeight = clinicalData.getComponentValue().split("/");
//					float heightInMeters = Float.parseFloat(heightAndWeight[0]) * 0.01f;
//					double bmi = Double.parseDouble(heightAndWeight[1]) / (Math.pow(heightInMeters, 2));
//					ClinicalData bmiData = new ClinicalData();
//					bmiData.setComponentName("bmi");
//					bmiData.setComponentValue(Double.toString(bmi));
//					clinicalDatas.add(bmiData);
//				}
//			}
//		}

		filters.clear();
		clinicalDatas.addAll(processedClinicalDatas);
//		patient.setClinicalDatas(clinicalDatas);
		return patient;
	}

	private ClinicalData processComponentValue(String[] heightAndWeight) {
		try {
			float heightInMeters = Float.parseFloat(heightAndWeight[0]) * 0.01f;
			double bmi = Double.parseDouble(heightAndWeight[1]) / (Math.pow(heightInMeters, 2));
			ClinicalData bmiData = new ClinicalData();
			bmiData.setComponentName("bmi");
			bmiData.setComponentValue(Double.toString(bmi));
			return bmiData;
		} catch (NumberFormatException e) {
			return null;
		}
	}
}

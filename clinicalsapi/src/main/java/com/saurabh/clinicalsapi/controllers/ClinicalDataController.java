package com.saurabh.clinicalsapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.clinicalsapi.dto.ClinicalDataRequest;
import com.saurabh.clinicalsapi.model.ClinicalData;
import com.saurabh.clinicalsapi.model.Patient;
import com.saurabh.clinicalsapi.repos.ClinicalDataRepository;
import com.saurabh.clinicalsapi.repos.PatientRepository;

@RestController
@RequestMapping("/api")
public class ClinicalDataController {

//	@Autowired
//	PatientRepository patientRepository;
//
//	@Autowired
//	ClinicalDataRepository clinicalDataRepository;

	private PatientRepository patientRepository;

	private ClinicalDataRepository clinicalDataRepository;

	public ClinicalDataController(PatientRepository patientRepository, ClinicalDataRepository clinicalDataRepository) {
		this.patientRepository = patientRepository;
		this.clinicalDataRepository = clinicalDataRepository;
	}

	@PostMapping("/clinical-data")
	public ClinicalData saveClinicalData(@RequestBody ClinicalDataRequest request) {
		Patient patient = patientRepository.findById(request.getPatientId()).get();
		ClinicalData clinicalData = new ClinicalData();
		clinicalData.setComponentName(request.getComponentName());
		clinicalData.setComponentValue(request.getComponentValue());
		clinicalData.setPatient(patient);
		return clinicalDataRepository.save(clinicalData);
	}

}

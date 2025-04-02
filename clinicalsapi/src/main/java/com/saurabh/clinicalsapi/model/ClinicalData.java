package com.saurabh.clinicalsapi.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
//In case of Bidirectional relationship, when the Serialization happens, the operation will go on a loop trying to serialize entity fields with in the entity class.
//So, to ignore it, we need to mark
@JsonIgnoreProperties(value = {"patient"})
public class ClinicalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String componentName;
	private String componentValue;
	private Timestamp measuredDateTime;

	@ManyToOne
	@JoinColumn(name = "PATIENT_ID", nullable = false)
//	If you do not want to use @JsonIgnoreProperties, then you can use @JsonIgnore annotation to ignore the serialization for a particular field.
//	@JsonIgnore
	private Patient patient;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentValue() {
		return componentValue;
	}

	public void setComponentValue(String componentValue) {
		this.componentValue = componentValue;
	}

	public Timestamp getMeasuredDateTime() {
		return measuredDateTime;
	}

	public void setMeasuredDateTime(Timestamp measuredDateTime) {
		this.measuredDateTime = measuredDateTime;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "ClinicalData [id=" + id + ", componentName=" + componentName + ", componentValue=" + componentValue
				+ ", measuredDateTime=" + measuredDateTime + "]";
	}

}

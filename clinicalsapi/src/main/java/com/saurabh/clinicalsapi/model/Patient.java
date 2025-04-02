package com.saurabh.clinicalsapi.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Patient ID", example = "8")
	private Integer id;
	@Schema(description = "First Name of the Patient", example = "Simba")
	private String firstName;
	@Schema(description = "Last Name of the Patient", example = "White")
	private String lastName;
	@Schema(description = "Age of the Patient", example = "24")
	private int age;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "patient")
	private List<ClinicalData> clinicalDatas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<ClinicalData> getClinicalDatas() {
		return clinicalDatas;
	}

	public void setClinicalDatas(List<ClinicalData> clinicalDatas) {
		this.clinicalDatas = clinicalDatas;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}

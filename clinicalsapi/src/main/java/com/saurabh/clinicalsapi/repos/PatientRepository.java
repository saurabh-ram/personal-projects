package com.saurabh.clinicalsapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.clinicalsapi.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}

package com.saurabh.clinicalsapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.clinicalsapi.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

}

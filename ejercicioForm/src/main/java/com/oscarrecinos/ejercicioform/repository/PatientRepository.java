package com.oscarrecinos.ejercicioform.repository;

import com.oscarrecinos.ejercicioform.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

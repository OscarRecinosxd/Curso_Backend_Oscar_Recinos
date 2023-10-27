package com.oscarrecinos.ejercicioform.service;

import com.oscarrecinos.ejercicioform.entity.Address;
import com.oscarrecinos.ejercicioform.entity.Patient;
import com.oscarrecinos.ejercicioform.repository.AddressRepository;
import com.oscarrecinos.ejercicioform.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public Patient createPatient(Patient patient){
        patientRepository.save(patient);
        return patient;
    }

    public Patient findById(Long id){
        return patientRepository.findById(id).orElse(null);
    }
}

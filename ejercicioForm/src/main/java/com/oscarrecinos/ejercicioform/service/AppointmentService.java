package com.oscarrecinos.ejercicioform.service;

import com.oscarrecinos.ejercicioform.entity.Appointment;
import com.oscarrecinos.ejercicioform.entity.Patient;
import com.oscarrecinos.ejercicioform.repository.AppointmentRepository;
import com.oscarrecinos.ejercicioform.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    public Appointment createAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
        return appointment;
    }

    public Appointment findById(Long id){
        return appointmentRepository.findById(id).orElse(null);
    }

    public List<Appointment> findAll(){
        return appointmentRepository.findAll();
    }
}

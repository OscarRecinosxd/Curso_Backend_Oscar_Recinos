package com.oscarrecinos.ejercicioform.controller;

import com.oscarrecinos.ejercicioform.entity.Address;
import com.oscarrecinos.ejercicioform.entity.Appointment;
import com.oscarrecinos.ejercicioform.entity.Patient;
import com.oscarrecinos.ejercicioform.repository.AddressRepository;
import com.oscarrecinos.ejercicioform.repository.PatientRepository;
import com.oscarrecinos.ejercicioform.service.AddressService;
import com.oscarrecinos.ejercicioform.service.AppointmentService;
import com.oscarrecinos.ejercicioform.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class AppointmentController {

    @Autowired
    AddressService addressService;

    @Autowired
    PatientService patientService;

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("/appointment")
    public String appointmentForm(Map<String, Object> model){
        Address address = new Address();
        Appointment appointment = new Appointment();
        Patient patient = new Patient();

        model.put("address",address);
        model.put("appointment",appointment);
        model.put("patient",patient);


        return "appointmentform";
    }

    @GetMapping("/getappointments")
    public String getAppointments(Map<String, Object> model){
        List<Appointment> appointments = appointmentService.findAll();


        model.put("appointments",appointments);


        return "appointmentList";
    }

    @PostMapping("/appointment")
    public String saveAppointment( @Valid Address address, BindingResult addressResult,
                                   @Valid Appointment appointment,BindingResult appointmentResult,
                                   @Valid Patient patient, BindingResult patientResult,
                                   Model model){

        if(addressResult.hasErrors() || appointmentResult.hasErrors() || patientResult.hasErrors()){
            return "appointmentform";
        }


        patientService.createPatient(patient);
        addressService.createAddress(address);


        patient.setAddress(address);
        address.setPatient(patient);
        appointment.setPatient(patient);

        addressService.createAddress(address);
        appointmentService.createAppointment(appointment);
        patientService.createPatient(patient);

        model.addAttribute("titulo","Ingreso de cita");
        model.addAttribute("appointment",appointment);
        model.addAttribute("address",address);
        model.addAttribute("patient",patient);

        return "appointmentSaved";
    }
}

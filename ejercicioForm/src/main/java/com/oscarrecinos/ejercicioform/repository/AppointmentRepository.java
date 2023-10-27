package com.oscarrecinos.ejercicioform.repository;

import com.oscarrecinos.ejercicioform.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

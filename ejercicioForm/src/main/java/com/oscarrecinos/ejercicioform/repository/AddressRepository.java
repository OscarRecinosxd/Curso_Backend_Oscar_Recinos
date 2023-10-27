package com.oscarrecinos.ejercicioform.repository;

import com.oscarrecinos.ejercicioform.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

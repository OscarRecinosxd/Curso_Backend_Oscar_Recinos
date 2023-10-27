package com.oscarrecinos.ejercicioform.service;

import com.oscarrecinos.ejercicioform.entity.Address;
import com.oscarrecinos.ejercicioform.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public Address createAddress(Address address){
        addressRepository.save(address);
        return address;
    }

    public Address findById(Long id){
        return addressRepository.findById(id).orElse(null);
    }

}

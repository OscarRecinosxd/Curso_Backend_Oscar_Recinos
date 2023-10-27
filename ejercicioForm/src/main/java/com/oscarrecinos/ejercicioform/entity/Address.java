package com.oscarrecinos.ejercicioform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import javax.swing.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "No debe ser vacio")
    private String address1;
    @NotBlank(message = "No debe ser vacio")
    private String address2;
    @NotBlank(message = "No debe ser vacio")
    private String city;
    @NotBlank(message = "No debe ser vacio")
    private String region;
    @NotBlank(message = "No debe ser vacio")

    @Length(min = 1,max = 5,message = "El zip tiene que tener entre 0 y 5")
    private String zip;

    @OneToOne
    private Patient patient;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

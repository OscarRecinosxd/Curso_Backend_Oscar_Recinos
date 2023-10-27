package com.oscarrecinos.ejercicioform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 2,max = 50,message = "Ingresa una cadena entre 2 y 50")
    private String name;
    @Column(name = "last_name")
    @Length(min = 2,max = 50,message = "Ingresa una cadena entre 2 y 50")
    private String lastName;

    @NotNull(message ="Ingresa una fecha de nacimiento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;


    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

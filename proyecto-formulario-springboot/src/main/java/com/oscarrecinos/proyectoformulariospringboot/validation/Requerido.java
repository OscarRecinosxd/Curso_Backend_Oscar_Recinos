package com.oscarrecinos.proyectoformulariospringboot.validation;

import jakarta.validation.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = RequeridoValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Requerido {
    String message() default "el campo es requerido - usando anotaciones";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}


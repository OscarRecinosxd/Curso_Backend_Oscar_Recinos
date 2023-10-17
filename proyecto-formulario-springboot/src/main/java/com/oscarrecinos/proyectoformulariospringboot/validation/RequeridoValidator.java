package com.oscarrecinos.proyectoformulariospringboot.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

public class RequeridoValidator  implements ConstraintValidator<Requerido, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }


}

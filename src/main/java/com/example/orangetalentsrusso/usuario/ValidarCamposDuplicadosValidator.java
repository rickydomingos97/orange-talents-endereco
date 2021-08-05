package com.example.orangetalentsrusso.usuario;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarCamposDuplicadosValidator implements ConstraintValidator<ValidarCamposDuplicados, String> {

    private UsuarioRepository repository;

    public ValidarCamposDuplicadosValidator(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(repository.existsByEmail(value)){
            return false;
        }
        return true;
    }
}

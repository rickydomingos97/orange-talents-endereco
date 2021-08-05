package com.example.orangetalentsrusso.usuario;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ValidarCamposDuplicadosValidator.class})
public @interface ValidarCamposDuplicados {
    String message() default "Campo Duplicado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

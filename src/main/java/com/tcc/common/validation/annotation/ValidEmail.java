package com.tcc.common.validation.annotation;

import com.tcc.common.validation.EmailValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Invalid email.";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

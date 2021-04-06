package com.cvalidation.demo.configure;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//we have to specify when will it work
@Target(ElementType.FIELD) //we have to specify where it will be affected
@Constraint(validatedBy= CemailVaild.class)
public @interface Cemail {

    String message() default "The Email adress is your providing is wrong";

    //Default parameters, it has to be
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

package anotacao;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidadorDoublePositivo.class)
public @interface DoublePositivo {

    String message() default "Nao eh positivo";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}

package anotacao;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorDoublePositivo implements ConstraintValidator<DoublePositivo, Double> {
    @Override
    public boolean isValid(Double num, ConstraintValidatorContext constraintValidatorContext) {
        return num > 0;
    }
}

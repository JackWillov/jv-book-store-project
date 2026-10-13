package strore.book.bookstore.dto.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Objects;
import org.springframework.beans.BeanWrapperImpl;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

    private String first;
    private String second;

    @Override
    public void initialize(FieldMatch annotation) {
        first = annotation.first();
        second = annotation.second();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object firstValue = new BeanWrapperImpl(value).getPropertyValue(first);
        Object secondValue = new BeanWrapperImpl(value).getPropertyValue(second);
        return Objects.equals(firstValue, secondValue);
    }
}

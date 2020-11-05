package kiyeon.practice.spring.inflearn.resourcevalidation.validationabstract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // errorCode는 message source 에서 찾아올 key
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is now allowed.");

        /**
        Event event = (Event) target;
        if (event.getTitle() == null) {
            // 여러 필드에 걸쳐 종합적으로 에러가 있는 경우 reject
            errors.reject();
            // 특정한 필드 값의 에러를 확인하는 경우에는 rejectValue
            errors.rejectValue();
        }
         **/
    }
}

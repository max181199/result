package mx.spring.valid;

import mx.spring.metaModel.serviceModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.Annotation;

public class serviceValidate implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return serviceModel.class.equals(aClass) ;
    }

    @Override
    public void validate(Object o, Errors errors) {
        serviceModel sem = (serviceModel) o;
    }
}

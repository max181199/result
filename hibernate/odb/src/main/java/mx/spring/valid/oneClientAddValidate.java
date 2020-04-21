package mx.spring.valid;

import mx.spring.metaModel.oneClientModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class oneClientAddValidate implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return oneClientModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        oneClientModel ocm = (oneClientModel) o;
        if( ocm.getClientName().equals("")){
            errors.rejectValue("clientName","","Empty Name");
        }
    }
}

package mx.spring.valid;

import mx.spring.metaModel.contactModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class contactAddValidate implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return contactModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        contactModel com = (contactModel) o;
        if( com.getContactName().equals("")){
            errors.rejectValue("contactName","","Empty Name");
        }

    }
}

package mx.spring.valid;

import mx.spring.metaModel.oneServiceModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class oneServiceValidate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return oneServiceModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        oneServiceModel osm = (oneServiceModel) o;
        try {
            if( !osm.getTariffDataYearSP().equals("--")){
                int count = Integer.valueOf(osm.getTariffDataYearSP());
                if( count > 99 || count < 0){
                    errors.rejectValue("tariffDataDay","","Must be int from 0 to 100");
                }
            }
        }
        catch ( Exception e){
            errors.rejectValue("downYearFl","","Must be int from 0 to 100");
        }


        String day = osm.getTariffDataDay();
        String month = osm.getTariffDataMonth();
        String yearFP = osm.getTariffDataYearFP();
        String yearSP = osm.getTariffDataYearSP();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--")  && !yearSP.equals("--")){

            int intDay = Integer.valueOf(day);
            int intMonth = Integer.valueOf(month);
            int intYear = Integer.valueOf(yearFP + yearSP);
            if ( (intMonth==1) && (intDay > 31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay > 29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("tariffDataDay","","Wrong date");
            }
        }




    }
}
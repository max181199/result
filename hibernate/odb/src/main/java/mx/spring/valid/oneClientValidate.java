package mx.spring.valid;

import mx.spring.metaModel.oneClientModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class oneClientValidate implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return oneClientModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        oneClientModel ocm = (oneClientModel) o;
        try {
            if( !ocm.getDownYearSP().equals("--")){
                int count = Integer.valueOf(ocm.getDownYearSP());
                if( count > 99 || count < 0){
                    errors.rejectValue("upYearSP","","Must be int from 0 to 100");
                }
            }
        }
        catch ( Exception e){
            errors.rejectValue("upYearSP","","Must be int from 0 to 100");
        }
        try {
            if( !ocm.getUpYearSP().equals("--")){
                int count = Integer.valueOf(ocm.getDownYearSP());
                if( count > 99 || count < 0){
                    errors.rejectValue("upYearSP","","Must be int from 0 to 100");
                }
            }
        }
        catch ( Exception e){
            errors.rejectValue("upYearSP","","Must be int from 0 to 100");
        }

        String day = ocm.getDownDay();
        String month = ocm.getDownMonth();
        String yearFP = ocm.getDownYearFP();
        String yearSP =ocm.getDownYearSP();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--") && !yearSP.equals("--") ){

            int intDay = Integer.valueOf(day);
            int intMonth = Integer.valueOf(month);
            int intYear = Integer.valueOf(yearFP + yearSP);
            if ( (intMonth==1) && (intDay > 31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay > 29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
        }

        day = ocm.getUpDay();
        month = ocm.getUpMonth();
        yearFP = ocm.getUpYearFP();
        yearSP= ocm.getUpYearSP();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--") && !yearSP.equals("--")){

            int intDay = Integer.valueOf(day);
            int intMonth = Integer.valueOf(month);
            int intYear = Integer.valueOf(yearFP + yearSP);
            if ( (intMonth==1) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay>29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("upYearSP","","Wrong date");
            }
        }
    }
}

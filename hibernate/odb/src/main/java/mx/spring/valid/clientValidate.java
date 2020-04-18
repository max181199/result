package mx.spring.valid;

import mx.spring.metaModel.clientModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class clientValidate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return clientModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        clientModel clm = (clientModel) o ;
        if (clm.getClientName().equals("error")){
            errors.rejectValue("clientName","MyOwnText","TestComplete :)");
        }
        try {
           if( !clm.getDownYearFl().equals("--")){
               int count = Integer.valueOf(clm.getDownYearFl());
               if( count > 99 || count < 0){
                   errors.rejectValue("downYearFl","","Must be int from 0 to 100");
               }
           }
        }
        catch ( Exception e){
            errors.rejectValue("downYearFl","","Must be int from 0 to 100");
        }
        try {
            if( !clm.getUpYearFl().equals("--")){
                int count = Integer.valueOf(clm.getUpYearFl());
                if( count > 99 || count < 0){
                    errors.rejectValue("upYearFl","","Must be int from 0 to 100");
                }
            }
        }
        catch ( Exception e){
            errors.rejectValue("upYearFl","","Must be int from 0 to 100");
        }

        String day = clm.getDownDay();
        String month = clm.getDownMonth();
        String yearFP = clm.getDownYearDl();
        String yearSP = clm.getDownYearFl();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--") && !yearSP.equals("--") ){

            int intDay = Integer.valueOf(day);
            int intMonth = Integer.valueOf(month);
            int intYear = Integer.valueOf(yearFP + yearSP);
            if ( (intMonth==1) && (intDay > 31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay > 29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("downDay","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("downDay","","Wrong date");
            }
        }

        day = clm.getUpDay();
        month = clm.getUpMonth();
        yearFP = clm.getUpYearDl();
        yearSP= clm.getUpYearFl();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--") && !yearSP.equals("--")){

            int intDay = Integer.valueOf(day);
            int intMonth = Integer.valueOf(month);
            int intYear = Integer.valueOf(yearFP + yearSP);
            if ( (intMonth==1) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay>29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("upDay","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("upDay","","Wrong date");
            }
        }



    }
}

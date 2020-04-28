package mx.spring.valid;

import mx.spring.metaModel.balanceModel;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class balanceValidate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return balanceModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        balanceModel bam = (balanceModel) o;
        try {
            if( !bam.getBalanceYearSP().equals("--")){
                int count = Integer.valueOf(bam.getBalanceYearSP());
                if( count > 99 || count < 0){
                    errors.rejectValue("balanceYearSP","","Must be int from 0 to 100");
                }
            }
        }
        catch ( Exception e){
            errors.rejectValue("balanceYearSP","","Must be int from 0 to 100");
        }

        String day = bam.getBalanceDay();
        String month = bam.getBalanceMonth();
        String yearFP = bam.getBalanceYearFP();
        String yearSP = bam.getBalanceYearSP();
        if ( !day.equals("--") && !month.equals("--") && !yearFP.equals("--") && !yearSP.equals("--") ){

            int intDay =0;
            int intMonth = 0;
            int intYear = 0;
            try {
                 intDay = Integer.valueOf(day);
                 intMonth = Integer.valueOf(month);
                 intYear = Integer.valueOf(yearFP + yearSP);
            }
            catch ( Exception e) {
                errors.rejectValue("balanceYearSP","","Bad Date Format");
            }


            if ( (intMonth==1) && (intDay > 31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==2) && ( (intDay > 29 && (intYear%4==0) )||(intDay>28 && (intYear%4!=0) ) )){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==3) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==4) && (intDay>30)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==5) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==6) && (intDay>30)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==7) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==8) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==9) && (intDay>30)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==10) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==11) && (intDay>30)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
            if ( (intMonth==12) && (intDay>31)){
                errors.rejectValue("balanceYearSP","","Wrong date");
            }
        }



    }
}

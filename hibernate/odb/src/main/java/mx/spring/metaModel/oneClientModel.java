package mx.spring.metaModel;

public class oneClientModel {

    // ### Service Update  ### //

    public String clientName = "";
    public float max_credit_day;
    public float max_credit_count;

    // ### Service History ### //

    public String serviceName = "";
    public float serviceState = 0;

    public String downDay = "--";
    public String downMonth = "--";
    public String downYearFP = "--";
    public String downYearSP = "--";

    public String upDay = "--";
    public String upMonth = "--";
    public String upYearFP = "--";
    public String upYearSP = "--";

    // ### Balance History  ### //



    public void setServiceState(float serviceState) {
        this.serviceState = serviceState;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUpMonth(String upMonth) {
        this.upMonth = upMonth;
    }

    public void setUpDay(String upDay) {
        this.upDay = upDay;
    }

    public void setDownMonth(String downMonth) {
        this.downMonth = downMonth;
    }

    public void setDownDay(String downDay) {
        this.downDay = downDay;
    }

    public void setDownYearFP(String downYearFP) {
        this.downYearFP = downYearFP;
    }

    public void setDownYearSP(String downYearSP) {
        this.downYearSP = downYearSP;
    }

    public void setUpYearFP(String upYearFP) {
        this.upYearFP = upYearFP;
    }

    public void setUpYearSP(String upYearSP) {
        this.upYearSP = upYearSP;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getUpMonth() {
        return upMonth;
    }

    public String getUpDay() {
        return upDay;
    }

    public String getDownMonth() {
        return downMonth;
    }

    public String getDownDay() {
        return downDay;
    }

    public float getServiceState() {
        return serviceState;
    }

    public String getDownYearFP() {
        return downYearFP;
    }

    public String getDownYearSP() {
        return downYearSP;
    }

    public String getUpYearFP() {
        return upYearFP;
    }

    public String getUpYearSP() {
        return upYearSP;
    }

    public float getMax_credit_count() {
        return max_credit_count;
    }

    public float getMax_credit_day() {
        return max_credit_day;
    }

    public void setMax_credit_count(float max_credit_count) {
        this.max_credit_count = max_credit_count;
    }

    public void setMax_credit_day(float max_credit_day) {
        this.max_credit_day = max_credit_day;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }
}

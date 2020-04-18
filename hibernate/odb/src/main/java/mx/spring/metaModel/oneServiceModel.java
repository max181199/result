package mx.spring.metaModel;

public class oneServiceModel {

    public String serviceName = "";
    public String serviceType = "";
    public String serviceDescribe = "";
    public boolean serviceState = true;
    // Service Update Form

    public int tariffId = 0;
    public boolean tariffIdFilter = false;

    public boolean tariffActual = false;
    public boolean tariffActualFilter = false;

    public float tariffCost = 0;
    public boolean tariffCostFilter = false;

    public boolean tariffDaypaymode = false;
    public boolean tarriffDaypaymodeFilter =false;

    public float tariffValue = 0;
    public boolean tariffValueFilter = false;

    public String tariffDataDay = "--";
    public String tariffDataMonth = "--";
    public String tariffDataYearFP = "--";
    public String tariffDataYearSP = "--";
    public boolean tariffDataFilter = false;

    public void setTariffActual(boolean tariffActual) {
        this.tariffActual = tariffActual;
    }

    public void setTariffActualFilter(boolean tariffActualFilter) {
        this.tariffActualFilter = tariffActualFilter;
    }

    public void setTariffCost(float tariffCost) {
        this.tariffCost = tariffCost;
    }

    public void setTariffCostFilter(boolean tariffCostFilter) {
        this.tariffCostFilter = tariffCostFilter;
    }

    public void setTariffDataDay(String tariffDataDay) {
        this.tariffDataDay = tariffDataDay;
    }

    public void setTariffDataFilter(boolean tariffDataFilter) {
        this.tariffDataFilter = tariffDataFilter;
    }

    public void setTariffDataMonth(String tariffDataMonth) {
        this.tariffDataMonth = tariffDataMonth;
    }

    public void setTariffDataYearFP(String tariffDataYearFP) {
        this.tariffDataYearFP = tariffDataYearFP;
    }

    public void setTariffDataYearSP(String tariffDataYearSP) {
        this.tariffDataYearSP = tariffDataYearSP;
    }

    public void setTariffDaypaymode(boolean tariffDaypaymode) {
        this.tariffDaypaymode = tariffDaypaymode;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public void setTariffIdFilter(boolean tariffIdFilter) {
        this.tariffIdFilter = tariffIdFilter;
    }

    public void setTariffValue(float tariffValue) {
        this.tariffValue = tariffValue;
    }

    public void setTariffValueFilter(boolean tariffValueFilter) {
        this.tariffValueFilter = tariffValueFilter;
    }

    public void setTarriffDaypaymodeFilter(boolean tarriffDaypaymodeFilter) {
        this.tarriffDaypaymodeFilter = tarriffDaypaymodeFilter;
    }

    public float getTariffCost() {
        return tariffCost;
    }

    public float getTariffValue() {
        return tariffValue;
    }

    public int getTariffId() {
        return tariffId;
    }

    public String getTariffDataDay() {
        return tariffDataDay;
    }

    public String getTariffDataMonth() {
        return tariffDataMonth;
    }


    public String getTariffDataYearFP() {
        return tariffDataYearFP;
    }

    public String getTariffDataYearSP() {
        return tariffDataYearSP;
    }

    public boolean isTariffActual() {
        return tariffActual;
    }

    public boolean isTariffActualFilter() {
        return tariffActualFilter;
    }

    public boolean isTariffCostFilter() {
        return tariffCostFilter;
    }

    public boolean isTariffDataFilter() {
        return tariffDataFilter;
    }

    public boolean isTariffDaypaymode() {
        return tariffDaypaymode;
    }

    public boolean isTariffIdFilter() {
        return tariffIdFilter;
    }

    public boolean isTariffValueFilter() {
        return tariffValueFilter;
    }

    public boolean isTarriffDaypaymodeFilter() {
        return tarriffDaypaymodeFilter;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceDescribe() {
        return serviceDescribe;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceDescribe(String serviceDescribe) {
        this.serviceDescribe = serviceDescribe;
    }

    public void setServiceState(boolean serviceState) {
        this.serviceState = serviceState;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isServiceState() {
        return serviceState;
    }
}

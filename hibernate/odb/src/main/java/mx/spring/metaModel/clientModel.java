package mx.spring.metaModel;

import java.util.ArrayList;
import java.util.List;

public class clientModel {

    public boolean clientDebt = false;
    public String clientName = "";

    public boolean clientBalance = false;
    public String serviceName = "";

    public String downDay = "--";
    public String downMonth = "--";
    public String downYearDl = "--";
    public String downYearFl = "--";

    public String upDay = "--";
    public String upMonth = "--";
    public String upYearDl = "--";
    public String upYearFl = "--";

    public String getUpDay() {
        return upDay;
    }

    public String getUpMonth() {
        return upMonth;
    }

    public String getUpYearDl() {
        return upYearDl;
    }

    public String getUpYearFl() {
        return upYearFl;
    }

    public void setUpDay(String upDay) {
        this.upDay = upDay;
    }

    public void setUpMonth(String upMonth) {
        this.upMonth = upMonth;
    }

    public void setUpYearDl(String upYearDl) {
        this.upYearDl = upYearDl;
    }

    public void setUpYearFl(String upYearFl) {
        this.upYearFl = upYearFl;
    }


    public String getDownYearFl() {
        return downYearFl;
    }

    public void setDownYearFl(String downYearFl) {
        this.downYearFl = downYearFl;
    }

    public String getDownYearDl() {
        return downYearDl;
    }

    public void setDownYearDl(String downYearDl) {
        this.downYearDl = downYearDl;
    }

    public String getDownMonth() {
        return downMonth;
    }

    public void setDownMonth(String downMonth) {
        this.downMonth = downMonth;
    }

    public void setDownDay(String downDay) {
        this.downDay = downDay;
    }

    public String getDownDay() {
        return downDay;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isClientBalance() {
        return clientBalance;
    }

    public void setClientBalance(boolean clientBalance) {
        this.clientBalance = clientBalance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public boolean getClientDebt() {
        return clientDebt;
    }

    public void setClientDebt(boolean clientDebt) {
        this.clientDebt = clientDebt;
    }

    public boolean isClientDebt() {
        return clientDebt;
    }
}

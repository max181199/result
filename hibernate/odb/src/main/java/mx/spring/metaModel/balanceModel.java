package mx.spring.metaModel;

public class balanceModel {

    public String balanceName = "";
    public float  balanceCount = 0;
    public String balanceDay = "--";
    public String balanceMonth = "--";
    public String balanceYearFP = "--";
    public String balanceYearSP = "--";

    public void setBalanceYearSP(String balanceYearSP) {
        this.balanceYearSP = balanceYearSP;
    }

    public void setBalanceYearFP(String balanceYearFP) {
        this.balanceYearFP = balanceYearFP;
    }

    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }

    public void setBalanceMonth(String balanceMonth) {
        this.balanceMonth = balanceMonth;
    }

    public void setBalanceDay(String balanceDay) {
        this.balanceDay = balanceDay;
    }

    public void setBalanceCount(float balanceCount) {
        this.balanceCount = balanceCount;
    }

    public String getBalanceYearSP() {
        return balanceYearSP;
    }

    public String getBalanceYearFP() {
        return balanceYearFP;
    }

    public String getBalanceName() {
        return balanceName;
    }

    public String getBalanceMonth() {
        return balanceMonth;
    }

    public String getBalanceDay() {
        return balanceDay;
    }


    public float getBalanceCount() {
        return balanceCount;
    }
}


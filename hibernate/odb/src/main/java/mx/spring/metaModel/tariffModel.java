package mx.spring.metaModel;

public class tariffModel {

    private float tariffCost;
    private float tariffValue;
    private boolean tariffDaypaymode;

    public void setTariffValue(float tariffValue) {
        this.tariffValue = tariffValue;
    }

    public void setTariffCost(float tariffCost) {
        this.tariffCost = tariffCost;
    }

    public void setTariffDaypaymode(boolean tariffDaypaymode) {
        this.tariffDaypaymode = tariffDaypaymode;
    }

    public float getTariffValue() {
        return tariffValue;
    }

    public float getTariffCost() {
        return tariffCost;
    }

    public boolean isTariffDaypaymode() {
        return tariffDaypaymode;
    }
}

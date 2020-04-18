package mx.spring.metaModel;

public class serviceModel {

    public String name = "";
    public String type = "";
    public int taf = 0;
    public boolean Tariff = false;
    public boolean actual = false;

    public void setTaf(int taf) {
        this.taf = taf;
    }

    public int getTaf() {
        return taf;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public boolean isActual() {
        return actual;
    }

    public void setTariff(boolean tariff) {
        Tariff = tariff;
    }


    public boolean getTariff() {
        return Tariff;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isTariff() {
        return Tariff;
    }
}

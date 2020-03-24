package pageEntity;

import org.hibernate.sql.Update;

public class clientPage {

    private String clientName;
    private float  clientBalance;
    private float  clientDebt;

    private int SecretKey;

    public void setSecretKey(int secretKey) {
        SecretKey = secretKey;
    }

    public int getSecretKey() {
        return SecretKey;
    }

    public void setClientBalance(float clientBalance) {
        this.clientBalance = clientBalance;
    }

    public float getClientBalance() {
        return clientBalance;
    }

    public void setClientDebt(float clientDebt) {
        this.clientDebt = clientDebt;
    }

    public float getClientDebt() {
        return clientDebt;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }


    @Override
    public String toString() {
        return "PageClients :: " + '\n' + "  " + "ClientName= " + clientName + ", balance= " + clientBalance +
                ", Debt= " + clientDebt + "  :: SECRET_KEY  ::   " + SecretKey+ '\n' ;
    }
}

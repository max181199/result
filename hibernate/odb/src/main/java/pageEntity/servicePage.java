package pageEntity;

import Factory.creatorSession;
import ent.*;
import org.hibernate.Session;

public class servicePage {

    private int ServiceSecretKey;

    public void setServiceSecretKey(int serviceSecretKey) {
        ServiceSecretKey = serviceSecretKey;
    }

    public int getServiceSecretKey() {
        return ServiceSecretKey;
    }

    private String ServiceName;

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getServiceName() {
        return ServiceName;
    }

    private String ServiceType;

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public boolean ServiceActual ;

    public void setServiceActual(boolean serviceActual) {
        ServiceActual = serviceActual;
    }

    public boolean isServiceActual() {
        return ServiceActual;
    }

    private tariffEntity ServiceTariff;

    public void setServiceTariff(tariffEntity serviceTariff) {
        ServiceTariff = serviceTariff;
    }

    public tariffEntity getServiceTariff() {
        return ServiceTariff;
    }

    @Override
    public String toString() {
        String result = "";
        result= result+ "ServicePage:: " + '\n' + "  " + "ServiceName=" + ServiceName + "  ServiceType=" + ServiceType
               + "  " + "ServiceActual=" + ServiceActual + "  :: SECRET :: " + ServiceSecretKey + '\n';
        result=result+ "    " + ServiceTariff + '\n';
        return result;
    }
}

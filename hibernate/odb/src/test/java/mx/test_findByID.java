package mx;

import org.junit.Test;
import org.testng.Assert;
import DAO.*;
import pageEntity.*;
import ent.*;

public class test_findByID {

    @Test
    public void dao_findByID_client_ent(){
        findById dao = new findById();
        clientEntity cle = dao.findClientById(1);
        Assert.assertEquals(cle.getId(),1);
        Assert.assertEquals(cle.getName(),"Milton Bostock");
    }
    @Test
    public void dao_findByID_account_ent(){
        findById dao = new findById();
        accountEntity ace = dao.findAccountById(1);
        Assert.assertEquals(ace.getId(),1);
    }
    @Test
    public void dao_findByID_contact_ent(){
        findById dao = new findById();
        contactEntity coe = dao.findContactById(1);
        Assert.assertEquals(coe.getId(),1);
        Assert.assertEquals(coe.getName(),"Milton Bostock");
    }
    @Test
    public void dao_findByID_phone_ent(){
        findById dao = new findById();
        phoneEntity phe = dao.findPhoneById(1);
        Assert.assertEquals(phe.getId(),1);
        Assert.assertEquals(phe.getPhone(),"8-800-555-3535");
    }
    @Test
    public void dao_findByID_email_ent(){
        findById dao = new findById();
        emailEntity phe = dao.findEmailById(1);
        Assert.assertEquals(phe.getId(),1);
        Assert.assertEquals(phe.getEmail(),"mil_bos@mail.ru");
    }
    @Test
    public void dao_findByID_addres_ent(){
        findById dao = new findById();
        addresEntity ade = dao.findAddressById(1);
        Assert.assertEquals(ade.getId(),1);
        Assert.assertEquals(ade.getAddres(),"75 Mill Pond Avenue North Bergen, NJ 07047");
    }
    @Test
    public void dao_findByID_tariff_ent(){
        findById dao = new findById();
        tariffEntity tae = dao.findTariffById(1);
        Assert.assertEquals(tae.getId(),1);
        Assert.assertEquals(tae.getDaypaymode(),true);
        Assert.assertEquals(tae.getState(),true);
    }
    @Test
    public void dao_findByID_service_ent(){
        findById dao = new findById();
        serviceEntity see = dao.findServiceById(1);
        Assert.assertEquals(see.getId(),1);
        Assert.assertEquals(see.getDescribe(), "INCREASE BALANCE");
        Assert.assertEquals(see.getName(),"BalanceUP");
        see = dao.findServiceById(3);
    }
    @Test
    public void dao_findByID_HistoryBalance_ent(){
        findById dao = new findById();
        historyBalanceEntity hbe = dao.findHistoryBalanceById(1);
        Assert.assertEquals(hbe.getId(),1);
    }
    @Test
    public void dao_findByID_HistoryService_ent(){
        findById dao = new findById();
        historyServiceEntity hse = dao.findHistoryServiceById(1);
        Assert.assertEquals(hse.getId(),1);
    }
}

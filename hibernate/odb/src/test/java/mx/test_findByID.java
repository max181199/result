package mx;

import org.junit.Test;
import org.junit.Assert;
import DAO.*;
import pageEntity.*;
import ent.*;

public class test_findByID {

    @Test
    public void dao_findByID_client_ent(){
        findById dao = new findById();
        clientEntity cle = dao.findClientById(1);
        Assert.assertEquals("CE",1,cle.getId());
        //Assert.assertEquals(cle.getId(),1,"dao_findByID_client_ent");
        Assert.assertEquals("CE-2","Milton Bostock",cle.getName());
        //Assert.assertEquals(cle.getName(),"Milton Bostock","dao_findByID_client_ent");
    }
    @Test
    public void dao_findByID_account_ent(){
        findById dao = new findById();
        accountEntity ace = dao.findAccountById(1);
        Assert.assertEquals("AE",1,ace.getId());
        //Assert.assertEquals(ace.getId(),1,"dao_findByID_account_ent");
    }
    @Test
    public void dao_findByID_contact_ent(){
        findById dao = new findById();
        contactEntity coe = dao.findContactById(1);
        Assert.assertEquals("CNE",1,coe.getId());
        //Assert.assertEquals(coe.getId(),1,"dao_findByID_contact_ent");
        Assert.assertEquals("CNE-2","Milton Bostock",coe.getName());
        //Assert.assertEquals(coe.getName(),"Milton Bostock","dao_findByID_contact_ent");
    }
    @Test
    public void dao_findByID_phone_ent(){
        findById dao = new findById();
        phoneEntity phe = dao.findPhoneById(1);
        Assert.assertEquals("PE",1,phe.getId());
        //Assert.assertEquals(phe.getId(),1,"dao_findByID_phone_ent");
        Assert.assertEquals("PE-2","8-800-555-3535",phe.getPhone());
        //Assert.assertEquals(phe.getPhone(),"8-800-555-3535","dao_findByID_phone_ent");
    }
    @Test
    public void dao_findByID_email_ent(){
        findById dao = new findById();
        emailEntity phe = dao.findEmailById(1);
        Assert.assertEquals("EE",1,phe.getId());
        //Assert.assertEquals(phe.getId(),1,"dao_findByID_email_ent");
        Assert.assertEquals("EE-2","mil_bos@mail.ru",phe.getEmail());
        //Assert.assertEquals(phe.getEmail(),"mil_bos@mail.ru","dao_findByID_email_ent");
    }
    @Test
    public void dao_findByID_addres_ent(){
        findById dao = new findById();
        addresEntity ade = dao.findAddressById(1);
        Assert.assertEquals("ADE",1,ade.getId());
        //Assert.assertEquals(ade.getId(),1,"dao_findByID_addres_ent");
        Assert.assertEquals("ADE-2","75 Mill Pond Avenue North Bergen, NJ 07047",ade.getAddres());
        //Assert.assertEquals(ade.getAddres(),"75 Mill Pond Avenue North Bergen, NJ 07047","dao_findByID_addres_ent");
    }
    @Test
    public void dao_findByID_tariff_ent(){
        findById dao = new findById();
        tariffEntity tae = dao.findTariffById(1);
        Assert.assertEquals("TE",1,tae.getId());
        //Assert.assertEquals(tae.getId(),1,"dao_findByID_tariff_ent");
        Assert.assertEquals("TE-2",true,tae.getDaypaymode());
        //Assert.assertEquals(tae.getDaypaymode(),true,"dao_findByID_tariff_ent");
        Assert.assertEquals("TE-3",true,tae.getState());
        //Assert.assertEquals(tae.getState(),true,"dao_findByID_tariff_ent");
    }
    @Test
    public void dao_findByID_service_ent(){
        findById dao = new findById();
        serviceEntity see = dao.findServiceById(1);
        Assert.assertEquals("SE",1,see.getId());
        //Assert.assertEquals(see.getId(),1,"dao_findByID_service_ent");
        Assert.assertEquals("SE-1","INCREASE BALANCE",see.getDescribe());
        //Assert.assertEquals(see.getDescribe(), "INCREASE BALANCE","dao_findByID_service_ent");
        Assert.assertEquals("SE-3","BalanceUP",see.getName());
        //Assert.assertEquals(see.getName(),"BalanceUP","dao_findByID_service_ent");
        see = dao.findServiceById(3);
    }
    @Test
    public void dao_findByID_HistoryBalance_ent(){
        findById dao = new findById();
        historyBalanceEntity hbe = dao.findHistoryBalanceById(1);
        Assert.assertEquals("HE",1,hbe.getId());
        //Assert.assertEquals(hbe.getId(),1,"dao_findByID_HistoryBalance_ent");
    }
    @Test
    public void dao_findByID_HistoryService_ent(){
        findById dao = new findById();
        historyServiceEntity hse = dao.findHistoryServiceById(1);
        Assert.assertEquals("HSE",1,hse.getId());
        //Assert.assertEquals(hse.getId(),1,"dao_findByID_HistoryService_ent");
    }
}

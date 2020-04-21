package mx.spring;


import DAO.*;
import mx.spring.metaModel.*;
import mx.spring.valid.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pageEntity.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyCtr {

    @RequestMapping(value = "/test",method= RequestMethod.GET)
    public String clientBaseRequest( ModelMap model){
        return "test";
    }

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String clientBase() {
        return "clientBase";
    }


    @RequestMapping(value = "/client/filter", method = RequestMethod.GET)
    public  String clientFilterTwo( ModelMap model){
        model.addAttribute("debt", "false");
        model.addAttribute("name","");
        model.addAttribute("balance","false");
        model.addAttribute("service","");
        model.addAttribute("c_model",new clientModel());

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("dateUp","--");
        model.addAttribute("dateDown","--");
        return "clientExtended";
    }

    @RequestMapping(value = "/client/filter", method = RequestMethod.POST)
    public String clientFilter(@ModelAttribute("c_model") @Validated clientModel clm, BindingResult result , ModelMap model) {

        clientValidate cv = new clientValidate();
        cv.validate(clm,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }

        if (clm.getClientDebt()){
            model.addAttribute("debt", "true");
        }
        else {
            model.addAttribute("debt", "false");
        }
        if (clm.isClientBalance()){
            model.addAttribute("balance","true");
        }
        else model.addAttribute("balance","false");
        model.addAttribute("name",clm.getClientName());
        model.addAttribute("service",clm.getServiceName());
        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);


        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        if ( clm.getDownDay().equals("--") || clm.getDownMonth().equals("--") || clm.getDownYearDl().equals("--") || clm.getDownYearFl().equals("--")){
            model.addAttribute("dateDown","--");
        }
        else {
            model.addAttribute("dateDown",clm.getDownDay() + '.' + clm.getDownMonth() +'.' + clm.getDownYearDl() + clm.getDownYearFl()  );
        }
//        model.addAttribute("dayDown",clm.getDownDay());
//        model.addAttribute("monthDown",clm.getDownMonth());
//        model.addAttribute("yearDownFl",clm.getDownYearFl());
//        model.addAttribute("yearDownDl",clm.getDownYearDl());
        if ( clm.getUpDay().equals("--") || clm.getUpMonth().equals("--") || clm.getUpYearDl().equals("--") || clm.getUpYearFl().equals("--")){
            model.addAttribute("dateUp","--");
        }
        else {
            model.addAttribute("dateUp",clm.getUpDay() + '.' + clm.getUpMonth() +'.' + clm.getUpYearDl() + clm.getUpYearFl()  );
        }
//        model.addAttribute("dayUp",clm.getUpDay());
//        model.addAttribute("monthUp",clm.getUpMonth());
//        model.addAttribute("yearUpDl",clm.getUpYearDl());
//        model.addAttribute("yearUpFl",clm.getUpYearFl());
        return "clientExtended";
    }

    @RequestMapping(value = "/client/person/{name}", method = RequestMethod.GET)
    public String oneCLP(@PathVariable("name") String name, ModelMap model ) {
        model.addAttribute("name",name);
        oneClientModel ocm = new oneClientModel();
        ocm.setClientName(name);
        generatorOneClientPage gen = new generatorOneClientPage();
        gen.setClientName(name);
        List<oneClientPage> tr = gen.getPageOneClient();
        oneClientPage ocp = null;
        for ( oneClientPage ent : tr){
            ocp = ent;
        }

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);


        ocm.setMax_credit_day(ocp.getMax_credit_day());
        ocm.setMax_credit_count(ocp.getMax_credit());

        ocm.setDownDay("--");
        ocm.setDownMonth("--");
        ocm.setDownYearFP("--");
        ocm.setDownYearSP("--");

        ocm.setUpDay("--");
        ocm.setUpMonth("--");
        ocm.setUpYearFP("--");
        ocm.setUpYearSP("--");

        ocm.setServiceName("");
        ocm.setServiceState(0);

        model.addAttribute("downDay","--");
        model.addAttribute("downMonth","--");
        model.addAttribute("downYearFP","--");
        model.addAttribute("downYearSP","--");
        model.addAttribute("upDay","--");
        model.addAttribute("upMonth","--");
        model.addAttribute("upYearFP","--");
        model.addAttribute("upYearSP","--");
        model.addAttribute("serviceName","");
        model.addAttribute("serviceState",(float) 0);

        model.addAttribute("o_model",ocm);
        return "oneClientExtended";
    }

    @RequestMapping( value = "/client/person/add", method = RequestMethod.GET)
    public String someName(ModelMap model){
        oneClientModel ocm = new oneClientModel();
        ocm.setMax_credit_count(0);
        ocm.setMax_credit_day(0);
        ocm.setClientName("");
        model.addAttribute("o_model",ocm);
        return "oneClientAdd";
    }

    @RequestMapping( value = "/client/person/add", method = RequestMethod.POST)
    public String someName2(@ModelAttribute("o_model") @Validated oneClientModel ent, BindingResult result,ModelMap model){

        oneClientAddValidate ocv = new oneClientAddValidate();
        ocv.validate(ent,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }

        oneClientPage ocp = new oneClientPage();
        ocp.setMax_credit_day(ent.getMax_credit_day());
        ocp.setMax_credit(ent.getMax_credit_count());
        ocp.setName(ent.getClientName());
        try{
            ocp.INSERT();
        }
        catch (Exception e){
            return "redirect:/error/" + "Name Already Use";
        }

        model.addAttribute("debt", "false");
        model.addAttribute("name","");
        model.addAttribute("balance","false");
        model.addAttribute("service","");
        model.addAttribute("c_model",new clientModel());

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("dateUp","--");
        model.addAttribute("dateDown","--");
        return "redirect:/start";
    }

    @RequestMapping( value = "/client/person/delete/{d_name}", method = RequestMethod.GET)
    public String SomeName3(@PathVariable("d_name") String d_name, ModelMap model){

        generatorOneClientPage gen = new generatorOneClientPage();
        gen.setClientName(d_name);
        List<oneClientPage> tr = gen.getPageOneClient();
        oneClientPage ocp = null;
        for ( oneClientPage ent : tr){
            ocp = ent;
        }
        ocp.DELETE();

        model.addAttribute("debt", "false");
        model.addAttribute("name","");
        model.addAttribute("balance","false");
        model.addAttribute("service","");
        model.addAttribute("c_model",new clientModel());

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("dateUp","--");
        model.addAttribute("dateDown","--");
        return "redirect:/start";
    }



    @RequestMapping(value = "/client/person/{name}", method = RequestMethod.POST)
    public String obeCLPEX(@PathVariable("name") String name,@ModelAttribute("o_model") @Validated oneClientModel ent, BindingResult result, ModelMap model ) {

        oneClientValidate ocv = new oneClientValidate();
        ocv.validate(ent,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }



        model.addAttribute("name",name);
        generatorOneClientPage gen = new generatorOneClientPage();
        gen.setClientName(name);
        boolean flag = false;
        List<oneClientPage> tr = gen.getPageOneClient();
        oneClientPage ocp = null;
        for ( oneClientPage et : tr){
            ocp = et;
        }
        if ( !ocp.getName().equals(ent.getClientName())){ flag=true; }
        ocp.setName(ent.getClientName());
        ocp.setMax_credit(ent.getMax_credit_count());
        ocp.setMax_credit_day(ent.getMax_credit_day());
        ocp.UPDATE();

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("downDay",ent.getDownDay());
        model.addAttribute("downMonth",ent.getDownMonth());
        model.addAttribute("downYearFP",ent.getDownYearFP());
        model.addAttribute("downYearSP",ent.getDownYearSP());
        model.addAttribute("upDay",ent.getUpDay());
        model.addAttribute("upMonth",ent.getUpMonth());
        model.addAttribute("upYearFP",ent.getUpYearFP());
        model.addAttribute("upYearSP",ent.getUpYearSP());
        model.addAttribute("serviceName",ent.getServiceName());
        model.addAttribute("serviceState",ent.getServiceState());

        if (flag){
        return "redirect:/client/person/" + ent.getClientName();}
        else {
            return "oneClientExtended";
        }
    }

    @RequestMapping(value = "/contact/{t_name}", method = RequestMethod.GET)
    public String SomeName4(@PathVariable("t_name") String v_name, ModelMap model){
        contactModel com = new contactModel();
        com.setContactName(v_name);
        com.setAddAdress("");
        com.setAddEmail("");
        com.setAddPhone("");
        generatorContactPage gen = new generatorContactPage();
        findById dao = new findById();
        gen.setContactName(v_name);
        for ( contactPage cop : gen.getPageContact()){
            model.addAttribute("backKey",dao.findClientById(cop.getClientKeyID()).getName());
        }
        model.addAttribute("c_model",com);
        model.addAttribute("absName",v_name);
        return "contactExtended";
    }

    @RequestMapping(value = "/contact/add/{newContact}",method = RequestMethod.POST)
    public String SomeName9(@PathVariable("newContact") String backPath,@ModelAttribute("c_model") contactModel ent, BindingResult result, ModelMap model){
        contactPage cop = new contactPage();
        cop.setContactName(ent.getContactName());
        generatorOneClientPage helgen = new generatorOneClientPage();
        helgen.setClientName(backPath);
        oneClientPage one = null;
        for ( oneClientPage ocp : helgen.getPageOneClient()){
            one = ocp;
        }
        cop.setClientKeyID(one.getSecretClientId());
        cop.INSERT();
        generatorContactPage gen = new generatorContactPage();
        gen.setContactName(ent.getContactName());

        for ( contactPage cp : gen.getPageContact()){
            if (!ent.getAddAdress().equals("")){
                cp.AddAddress(ent.getAddAdress());
            }
            if (!ent.getAddEmail().equals("")){
                cp.AddEmail(ent.getAddEmail());
            }
            if (!ent.getAddPhone().equals("")){
                cp.AddPhone(ent.getAddPhone());
            }
        }

        return "redirect:/client/person/" + backPath ;
    }

    @RequestMapping(value = "/contact/add/{newContact}",method = RequestMethod.GET)
    public String SomeName9(@PathVariable("newContact") String backPath, ModelMap model){
        contactModel com = new contactModel();
        com.setContactName("");
        com.setAddAdress("");
        com.setAddEmail("");
        com.setAddPhone("");
        model.addAttribute("backKey",backPath);
        model.addAttribute("c_model",com);
        return "contactAdd";
    }

    @RequestMapping(value = "/contact/phoneDelete/{name}/{value}",method = RequestMethod.GET)
    public String SomeName6(@PathVariable("name") String name, @PathVariable("value") String vc, ModelMap model){
        contactModel com = new contactModel();
        com.setContactName(name);
        com.setAddAdress("");
        com.setAddEmail("");
        com.setAddPhone("");
        generatorContactPage gen = new generatorContactPage();
        findById dao = new findById();
        gen.setContactName(name);
        for ( contactPage cop : gen.getPageContact()){
            model.addAttribute("backKey",dao.findClientById(cop.getClientKeyID()).getName());
            cop.DeletePhone(vc);
        }
        model.addAttribute("c_model",com);
        model.addAttribute("absName",name);
        return "contactExtended";
    }

    @RequestMapping(value = "/contact/emailDelete/{name}/{value}",method = RequestMethod.GET)
    public String SomeName7(@PathVariable("name") String name, @PathVariable("value") String vc, ModelMap model){
        contactModel com = new contactModel();
        com.setContactName(name);
        com.setAddAdress("");
        com.setAddEmail("");
        com.setAddPhone("");
        generatorContactPage gen = new generatorContactPage();
        findById dao = new findById();
        gen.setContactName(name);
        for ( contactPage cop : gen.getPageContact()){
            model.addAttribute("backKey",dao.findClientById(cop.getClientKeyID()).getName());
            cop.DeleteEmail(vc);
        }
        model.addAttribute("c_model",com);
        model.addAttribute("absName",name);
        return "contactExtended";
    }

    @RequestMapping(value = "/contact/addressDelete/{name}/{value}",method = RequestMethod.GET)
    public String SomeName8(@PathVariable("name") String name, @PathVariable("value") String vc, ModelMap model){
        contactModel com = new contactModel();
        com.setContactName(name);
        com.setAddAdress("");
        com.setAddEmail("");
        com.setAddPhone("");
        generatorContactPage gen = new generatorContactPage();
        findById dao = new findById();
        gen.setContactName(name);
        for ( contactPage cop : gen.getPageContact()){
            model.addAttribute("backKey",dao.findClientById(cop.getClientKeyID()).getName());
            cop.DeleteAddress(vc);
        }
        model.addAttribute("c_model",com);
        model.addAttribute("absName",name);
        return "contactExtended";
    }

    @RequestMapping(value = "/contact/delete/{p_name}",method = RequestMethod.GET)
    public String SomeName10(@PathVariable("p_name") String p_name,ModelMap model ){

        generatorContactPage gen3 = new generatorContactPage();
        findById dao = new findById();
        gen3.setContactName(p_name);
        String name = null;
        for ( contactPage copp : gen3.getPageContact()){
            name = dao.findClientById(copp.getClientKeyID()).getName();
            copp.DELETE();
        }

        return "redirect:/client/person/" + name ;
    }

    @RequestMapping(value = "/contact/{p_name}", method = RequestMethod.POST)
    public String SomeName5(@PathVariable("p_name") String p_name,@ModelAttribute("c_model") contactModel ent, BindingResult result,ModelMap model){
        generatorContactPage gen = new generatorContactPage();
        gen.setContactName(p_name);
        boolean flag = false;

        for ( contactPage cp : gen.getPageContact()){
            if (!ent.getAddAdress().equals("")){
                cp.AddAddress(ent.getAddAdress());
            }
            if (!ent.getAddEmail().equals("")){
                cp.AddEmail(ent.getAddEmail());
            }
            if (!ent.getAddPhone().equals("")){
                cp.AddPhone(ent.getAddPhone());
            }
            if ( !cp.getContactName().equals(ent.getContactName())){
                flag=true;
            }
            cp.setContactName(ent.getContactName());
            cp.UPDATE();
        }
        ent.setAddPhone("");
        ent.setAddEmail("");
        ent.setAddAdress("");
        generatorContactPage gen2 = new generatorContactPage();
        findById dao = new findById();
        gen2.setContactName(ent.getContactName());
        for ( contactPage cop : gen2.getPageContact()){
            model.addAttribute("backKey",dao.findClientById(cop.getClientKeyID()).getName());
        }
        model.addAttribute("absName",p_name);
        if (flag)
        { return "redirect:/contact/" + ent.getContactName();}

        return "contactExtended";
    }


    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String newSomeName(ModelMap model){
        serviceModel sem = new serviceModel();
        model.addAttribute("s_model",sem);
        model.addAttribute("s_state",false);
        model.addAttribute("s_name","");
        model.addAttribute("s_type","");
        model.addAttribute("s_taf",0);
        model.addAttribute("s_taf_fil",false);
        return "serviceExtended";
    }

    @RequestMapping(value = "/service",method = RequestMethod.POST)
    public String newSomeName1(@ModelAttribute("s_model") @Validated serviceModel ent, BindingResult result,ModelMap model){

        serviceValidate sev = new serviceValidate();
        sev.validate(ent,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }

        model.addAttribute("s_state",ent.isActual());
        model.addAttribute("s_name",ent.getName());
        model.addAttribute("s_type",ent.getType());
        model.addAttribute("s_taf",ent.getTaf());
        if(ent.getTaf() != 0){
            model.addAttribute("s_taf_fil",true);
        }
        else {
            model.addAttribute("s_taf_fil",false);
        }
        return "serviceExtended";
    }

    @RequestMapping(value = "/service/{serviceName}", method = RequestMethod.GET)
    public String newSomeName(@PathVariable("serviceName")String serviceName, ModelMap model){
        oneServiceModel osm = new oneServiceModel();
        generatorOneServicePage gen = new generatorOneServicePage();
        gen.setServiceName(serviceName);
        for (oneServicePage osp : gen.getPageOneService()){
            osm.setServiceDescribe(osp.getDescribe());
            osm.setServiceName(osp.getName());
            osm.setServiceState(osp.isActual());
            osm.setServiceType(osp.getType());
        }

        osm.setTariffCost(0);
        osm.setTariffDaypaymode(false);
        osm.setTariffId(0);
        osm.setTariffValue(0);
        osm.setTariffActual(false);
        osm.setTariffDataDay("--");
        osm.setTariffDataMonth("--");
        osm.setTariffDataYearFP("--");
        osm.setTariffDataYearSP("--");
        model.addAttribute("os_model",osm);
        model.addAttribute("tariffId",0);
        model.addAttribute("tariffIdFilter",false);
        model.addAttribute("tariffActual",false);
        model.addAttribute("tariffActualFilter",false);
        model.addAttribute("tariffCost",(float) 0);
        model.addAttribute("tariffCostFilter",false);
        model.addAttribute("tariffDaypaymode",false);
        model.addAttribute("tariffDaypaymodeFilter",false);
        model.addAttribute("tariffValue",(float) 0);
        model.addAttribute("tariffValueFilter",false);
        model.addAttribute("tariffDataDay","--");
        model.addAttribute("tariffDataMonth","--");
        model.addAttribute("tariffDataYearFP","--");
        model.addAttribute("tariffDataYearSP","--");
        model.addAttribute("tariffDataFilter",false);

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("os_model",osm);
        model.addAttribute("absName",serviceName);
        return "oneService";
    }

    @RequestMapping(value = "/service/{serviceName}",method = RequestMethod.POST)
    public String newSomeName1(@PathVariable("serviceName")String serviceName,@ModelAttribute("os_model") @Validated oneServiceModel ent, BindingResult result,ModelMap model){

        oneServiceValidate osv = new oneServiceValidate();
        osv.validate(ent,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }

        generatorOneServicePage gen = new generatorOneServicePage();
        gen.setServiceName(serviceName);
        for (oneServicePage osp : gen.getPageOneService()){
           osp.setName(ent.getServiceName());
           osp.setActual(ent.isServiceState());
           osp.setDescribe(ent.getServiceDescribe());
           osp.setType(ent.getServiceType());
           osp.UPDATE();
        }

        model.addAttribute("tariffId",ent.getTariffId());
        model.addAttribute("tariffIdFilter",ent.isTariffIdFilter());
        model.addAttribute("tariffActual",ent.isTariffActual());
        model.addAttribute("tariffActualFilter",ent.isTariffActualFilter());
        model.addAttribute("tariffCost",ent.getTariffCost());
        model.addAttribute("tariffCostFilter",ent.isTariffCostFilter());
        model.addAttribute("tariffDaypaymode",ent.isTariffDaypaymode());
        model.addAttribute("tariffDaypaymodeFilter",ent.isTarriffDaypaymodeFilter());
        model.addAttribute("tariffValue",ent.getTariffValue());
        model.addAttribute("tariffValueFilter",ent.isTariffValueFilter());
        model.addAttribute("tariffDataDay",ent.getTariffDataDay());
        model.addAttribute("tariffDataMonth",ent.getTariffDataMonth());
        model.addAttribute("tariffDataYearFP",ent.getTariffDataYearFP());
        model.addAttribute("tariffDataYearSP", ent.getTariffDataYearSP());
        model.addAttribute("tariffDataFilter",ent.isTariffDataFilter());

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);
        model.addAttribute("absName",ent.getServiceName());
        return "oneService";
    }

    @RequestMapping(value = "/service/add", method = RequestMethod.GET)
    public String newSomeName3( ModelMap model ){
        oneServiceModel osm = new oneServiceModel();
            osm.setServiceDescribe("");
            osm.setServiceName("");
            osm.setServiceState(false);
            osm.setServiceType("");
            model.addAttribute("os_model",osm);

        return "oneServiceAdd";
    }

    @RequestMapping(value = "/service/add",method = RequestMethod.POST)
    public String newSomeName7(@ModelAttribute("os_model") oneServiceModel ent, BindingResult result,ModelMap model){

        oneServicePage osp = new oneServicePage();
        osp.setType(ent.getServiceType());
        osp.setDescribe(ent.getServiceDescribe());
        osp.setName(ent.getServiceName());
        osp.setActual(ent.isServiceState());
        osp.INSERT();

        return "redirect:/service";
    }

    @RequestMapping(value = "/service/delete/{serviceName}", method = RequestMethod.GET)
    public String newSomeName34( @PathVariable("serviceName") String serviceName ,ModelMap model ){
        generatorOneServicePage gen = new generatorOneServicePage();
        gen.setServiceName(serviceName);
        for (oneServicePage osp : gen.getPageOneService()){
            osp.DELETE();
        }
        return "redirect:/service";
    }

    @RequestMapping(value = "/service/tariff/{id}", method = RequestMethod.GET)
    public String newSomeName56( @PathVariable("id") int id,ModelMap model){
        tariffModel tam = new tariffModel();
        String bacck = "none";
        findById dao = new findById();
        generatorTariffPage gen = new generatorTariffPage();
        gen.setTariffId(id);
        for (tariffPage tap : gen.getPageTariff()){
            tam.setTariffCost(tap.getTariffCost());
            tam.setTariffValue(tap.getTariffValue());
            tam.setTariffDaypaymode(tap.isTariffDaypaymode());
            bacck= dao.findServiceById(tap.getServiceKeyId()).getName();
        }
        model.addAttribute("t_model",tam);
        model.addAttribute("absName",bacck);
        return "tariff";
    }

    @RequestMapping(value = "/service/tariff/{id}", method = RequestMethod.POST)
    public String newSomeName56( @PathVariable("id") int id,@ModelAttribute("f_model") tariffModel ent, BindingResult result,ModelMap model){
        tariffPage tp = new tariffPage();
        String bacck = "null";
        findById dao = new findById();
        generatorTariffPage gen = new generatorTariffPage();
        gen.setTariffId(id);
        for (tariffPage tap : gen.getPageTariff()){
            bacck= dao.findServiceById(tap.getServiceKeyId()).getName();
            tp.setTariffCost(ent.getTariffCost());
            tp.setTariffDaypaymode(ent.isTariffDaypaymode());
            tp.setTariffValue(ent.getTariffValue());
            tp.setServiceKeyId(tap.getServiceKeyId());
            tp.INSERT();
        }
        model.addAttribute("absName",bacck);
        return "redirect:/service/" + bacck;
    }


    @RequestMapping(value = "/service/tariff/add/{serviceName}", method = RequestMethod.GET)
    public String newSomeName56( @PathVariable("serviceName") String serviceName,ModelMap model){
        tariffModel tam = new tariffModel();
        tam.setTariffDaypaymode(false);
        tam.setTariffValue(0);
        tam.setTariffCost(0);
        model.addAttribute("t_model",tam);
        model.addAttribute("absName",serviceName);
        return "tariffAdd";
    }

    @RequestMapping(value = "/service/tariff/add/{serviceName}", method = RequestMethod.POST)
    public String newSomeName56( @PathVariable("serviceName") String serviceName,@ModelAttribute("f_model") tariffModel ent, BindingResult result,ModelMap model){
        tariffPage tp = new tariffPage();
        generatorOneServicePage gen = new generatorOneServicePage();
        gen.setServiceName(serviceName);
        for ( oneServicePage osp : gen.getPageOneService())
        {
            tp.setTariffCost(ent.getTariffCost());
            tp.setTariffDaypaymode(ent.isTariffDaypaymode());
            tp.setTariffValue(ent.getTariffValue());
            tp.setServiceKeyId(osp.getSecretKey());
            tp.INSERT();
        }

        model.addAttribute("absName",serviceName);
        return "redirect:/service/" + serviceName;
    }

    @RequestMapping( value = "/client/balance/{clientName}", method = RequestMethod.GET)
    public String PerfectName( @PathVariable("clientName") String clientName, ModelMap model){
        balanceModel bal = new balanceModel();
        bal.setBalanceCount(0);
        bal.setBalanceDay("--");
        bal.setBalanceMonth("--");
        bal.setBalanceYearFP("--");
        bal.setBalanceYearSP("--");
        bal.setBalanceName("");

        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("balanceName","");
        model.addAttribute("balanceCount",(float)0);
        model.addAttribute("balanceDay","--");
        model.addAttribute("balanceMonth","--");
        model.addAttribute("balanceYearFP","--");
        model.addAttribute("balanceYearSP","--");
        model.addAttribute("b_model",bal);
        model.addAttribute("absName",clientName);
        return "balance";
    }

    @RequestMapping( value = "/client/balance/{clientName}", method = RequestMethod.POST)
    public String PerfectName( @PathVariable("clientName") String clientName,@ModelAttribute("b_model") @Validated balanceModel ent, BindingResult result, ModelMap model){

        balanceValidate bav = new balanceValidate();
        bav.validate(ent,result);
        if (result.hasErrors()){
            List<FieldError> errorList = new ArrayList<FieldError>();
            String mistake = "NONE";
            errorList = result.getFieldErrors();
            for(FieldError fer : errorList){
                mistake = (String) fer.getDefaultMessage();
            }
            return "redirect:/error/" + mistake;
        }


        List<String> AllDay = new ArrayList<String>();
        for ( int i=1;i <= 31; i++ ){
            AllDay.add(String.valueOf(i));
        }
        AllDay.add("--");
        model.addAttribute("ListDay",AllDay);

        List<String> AllMonth = new ArrayList<String>();
        for ( int i=1;i <= 12; i++ ){
            AllMonth.add(String.valueOf(i));
        }
        AllMonth.add("--");
        model.addAttribute("ListMonth",AllMonth);

        List<String> AllYear = new ArrayList<String>();
        for ( int i=0;i <= 20; i++ ){
            AllYear.add(String.valueOf(i));
        }
        AllYear.add("--");
        model.addAttribute("ListYear",AllYear);

        model.addAttribute("balanceName",ent.getBalanceName());
        model.addAttribute("balanceCount",ent.getBalanceCount());
        model.addAttribute("balanceDay",ent.getBalanceDay());
        model.addAttribute("balanceMonth",ent.getBalanceMonth());
        model.addAttribute("balanceYearFP",ent.getBalanceYearFP());
        model.addAttribute("balanceYearSP",ent.getBalanceYearSP());
        model.addAttribute("absName",clientName);
        return "balance";
    }

    @RequestMapping( value = "/connect/{clientId}", method = RequestMethod.GET)
    public String evil( @PathVariable("clientId") int clientId,ModelMap model){
        connectModel com = new connectModel();
        com.setCustomValue(0);
        model.addAttribute("c_model",com);
        model.addAttribute("serviceId",0);
        model.addAttribute("clientId",clientId);
        return "connect";
    }

    @RequestMapping( value = "/connect/add/{clientId}/{serviceId}", method = RequestMethod.POST)
    public String evil2( @PathVariable("clientId") int clientId,@PathVariable("serviceId") int serviceId,
                         @ModelAttribute("c_model") connectModel ent, BindingResult result, ModelMap model ){
        generatorConnectPage gen = new generatorConnectPage();
        gen.setClinetBacklID(clientId);
        for(connectPage cop : gen.getPageConnect()){
            cop.setAddClientId(clientId);
            cop.setAddServiceId(serviceId);
            cop.setNewValue(ent.getCustomValue());
            if( ent.getCustomValue() != 0 ){
                cop.setNewValueSet(true);
            }
            cop.AddNewService();
        }
        return "redirect:/connect/" + clientId;
    }

    @RequestMapping( value = "/connect/delete/{clientId}/{historyId}",method = RequestMethod.GET)
    public String evil3 ( @PathVariable("clientId") int clientId, @PathVariable("historyId") int historyId,ModelMap model ){
        generatorConnectPage gen = new generatorConnectPage();
        gen.setClinetBacklID(clientId);
        for ( connectPage cop : gen.getPageConnect()){
            cop.RemoteService(historyId);
        }
        return "redirect:/connect/" + clientId;
    }

    @RequestMapping( value = "error/{text}", method = RequestMethod.GET)
    public String Error ( @PathVariable("text") String text, ModelMap model){
        model.addAttribute("text",text);
        return "error";
    }

    @RequestMapping( value = "/start", method = RequestMethod.GET)
    public String Start(){
        return "redirect:/client/filter";
    }

}

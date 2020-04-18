package mx.spring.metaModel;

public class contactModel {

    public String contactName="";
    public String addAdress = "";
    public String addPhone = "";
    public String addEmail = "";

    public void setAddEmail(String addEmail) {
        this.addEmail = addEmail;
    }

    public void setAddPhone(String addPhone) {
        this.addPhone = addPhone;
    }

    public String getAddEmail() {
        return addEmail;
    }

    public String getAddPhone() {
        return addPhone;
    }

    public void setAddAdress(String addAdress) {
        this.addAdress = addAdress;
    }

    public String getAddAdress() {
        return addAdress;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

}

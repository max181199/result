package ent;

import javax.persistence.*;
import java.lang.String;
import ent.contactEntity;

@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=10000000)
@Table( name = "addres")
public class addresEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq"  )
    @Column(name = "addres_id")
    private int id;

    @ManyToOne
    @JoinColumn( name = "contact_id", nullable = false)
    private contactEntity contact;

    @Column( name = "addres" , nullable = false, length = 255)
    private String addres;

    public contactEntity getContact() {
        return contact;
    }

    public void setContact(contactEntity contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public addresEntity() {};

    @Override
    public String toString() {
        return "EntityAddressContact::{" + "id=" + id + ", contact_id=" + contact.getId() + ", addres=" + addres
                + " }";
    }
}

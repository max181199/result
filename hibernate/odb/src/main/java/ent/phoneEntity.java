package ent;

import javax.persistence.*;
import java.lang.String;
import ent.contactEntity;

@Entity
@SequenceGenerator(name="seq7", initialValue=10, allocationSize=10000000)
@Table( name = "phone")

public class phoneEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq7"  )
    @Column(name = "phone_id")
    private int id;


    @ManyToOne
    @JoinColumn( name = "contact_id", nullable = false)
    private contactEntity contact;

    @Column( name = "phone" , nullable = false, length = 255)
    private String phone;


    public phoneEntity() {};

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public contactEntity getContact() {
        return contact;
    }

    public void setContact(contactEntity contact) {
        this.contact = contact;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "EntityPhoneContact::{" + "id=" + id + ", contact_id=" + contact.getId() + ", phone=" + phone
                + " }";
    }
}

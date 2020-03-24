package ent;

import javax.persistence.*;
import java.lang.String;
import ent.contactEntity;

@Entity
@Table( name = "email" )
public class emailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id")
    private int id;

    @Column( name = "email" , length = 255, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn( name = "contact_id", nullable = false)
    private contactEntity contact;

    public emailEntity() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setContact(contactEntity contact) {
        this.contact = contact;
    }

    public contactEntity getContact() {
        return contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EntityEmailContact::{" + "id=" + id + ", contact_id=" + contact.getId() + ", email=" + email
                + " }";
    }

}

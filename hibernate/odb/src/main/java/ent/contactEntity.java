package ent;

import javax.persistence.*;
import java.lang.String;
import java.util.Set;

import ent.clientEntity;
import ent.phoneEntity;
import ent.addresEntity;
import ent.emailEntity;

@Entity
@SequenceGenerator(name="seq3", initialValue=10, allocationSize=10000000)
@Table( name = "contact")
public class contactEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq3"  )
    @Column(name = "contact_id")
    private int id;

    @Column( name = "name" , nullable = false, unique = true, length = 255)
    private String name;

    @ManyToOne
    @JoinColumn( name = "client_id", nullable = false)
    private clientEntity client;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "contact")
    private Set<phoneEntity> phone;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "contact")
    private Set<addresEntity> addres;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "contact")
    private Set<emailEntity> email;

    public Set<phoneEntity> getPhone() {
        return phone;
    }

    public void setPhone(Set<phoneEntity> phone) {
        this.phone = phone;
    }

    public contactEntity() {}

    public void setEmail(Set<emailEntity> email) {
        this.email = email;
    }

    public Set<emailEntity> getEmail() {
        return email;
    }

    public Set<addresEntity> getAddres() {
        return addres;
    }

    public void setAddres(Set<addresEntity> addres) {
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public clientEntity getClient() {
        return client;
    }

    public void setClient(clientEntity client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "EntityContact::{" + "contact_id=" + id +  ", client.id" + client.getId() +
                ", name='" + name + '\''
                + '}';
    }

}

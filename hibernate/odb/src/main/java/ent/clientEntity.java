package ent;

import javax.persistence.*;
import java.lang.String;
import java.util.Set;


@Entity
@SequenceGenerator(name="seq2", initialValue=10, allocationSize=10000000)
@Table( name = "client")
public class clientEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq2"  )
    @Column(name = "client_id")
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "max_credit", nullable = false)
    private float max_credit;

    @Column(name = "max_credit_day", nullable = false, length = 10)
    private float max_credit_day;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private accountEntity account;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "client")
    private Set<contactEntity> contact;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "client")
    private Set<historyServiceEntity> history_service;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "client")
    private Set<historyBalanceEntity> history_balance;

    public Set<historyServiceEntity> getHistory_service() {
        return history_service;
    }

    public void setHistory_service(Set<historyServiceEntity> history_service) {
        this.history_service = history_service;
    }

    public Set<historyBalanceEntity> getHistory_balance() {
        return history_balance;
    }

    public void setHistory_balance(Set<historyBalanceEntity> history_balance) {
        this.history_balance = history_balance;
    }

    public Set<contactEntity> getContact() {
        return contact;
    }

    public void setContact(Set<contactEntity> contact) {
        this.contact = contact;
    }

    public void setContacts(Set<contactEntity> contacts) {
        this.contact = contacts;
    }

    public Set<contactEntity> getContacts() {
        return contact;
    }

    public void setAccount(accountEntity acc) {
        this.account = acc;
    }

    public accountEntity getAccount() {
    return account;
   }

    public clientEntity() {};

    public int getId() {
        return id;
    }

    public float getMax_credit() {
        return max_credit;
    }

    public float getMax_credit_day() {
        return max_credit_day;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMax_credit(float max_credit) {
        this.max_credit = max_credit;
    }

    public void setMax_credit_day(float max_credit_day) {
        this.max_credit_day = max_credit_day;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntityClient::{" + "id=" + id + ", name='" + name + '\''
                + ", max_credit=" + max_credit + ", max_credit_day=" + max_credit_day + '}';
    }

}
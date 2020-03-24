package ent;

import javax.persistence.*;
import java.lang.String;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table( name = "account")
public class accountEntity {

    @Id
    @Column( name = "client_id",unique = true, nullable = false)
    private int id;

    @Column( name = "balance" , nullable = false)
    private float balance;

    @Column ( name = "credit_day", nullable = false)
    private float credit_day;

    @OneToOne(mappedBy="account", cascade=CascadeType.ALL)
    private clientEntity cle;

    public void setCle(clientEntity cle) {
        this.cle = cle;
    }

    public clientEntity getCle() {
        return cle;
    }

    public accountEntity() {};

    public void setId(int client_id) {
        this.id = client_id;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public float getCredit_day() {
        return credit_day;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCredit_day(float credit_day) {
        this.credit_day = credit_day;
    }

    @Override
    public String toString() {
        return "EntityAccount::{" + "id=" + id + ", balance=" + balance +
                ", credit_day=" + credit_day + '}';
    }

}

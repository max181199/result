package ent;

import javax.persistence.*;
import java.lang.String;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import ent.clientEntity;
import ent.serviceEntity;

@Entity
@SequenceGenerator(name="seq5", initialValue=20, allocationSize=10000000)
@Table( name = "balance_history")
public class historyBalanceEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq5"  )
    @Column(name = "history_id")
    private int id;

    @ManyToOne
    @JoinColumn( name = "service_id", nullable = false)
    private serviceEntity service;

    @ManyToOne
    @JoinColumn( name = "client_id", nullable = false)
    private clientEntity client;

    @Column( name = "summ" , nullable = false)
    private float summ;

    @Column( name = "operation_time", nullable = false)
    private Date op_time;

    public void setClient(clientEntity client) {
        this.client = client;
    }

    public clientEntity getClient() {
        return client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setService(serviceEntity service) {
        this.service = service;
    }

    public serviceEntity getService() {
        return service;
    }

    public void setOp_time(Date op_time) {
        this.op_time = op_time;
    }

    public Date getOp_time() {
        return op_time;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }

    public float getSumm() {
        return summ;
    }

    @Override
    public String toString() {
        return "EntityHistoryBalance::{" + "balance_history_id=" + id + ", client_id=" + client.getId()  +
                ", service_id=" + service.getId() + ", op_time=" + op_time
                + ", summ=" + summ +  '}';
    }


}

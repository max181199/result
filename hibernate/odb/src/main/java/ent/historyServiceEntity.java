package ent;

import javax.persistence.*;
import java.lang.String;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import ent.clientEntity;
import ent.serviceEntity;

@Entity
@SequenceGenerator(name="seq6", initialValue=20, allocationSize=10000000)
@Table( name = "service_history")
public class historyServiceEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq6"  )
    @Column(name = "history_id")
    private int id;

    @ManyToOne
    @JoinColumn( name = "service_id", nullable = false)
    private serviceEntity service;

    @ManyToOne
    @JoinColumn( name = "client_id", nullable = false)
    private clientEntity client;

    @Column( name = "state" , nullable = false)
    private float state;

    @Column( name = "begin_time", nullable = false)
    private Date begin_time;

    @Column( name = "end_time", nullable = true)
    private Date end_time;

    public void setService(serviceEntity service) {
        this.service = service;
    }

    public serviceEntity getService() {
        return service;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setClient(clientEntity client) {
        this.client = client;
    }

    public clientEntity getClient() {
        return client;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setState(float state) {
        this.state = state;
    }

    public float getState() {
        return state;
    }

    @Override
    public String toString() {
        return "EntityHistoryService::{" + "service_history_id=" + id + ", client_id=" + client.getId()  +
                ", service_id=" + service.getId() + ", begin_time=" + begin_time + ", end_time=" + end_time
                + ", state=" + state +  '}';
    }


}

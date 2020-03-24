package ent;

import javax.persistence.*;
import java.lang.String;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(
        name = "tariff",
        uniqueConstraints = {
                @UniqueConstraint( name = "tariff-createTime", columnNames = {"service_id"}),
                @UniqueConstraint(name = "tariff-service", columnNames = {"create_time"})
        }
)
public class tariffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tariff_id")
    private int id;

    @Column( name = "cost", nullable = false)
    private float cost;

    @Column( name = "state", nullable = false)
    private boolean state;

    @Column( name = "daypaymode" , nullable = false)
    private boolean daypaymode;

    @Column( name = "create_time", nullable = false)
    private Timestamp create_time;

    @Column( name = "value", nullable = false)
    private float value;

    @ManyToOne
    @JoinColumn( name = "service_id", nullable = false)
    private serviceEntity service;

    public void setService(serviceEntity service) {
        this.service = service;
    }

    public serviceEntity getService() {
        return service;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setDaypaymode(boolean daypaymode) {
        this.daypaymode = daypaymode;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getDaypaymode() {
        return daypaymode;
    }

    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "EntityTariff::{" + "tariff_id=" + id +  ", cost=" + cost
                + ", state=" + state + ", daypaymode=" + daypaymode + ", value=" + value
                + ",create_time=" + create_time + '}';
    }

}

package ent;

import javax.persistence.*;
import java.lang.String;
import java.util.Set;

@Entity
@Table( name = "service")
public class serviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private int id;

    @Column( name = "type", nullable = false, length = 32)
    private String type;

    @Column( name="describe",nullable = false)
    private String describe;

    @Column( name = "name", nullable = false, unique = true)
    private String name;

    @Column( name = "state", nullable = false)
    private boolean state;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "service")
    private Set<tariffEntity> tariff;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "service")
    private Set<historyServiceEntity> historyService;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "service")
    private Set<historyBalanceEntity> balanceService;

    public void setHistoryService(Set<historyServiceEntity> historyService) {
        this.historyService = historyService;
    }

    public Set<historyServiceEntity> getHistoryService() {
        return historyService;
    }

    public void setTariff(Set<tariffEntity> tariff) {
        this.tariff = tariff;
    }

    public Set<tariffEntity> getTariff() {
        return tariff;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState(){
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Set<historyBalanceEntity> getBalanceService() {
        return balanceService;
    }

    public void setBalanceService(Set<historyBalanceEntity> balanceService) {
        this.balanceService = balanceService;
    }

    @Override
    public String toString() {
        return "EntityService::{" + "service_id=" + id +  ", type=" + type
                + ", state=" + state + ", describe=" + describe + ", name=" + name
                +  '}';
    }
}

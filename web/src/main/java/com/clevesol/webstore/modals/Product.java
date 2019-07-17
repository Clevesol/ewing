package com.clevesol.webstore.modals;
//*************************
//  package com.clevesol.webstore.modals 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 3:11 PM 
//   (Thu of Jul  2019)
//*************************

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Product {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column
    private String name;
    @Column
    private int selPrice;
    @Column
    private int buyPrice;
    @Column
    private int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSelPrice() {
        return selPrice;
    }

    public void setSelPrice(int selPrice) {
        this.selPrice = selPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

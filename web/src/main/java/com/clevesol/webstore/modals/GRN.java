package com.clevesol.webstore.modals;
//*************************
//  package com.clevesol.webstore.modals 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 3:11 PM 
//   (Thu of Jul  2019)
//*************************

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "grn" )
public class GRN {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column private long grn_item;
    @Column private int quantity;

    @Column private Date received;
    @Column private Date payed;
    @Column private int grn_total;
    @Column int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGrn_item() {
        return grn_item;
    }

    public void setGrn_item(long grn_item) {
        this.grn_item = grn_item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public Date getPayed() {
        return payed;
    }

    public void setPayed(Date payed) {
        this.payed = payed;
    }

    public int getGrn_total() {
        return grn_total;
    }

    public void setGrn_total(int grn_total) {
        this.grn_total = grn_total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

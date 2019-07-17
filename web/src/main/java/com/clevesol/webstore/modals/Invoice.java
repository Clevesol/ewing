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
@Table(name = "invoice")
public class Invoice {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column
    private int invoice_item;
    @Column
    private int quantity;
    @Column
    Date issued;
    @Column
    private Date billed;
    @Column
    private int invoice_val;
    @Column
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInvoice_item() {
        return invoice_item;
    }

    public void setInvoice_item(int invoice_item) {
        this.invoice_item = invoice_item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public Date getBilled() {
        return billed;
    }

    public void setBilled(Date billed) {
        this.billed = billed;
    }

    public int getInvoice_val() {
        return invoice_val;
    }

    public void setInvoice_val(int invoice_val) {
        this.invoice_val = invoice_val;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

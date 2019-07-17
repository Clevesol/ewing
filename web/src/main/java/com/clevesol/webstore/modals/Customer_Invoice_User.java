package com.clevesol.webstore.modals;
//*************************
//  package com.clevesol.webstore.modals 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 4:12 PM 
//   (Thu of Jul  2019)
//*************************


import javax.persistence.*;

@Entity
@Table(name = "cus_cachier_invoice" )
public class Customer_Invoice_User {


    @Id
    @GeneratedValue
    @Column(name = "")
    private long id;

    @Column
    private long cus;

    @Column
    private long sysuser;

    @Column
    private long invoice;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCus() {
        return cus;
    }

    public void setCus(long cus) {
        this.cus = cus;
    }

    public long getSysuser() {
        return sysuser;
    }

    public void setSysuser(long sysuser) {
        this.sysuser = sysuser;
    }

    public long getInvoice() {
        return invoice;
    }

    public void setInvoice(long invoice) {
        this.invoice = invoice;
    }
}

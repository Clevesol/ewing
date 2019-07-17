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
@Table(name = "customer" )
public class Customer {


    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column
    private String fname;

    @Column
    private String lname;

    @Column
    private String phone_number;

    @Column
    private int status;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}



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
@Table(name = "supplier")
public class Supplier {

    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;


    @Column
    private String name;
    @Column
    private String adress;
    @Column
    private String phonenum;
    @Column
    private String email;
    @Column
    private int status;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

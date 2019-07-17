package com.clevesol.webstore.modals;
//*************************
//  package com.clevesol.webstore.modals 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 4:16 PM 
//   (Thu of Jul  2019)
//*************************


import javax.persistence.*;

@Entity
@Table( name = "cus_supplier_skeeper")
public class Supplier_GRN_Skeeper {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private long sup;

    @Column
    private long skeeper;

    @Column
    private long grn;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSup() {
        return sup;
    }

    public void setSup(long sup) {
        this.sup = sup;
    }

    public long getSkeeper() {
        return skeeper;
    }

    public void setSkeeper(long skeeper) {
        this.skeeper = skeeper;
    }

    public long getGrn() {
        return grn;
    }

    public void setGrn(long grn) {
        this.grn = grn;
    }
}

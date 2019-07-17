package com.clevesol.webstore.controllers;

import com.clevesol.webstore.modals.Supplier;
import com.clevesol.webstore.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//*************************
//  package com.clevesol.webstore.controllers 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 3:05 PM 
//   (Thu of Jul  2019)
//*************************


;

@RestController
@RequestMapping("Supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepo;


    @GetMapping
    public Supplier index(@RequestParam long supplierId){

        return this.supplierRepo.findById(supplierId).get();
    }
}

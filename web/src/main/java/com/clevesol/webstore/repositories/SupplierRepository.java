package com.clevesol.webstore.repositories;


//*************************
//  package com.clevesol.webstore.repositories 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 3:33 PM 
//   (Thu of Jul  2019)
//*************************


;

import com.clevesol.webstore.modals.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

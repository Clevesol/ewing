package com.clevesol.webstore.repositories;


//*************************
//  package com.clevesol.webstore.repositories 
//  @author DMS_Selvaduraih         
//                          
//  @created 7/4/2019 : 3:33 PM 
//   (Thu of Jul  2019)
//*************************


;

import com.clevesol.webstore.modals.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}

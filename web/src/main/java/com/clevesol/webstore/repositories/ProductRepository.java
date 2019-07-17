package com.clevesol.webstore.repositories;
//*************************
//  package com.clevesol.webstore.repositories
//  @author DMS_Selvaduraih
// 
//  @created 7/4/2019 : 3:13 PM
//   (Thu of Jul  2019)
//*************************

        import com.clevesol.webstore.modals.Product;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

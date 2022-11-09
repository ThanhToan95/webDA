package com.webstore.h4.repositoty;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webstore.h4.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
    @Query(value = "select * From products p WHERE p.category_id =? LIMIT 6", nativeQuery=true)
    List<Product> findLimit(String category_id);
}

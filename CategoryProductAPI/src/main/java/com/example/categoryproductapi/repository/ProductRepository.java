
package com.example.categoryproductapi.repository;

import com.example.categoryproductapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

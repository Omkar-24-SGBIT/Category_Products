
package com.example.categoryproductapi.repository;

import com.example.categoryproductapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

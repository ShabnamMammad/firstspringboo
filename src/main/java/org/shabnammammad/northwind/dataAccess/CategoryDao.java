package org.shabnammammad.northwind.dataAccess;

import org.shabnammammad.northwind.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}

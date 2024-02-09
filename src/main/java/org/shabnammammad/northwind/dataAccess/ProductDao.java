package org.shabnammammad.northwind.dataAccess;

import org.shabnammammad.northwind.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {


}

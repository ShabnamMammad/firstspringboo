package org.shabnammammad.northwind.business.abstracts;

import org.shabnammammad.northwind.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}

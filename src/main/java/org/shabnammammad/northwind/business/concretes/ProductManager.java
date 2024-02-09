package org.shabnammammad.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.shabnammammad.northwind.business.abstracts.ProductService;
import org.shabnammammad.northwind.dataAccess.ProductDao;
import org.shabnammammad.northwind.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}

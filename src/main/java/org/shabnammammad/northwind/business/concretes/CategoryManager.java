package org.shabnammammad.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.shabnammammad.northwind.business.abstracts.CategoryService;
import org.shabnammammad.northwind.business.abstracts.ProductService;
import org.shabnammammad.northwind.dataAccess.CategoryDao;
import org.shabnammammad.northwind.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    @Override
    public List<Category> getAll() {
        return this.categoryDao.findAll();
    }
}

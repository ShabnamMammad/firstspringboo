package org.shabnammammad.northwind.api.controller;

import lombok.AllArgsConstructor;
import org.shabnammammad.northwind.business.abstracts.CategoryService;
import org.shabnammammad.northwind.business.abstracts.ProductService;
import org.shabnammammad.northwind.entity.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }

}

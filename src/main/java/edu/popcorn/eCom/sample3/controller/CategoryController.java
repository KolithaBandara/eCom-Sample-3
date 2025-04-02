package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private List<Category> categories = new ArrayList<>();
    private Long id =0L;

    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        return categories;
    }

    @PostMapping("api/admin/category")
    public String addCategory(@RequestBody Category category){
        category.setId(++id);
        categories.add(category);
        return "Category '"+ category.getName() +"', added successfully!";
    }
}

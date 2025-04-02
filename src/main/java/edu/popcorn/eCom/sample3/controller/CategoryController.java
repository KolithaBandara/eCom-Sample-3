package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

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

    @DeleteMapping("api/admin/categories/{categoryId}")
    public String removeCategory(@PathVariable Long categoryId){
        return "Category Removed Successfully!";
    }
}

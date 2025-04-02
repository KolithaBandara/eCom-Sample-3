package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import edu.popcorn.eCom.sample3.service.CategoryService;
import edu.popcorn.eCom.sample3.service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    CategoryService categoryService = new CategoryServiceImpl();
    private Long id =0L;

    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("api/admin/category")
    public String addCategory(@RequestBody Category category){
        category.setId(++id);
        return categoryService.addCategory(category);
    }

    @DeleteMapping("api/admin/categories/{categoryId}")
    public String removeCategory(@PathVariable Long categoryId){
        return categoryService.removeCategory(categoryId);
    }
}

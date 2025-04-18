package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import edu.popcorn.eCom.sample3.service.CategoryService;
import edu.popcorn.eCom.sample3.service.CategoryServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CategoryController {
    CategoryService categoryService = new CategoryServiceImpl();
    private Long id = 0L;
    

    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        List<Category> categories;
            categories = categoryService.getAllCategories();
            return categories;
    }

    @PostMapping("api/admin/category")
    public ResponseEntity<String> addCategory(@RequestBody Category category){
        category.setId(++id);
        try {
            categoryService.addCategory(category);
        } catch (ResponseStatusException exception) {
            return new ResponseEntity<>(exception.getReason(), exception.getStatusCode());
        }
        return ResponseEntity.status(HttpStatus.)
    }

    @DeleteMapping("api/admin/categories/{categoryId}")
    public ResponseEntity<String> removeCategory(@PathVariable Long categoryId){
        try{
            String status = categoryService.removeCategory(categoryId);
            //return new ResponseEntity<>(status, HttpStatus.OK);
            return ResponseEntity.status(HttpStatus.OK).body(status);
        }catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }
    }

    @PutMapping("api/admin/category/update/{categoryId}")
    public ResponseEntity<String> updateCategory(){
        return ResponseEntity.status(HttpStatus.OK).body("Category Updated! ✨");
    }
}

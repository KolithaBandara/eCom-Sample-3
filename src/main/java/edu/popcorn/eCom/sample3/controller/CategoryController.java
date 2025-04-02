package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    List<Category> categories = new ArrayList<>();

    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        return categories;
    }
}

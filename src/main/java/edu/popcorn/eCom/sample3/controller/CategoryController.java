package edu.popcorn.eCom.sample3.controller;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {
    List<Category> categories = new ArrayList<>();

    @GetMapping()
    public List<Category> getAllCategories(){
        return categories;
    }
}

package edu.popcorn.eCom.sample3.service;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    String addCategory(@RequestBody Category category);
    String removeCategory(@PathVariable Long categoryId);
}

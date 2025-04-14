package edu.popcorn.eCom.sample3.service;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    ResponseStatusException addCategory(@RequestBody Category category);
    String removeCategory(@PathVariable Long categoryId);
}

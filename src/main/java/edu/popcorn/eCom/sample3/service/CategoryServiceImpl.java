package edu.popcorn.eCom.sample3.service;

import edu.popcorn.eCom.sample3.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{
    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public ResponseStatusException addCategory(Category category) {
        if (category.getName().isEmpty())
            return new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Check again, Syntax error!");
        categories.add(category);
        return new ResponseStatusException(
                        HttpStatus.OK,
                        "Category created!"
        );
    }

    @Override
    public String removeCategory(Long categoryId) {
        Category status = categories
                .stream()
                .filter(category -> category.getId().equals(categoryId))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found! 💔"));
        categories.remove(status);
        return categoryId+":"+status.getName()+", category deleted successfully!";
    }
}

package edu.popcorn.eCom.sample3.service;

import edu.popcorn.eCom.sample3.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{
    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public String addCategory(Category category) {
        categories.add(category);
        return
                "Category: '"+category.getId()+
                        ":"+category.getName()+"', added successfully!";
    }

    @Override
    public String removeCategory(Long categoryId) {
        Category status = categories
                .stream()
                .filter(category -> category.getId().equals(categoryId))
                .findFirst()
                .orElse(null);
        if(status==null) return "Category not found";
        categories.remove(status);
        return categoryId+":"+status.getName()+", category deleted successfully!";
    }
}

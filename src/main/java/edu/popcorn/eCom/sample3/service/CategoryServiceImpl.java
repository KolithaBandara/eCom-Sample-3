package edu.popcorn.eCom.sample3.service;

import edu.popcorn.eCom.sample3.model.Category;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{
    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public String addCategory(Category category) {
        return "";
    }

    @Override
    public String removeCategory(Long categoryId) {
        return "";
    }
}

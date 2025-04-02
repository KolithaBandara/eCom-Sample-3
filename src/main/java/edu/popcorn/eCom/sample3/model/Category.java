package edu.popcorn.eCom.sample3.model;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private String name;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

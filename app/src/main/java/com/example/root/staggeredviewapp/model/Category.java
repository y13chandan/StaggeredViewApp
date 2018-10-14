package com.example.root.staggeredviewapp.model;

import java.util.List;

public class Category {
    private String categoryName;
    private List<String> products;

    public Category(){}

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

}

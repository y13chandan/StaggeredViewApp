package com.example.root.staggeredviewapp.libs;

import com.example.root.staggeredviewapp.model.Category;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Category> getCategoryData() {
        List<Category> categories = new ArrayList<>();

        Category categoryOne = new Category();
        List<String> productOnes = new ArrayList<>();
        categoryOne.setCategoryName("Fusion Box");
        productOnes.add("Dal Makhni Rice Box");
        productOnes.add("Chole Chawal Box");
        productOnes.add("Rajma Chawal Box");
        productOnes.add("Grilled Tikki Box");
        productOnes.add("Paneer Masala Box");
        categoryOne.setProducts(productOnes);

        Category categoryTwo = new Category();
        List<String> productTwos = new ArrayList<>();
        categoryTwo.setCategoryName("Curries");
        productTwos.add("Dal Makhni Rice Box");
        productTwos.add("Chole Chawal Box");
        productTwos.add("Rajma Chawal Box");
        productTwos.add("Grilled Tikki Box");
        productTwos.add("Paneer Masala Box");
        categoryTwo.setProducts(productTwos);

        Category categoryThree = new Category();
        List<String> productThrees = new ArrayList<>();
        categoryThree.setCategoryName("Biryani");
        productThrees.add("Dal Makhni Rice Box");
        productThrees.add("Chole Chawal Box");
        productThrees.add("Rajma Chawal Box");
        productThrees.add("Grilled Tikki Box");
        productThrees.add("Paneer Masala Box");
        categoryThree.setProducts(productThrees);

        Category categoryFour = new Category();
        List<String> productFours = new ArrayList<>();
        categoryFour.setCategoryName("Wraps");
        productFours.add("Dal Makhni Rice Box");
        productFours.add("Chole Chawal Box");
        productFours.add("Rajma Chawal Box");
        productFours.add("Grilled Tikki Box");
        productFours.add("Paneer Masala Box");
        categoryFour.setProducts(productFours);

        Category categoryFive = new Category();
        List<String> productFives = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productFives);

        Category categorySix = new Category();
        List<String> productSix = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productSix);

        Category categorySeven = new Category();
        List<String> productSevens = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productSevens);

        Category categoryEight = new Category();
        List<String> productEights = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productEights);

        Category categoryNine = new Category();
        List<String> productNines = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productNines);

        Category categoryTen = new Category();
        List<String> productTens = new ArrayList<>();
        categoryFive.setCategoryName("Ice Cream");
        productFives.add("Dal Makhni Rice Box");
        productFives.add("Chole Chawal Box");
        productFives.add("Rajma Chawal Box");
        productFives.add("Grilled Tikki Box");
        productFives.add("Paneer Masala Box");
        categoryFive.setProducts(productTens);


        categories.add(categoryOne);
        categories.add(categoryTwo);
        categories.add(categoryThree);
        categories.add(categoryFour);
        categories.add(categoryFive);
        categories.add(categorySix);
        categories.add(categorySeven);
        categories.add(categoryEight);
        categories.add(categoryNine);
        categories.add(categoryTen);
        return categories;
    }
}

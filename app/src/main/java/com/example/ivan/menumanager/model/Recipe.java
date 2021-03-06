package com.example.ivan.menumanager.model;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ivan on 4/4/2017.
 */


public class Recipe implements Serializable {
    private int apiId;
    private String name;
    private String id;
    private String picURL;
    private Bitmap picBitmap;
    private String instructions;
    private String sourceUrl;
    private int productCounter;

    //frequent product add and get
    private ArrayList<Product> ingredients;

    public Recipe(String name, String id, String picURL) {
        this.name = name;
        this.id = id;
        this.picURL = picURL;
        this.ingredients = new ArrayList<>();
    }

    public int getApiId() {
        return apiId;
    }

    public void setId(int apiId) {
        this.apiId = apiId;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicBitmap(Bitmap picBitmap) {
        this.picBitmap = picBitmap;
    }

    public Bitmap getPicBitmap() {
        return picBitmap;
    }

    public void addIngredient(Product ingredient)
    {
        this.ingredients.add(ingredient);
    }

    public ArrayList<Product> getIngredients() {
        return this.ingredients;
    }

    public int getProductCounter() {
        return productCounter;
    }

    public void setProductCounter(int productCounter) {
        this.productCounter = productCounter;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}

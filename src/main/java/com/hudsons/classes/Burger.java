/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hudsons.classes;

/**
 *
 * @author aldairmh
 */
public class Burger {
    
    private int id;
    private float price;
    private String name;
    
    public Burger(){
        
    }

    public Burger(int id, float price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

package com.example.demo.Helpers.CartHelpers;

import com.example.demo.Models.Product;

import java.util.List;

public interface CartInterface {
    public  int getCardCount();
    public List<Product> getCartItems();
    public  void addToCart(Product item);
}

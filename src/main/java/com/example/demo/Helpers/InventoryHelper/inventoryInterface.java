package com.example.demo.Helpers.InventoryHelper;

import com.example.demo.Models.Product;

import java.util.List;

public interface inventoryInterface {
    public List<Product> getAllItem();
    public Product addItem(Product product);
    public Product updateItem(Product product, String id);
    public  String deleteItem(String id);
}

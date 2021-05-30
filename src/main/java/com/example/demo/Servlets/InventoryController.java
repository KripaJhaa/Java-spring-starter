package com.example.demo.Servlets;

import com.example.demo.Services.InventoryServices;
import com.example.demo.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class InventoryController {

    @Autowired
    private InventoryServices inventoryServices;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return inventoryServices.getAllProducts();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Product> addProducts(@RequestBody Product item){
        return inventoryServices.addProduct(item);
    }

    @PostMapping(value = "add/{id}")
    public ResponseEntity<Product> updateTodo(@RequestBody Product item, @PathVariable("id") String id){
       return inventoryServices.updateProduct(item,id);
    }

}

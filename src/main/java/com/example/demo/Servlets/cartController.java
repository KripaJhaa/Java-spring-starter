package com.example.demo.Servlets;

import com.example.demo.Models.Product;
import com.example.demo.Services.CartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class cartController {
    @Autowired
    CartServices cartServices;

    @PostMapping("/add/cart")
    public ResponseEntity<Product> addToCart(@RequestBody Product item){
        System.out.println(item);
        return  this.cartServices.addToCart(item);
    }

    @GetMapping("/cart")
    public ResponseEntity<List<Product>> getCartDetails(){
        return  this.cartServices.getAllCartItems();
    }

}

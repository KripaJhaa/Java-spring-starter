package com.example.demo.Services;

import com.example.demo.Helpers.CartHelpers.CartDao;
import com.example.demo.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartServices {
    @Autowired
    CartDao cartDao;

    @Autowired
    InventoryServices inventoryServices;

    public ResponseEntity<Product> addToCart(Product item){
        // reduce the count of the product from the cart
        //inventoryServices.reduceTheProductCount(item);
        this.cartDao.addToCart(item);
        return new ResponseEntity(item, HttpStatus.OK);
    }

    public ResponseEntity<List<Product>> getAllCartItems() {
        List<Product> list = this.cartDao.getCartItems();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

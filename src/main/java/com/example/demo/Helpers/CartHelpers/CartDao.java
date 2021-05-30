package com.example.demo.Helpers.CartHelpers;

import com.example.demo.Models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartDao implements CartInterface{

    List<Product> productsInCart = new ArrayList<>();


    @Override
    public int getCardCount() {
        return productsInCart.size();
    }

    @Override
    public List<Product> getCartItems() {
        return productsInCart;
    }

    @Override
    public void addToCart(Product item) {
        for (Product product : this.productsInCart) {
            if(product.getId().equals(item.getId())){
                product.addCount();
                return;
            }
        }
        this.productsInCart.add(item);
    }


}

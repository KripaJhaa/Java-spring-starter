package com.example.demo.Helpers.InventoryHelper;

import com.example.demo.Models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InventoryDAO implements inventoryInterface {

    //mimicking db
    ArrayList<Product> productList = new ArrayList<>();
    @Override
    public List<Product> getAllItem() {
        return productList;
    }

    @Override
    public Product addItem(Product product) {
        Product item = new Product().setCreatedAt()
                            .seData(product.getData())
                            .setId()
                            .build();
        productList.add(item);
        return item;
    }


    public Product updateItem(Product todos, String id) {
        for(Product item:productList){
            if(item.getId().equals(id)){
                item = todos;
                return item;
            }
        }
        return null;
    }

    @Override
    public String deleteItem(String id) {
        return "OK";
    }
}

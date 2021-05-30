package com.example.demo.Services;

import com.example.demo.Helpers.InventoryHelper.InventoryDAO;
import com.example.demo.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InventoryServices {
  @Autowired
  InventoryDAO inventoryDAO;

  public ResponseEntity<List<Product>> getAllProducts(){
      List<Product> list = inventoryDAO.getAllItem();
      if(!list.isEmpty()){
          return new ResponseEntity<>(list, HttpStatus.OK);
      }
      return new ResponseEntity<>(list,HttpStatus.NOT_ACCEPTABLE);
  }

  public  ResponseEntity<Product> addProduct(Product item) {
        inventoryDAO.addItem(item);
      return new ResponseEntity<Product>(item, HttpStatus.OK);
  }

  public ResponseEntity<Product> updateProduct(Product item,String id){
      Product updatedItem = inventoryDAO.updateItem(item,id);
      if(updatedItem!=null)
          return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
      else
          return new ResponseEntity<>(updatedItem,HttpStatus.OK);
  }

  public  void reduceTheProductCount(Product item){
      inventoryDAO.deleteItem(item.getId());
  }
}

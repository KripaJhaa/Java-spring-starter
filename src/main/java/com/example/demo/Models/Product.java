package com.example.demo.Models;

import java.sql.Timestamp;
import java.util.UUID;

public class Product {
    String id;
    String data;

    int count=1;
    String createdAt;


    public String getId() {
        return id;
    }
    public int getCount() {
        return count;
    }
    public String getData() {
        return data;
    }
    public String getCreatedAt(){ return createdAt;}
    public void setData(String data) {
        this.data = data;
    }
    public Product seData(String data){
        this.data = data;
        return this;
    }
    public Product setId(){
        this.id = UUID.randomUUID().toString();
        return this;
    }
    public  Product setCreatedAt(){
        this.createdAt= new Timestamp(System.currentTimeMillis()).toString();
        return this;
    }

    public  Product build(){
        return this;
    }

    public void addCount(){
        this.count++;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

package com.devanvenu.inventory.service;
import com.devanvenu.inventory.entity.Product;
public class InventoryService{
  public Product reserve(Product p,int qty){
    p.availableQuantity-=qty;
    return p;
  }
}

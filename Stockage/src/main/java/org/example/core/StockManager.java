package org.example.core;

import org.example.ports.StorageService;

public class StockManager {
    private StorageService storageService;

    public StockManager(StorageService storageService) {
        this.storageService = storageService;
    }

    public void addProduct(String productName, int quantity) {
        int currentQuantity = storageService.getQuantity(productName);
        int newQuantity = currentQuantity + quantity;
        storageService.setQuantity(productName, newQuantity);
    }

    public void removeProduct(String productName, int quantity) {
        int currentQuantity = storageService.getQuantity(productName);
        int newQuantity = Math.max(0, currentQuantity - quantity);
        storageService.setQuantity(productName, newQuantity);
    }
}
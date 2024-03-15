package org.example;

import org.example.adapters.StorageService;
import org.example.core.StockManager;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        org.example.ports.StorageService storageService = new StorageService();
        StockManager stockManager = new StockManager(storageService);

        // Test adding and removing products
        stockManager.addProduct("Apple", 10);
        stockManager.addProduct("Banana", 20);
        stockManager.removeProduct("Apple", 5);

        // Print current stock
        System.out.println("Current stock:");
        for (Map.Entry<String, Integer> entry : ((StorageService) storageService).getStock().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
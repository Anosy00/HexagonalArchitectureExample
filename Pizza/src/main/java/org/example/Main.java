package org.example;

import org.example.adapters.DummyStorageService;
import org.example.core.StockManager;
import org.example.ports.StorageService;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StorageService storageService = new DummyStorageService();
        StockManager stockManager = new StockManager(storageService);

        // Test adding and removing products
        stockManager.addProduct("Apple", 10);
        stockManager.addProduct("Banana", 20);
        stockManager.removeProduct("Apple", 5);

        // Print current stock
        System.out.println("Current stock:");
        for (Map.Entry<String, Integer> entry : ((DummyStorageService) storageService).getStock().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
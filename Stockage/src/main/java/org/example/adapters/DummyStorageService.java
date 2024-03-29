package org.example.adapters;

import java.util.HashMap;
import java.util.Map;

public class DummyStorageService implements org.example.ports.StorageService {
    private Map<String, Integer> stock;

    public DummyStorageService() {
        this.stock = new HashMap<>();
    }

    @Override
    public int getQuantity(String productName) {
        return stock.getOrDefault(productName, 0);
    }

    @Override
    public void setQuantity(String productName, int quantity) {
        stock.put(productName, quantity);
    }

    public Map<String, Integer> getStock() {
        return stock;
    }
}
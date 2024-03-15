package org.example.ports;

public interface StorageService {
    int getQuantity(String productName);
    void setQuantity(String productName, int quantity);
}
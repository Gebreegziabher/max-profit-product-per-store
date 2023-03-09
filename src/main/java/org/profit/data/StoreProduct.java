package org.profit.data;

public class StoreProduct {
    private String storeId;
    private String storeLocation;
    private String productId;
    private String productName;
    private double cost;
    private double price;
    private int quantity;
    public StoreProduct(String storeId, String storeLocation, String productId, String productName, double cost, double price, int quantity) {
        this.storeId = storeId;
        this.storeLocation = storeLocation;
        this.productId = productId;
        this.productName = productName;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
    }
    public String getStoreId() {
        return storeId;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getCost() {
        return cost;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalCost() {
        return cost * quantity;
    }
    public double getTotalRevenue() {
        return price * quantity;
    }
    public double getProfit() {
        return getTotalRevenue() - getTotalCost();
    }
}

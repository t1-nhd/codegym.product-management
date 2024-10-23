package com.codegym.productmanagement.model;

public class Product {
    private int id;
    private String productName;
    private int productPrice;
    private String productDescription;
    private String supplierName;
    public static int lastProduct = 0;

    public Product(int id, String productName, int productPrice, String productDescription, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.supplierName = supplierName;
        lastProduct++;
    }

    public Product(int id, String productName, int productPrice, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.supplierName = supplierName;
        lastProduct++;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}

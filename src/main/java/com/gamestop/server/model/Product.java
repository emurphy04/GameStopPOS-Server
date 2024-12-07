package com.gamestop.server.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sku;
    public boolean isReservable;
    private String prodName;
    private String status;
    private String dept;

    public Product() {
    }

    public Product(boolean isReservable, String prodName, String status, String dept) {
        this.isReservable = isReservable;
        this.prodName = prodName;
        this.status = status;
        this.dept = dept;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public boolean isReservable() {
        return isReservable;
    }

    public void setReservable(boolean reservable) {
        isReservable = reservable;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku=" + sku +
                ", isReservable=" + isReservable +
                ", prodName='" + prodName + '\'' +
                ", status='" + status + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

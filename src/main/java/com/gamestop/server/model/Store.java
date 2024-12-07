package com.gamestop.server.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storeId;
    private String address;
    private String prov;
    private String postalCode;

    public Store() {
    }

    public Store(String address, String prov, String postalCode) {
        this.address = address;
        this.prov = prov;
        this.postalCode = postalCode;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", address='" + address + '\'' +
                ", prov='" + prov + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

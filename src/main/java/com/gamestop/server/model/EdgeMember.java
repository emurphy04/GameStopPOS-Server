package com.gamestop.server.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "edge_members")
public class EdgeMember{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer edgeId;
    private String tier;
    private String postalCode;
    private String email;
    @ManyToMany
    @JoinTable(
            name = "customer_preorders",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "sku")
    )
    private List<Product> preorders = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String phone;

    public EdgeMember(String tier, String postalCode, String email, List<Product> preorders, String firstName, String lastName, String phone) {
        this.tier = tier;
        this.postalCode = postalCode;
        this.email = email;
        this.preorders = preorders;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public EdgeMember() {
    }

    public Boolean addPreorder(Product product){
        if (product.isReservable){
            preorders.add(product);
            return true;
        } else {
            return false;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEdgeId() {
        return edgeId;
    }

    public void setEdgeId(Integer edgeId) {
        this.edgeId = edgeId;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getPreorders() {
        return preorders;
    }

    public void setPreorders(List<Product> preorders) {
        this.preorders = preorders;
    }

    @Override
    public String toString() {
        return "EdgeMember{" +
                "edgeId=" + edgeId +
                ", tier='" + tier + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", email='" + email + '\'' +
                ", preorders=" + preorders +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

package com.gamestop.server.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transNum;
    private double total;
    private LocalDate transDate;
    @ManyToOne
    @JoinTable(
            name = "employee_transaction",
            joinColumns = @JoinColumn(name = "transNum"),
            inverseJoinColumns = @JoinColumn(name = "employeeId")
    )
    private User employee;
    @ManyToMany
    @JoinTable(
            name = "transaction_products",
            joinColumns = @JoinColumn(name = "transaction_id"),
            inverseJoinColumns = @JoinColumn(name = "sku")
    )
    private List<Product> products = new ArrayList<>();


    public Transaction() {
    }

    public Transaction(double total, LocalDate transDate, User employee, List<Product> products) {
        this.total = total;
        this.transDate = transDate;
        this.employee = employee;
        this.products = products;
    }

    public Integer getTransNum() {
        return transNum;
    }

    public void setTransNum(Integer transNum) {
        this.transNum = transNum;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transNum=" + transNum +
                ", total=" + total +
                ", transDate=" + transDate +
                ", employee=" + employee +
                ", products=" + products +
                '}';
    }
}

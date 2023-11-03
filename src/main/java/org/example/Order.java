package org.example;

import org.example.Customer;
import org.example.Product;

public class Order {


    private Customer customer;

    private Product product;

    private int quantity;

    private double totalPrice;


    public Order(Customer customer, Product product, int quantity) {
        setCustomer(customer);
        setProduct(product);
        setQuantity(quantity);
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        this.customer = customer;
    }


    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        this.product = product;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0 || quantity > 100 ) {
            throw new IllegalArgumentException("Quantity must be greater than zero and less than or equal to 100");
        }
        this.quantity = quantity;
    }


    public double getTotalPrice() {
        return totalPrice;
    }


    @Override
    public String toString() {
        return
                "Покупатель " + customer + '\n' +
                        " Продукт " + product + '\n' +
                        " Количество " + quantity + '\n' ;
    }
}
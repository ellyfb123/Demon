package com.thoughtworks;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fxie on 7/20/14.
 */
public class Expense {

    private String type;
    private double cost;

    @Autowired
    public Expense(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

package com.thoughtworks;

import com.thoughtworks.Expense;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by fxie on 7/20/14.
 */
public class Employee {

    private String uid;
    private String uname;
    private double exp;
    @Autowired
    private ArrayList<Expense> expensesList;

    public Employee(String uid, String uname, double exp) {
        this.uid = uid;
        this.uname = uname;
        this.exp = exp;
    }

    public String getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public double getExp() {
        return exp;
    }

    public ArrayList<Expense> getExpensesList() {
        return expensesList;
    }

    public void setExpensesList(ArrayList<Expense> expensesList) {
        this.expensesList = expensesList;
    }

    public double getAvailableCost() {
        double foundation = 0;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);//获取月份
        int day = cal.get(Calendar.DATE);//获取日期
        if (exp >= 1) {
            foundation = 2000;
        } else {
            double associationtimeInMonth = (30 - day) / 365;
            double foundationInYear = (12 - month + Math.ceil((associationtimeInMonth + exp) * 12)) / 12;
            if (foundationInYear >= 1)
                foundation = 2000;
            else {
                foundation = foundationInYear * 2000;
            }

        }
        return foundation;
    }
    public double getSpendedCost() {
        double spended = 0;
        for (Expense expense : expensesList) {
            spended += expense.getCost();
        }
        return spended;
    }

    public double getLeftCost() {
        return getAvailableCost() - getSpendedCost();
    }
}

package com.hfwas.domian;

/**
 * @Author: HFwas
 * @Date: 2021/2/5
 * @Description: com.hfwas.domian
 * @version: 1.0
 */
public class Account {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

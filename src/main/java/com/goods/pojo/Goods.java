package com.goods.pojo;

public class Goods {
    private Integer id;//asda
    private String name;//1.0
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods() {
    }

    public Goods(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

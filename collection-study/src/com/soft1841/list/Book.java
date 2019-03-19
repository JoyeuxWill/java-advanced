package com.soft1841.list;

public class Book {
    public Integer ID;
    public String name;
    public Double price;

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(Integer ID, String name, Double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Book() {
    }
}

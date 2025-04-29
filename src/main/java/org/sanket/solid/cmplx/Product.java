package org.sanket.solid.cmplx;

public class Product {
    private int catagoryId;
    private String name;
    private int price;


    @Override
    public String toString() {
        return "Product{" +
                "catagoryId=" + catagoryId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int catagoryId, String name, int price) {
        this.catagoryId = catagoryId;
        this.name = name;
        this.price = price;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


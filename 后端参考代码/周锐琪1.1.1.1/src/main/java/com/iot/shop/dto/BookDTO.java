package com.iot.shop.dto;

public class BookDTO {
    private String name;
    private Integer price;
    private String type;
    private String info;

    public BookDTO() {}

    public BookDTO(String name, Integer price, String type, String info) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

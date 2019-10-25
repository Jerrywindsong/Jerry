package com.example.demo.dto;

public class BookDTO {

    private String name;
    private Integer price;
    private String author;
    private String brief;

    public BookDTO() {}

    public BookDTO(String name, Integer price, String anthor, String brief) {
        this.name = name;
        this.price = price;
        this.author = anthor;
        this.brief = brief;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
}

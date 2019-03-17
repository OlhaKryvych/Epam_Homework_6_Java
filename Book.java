package com.epam.lesson6;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numOfPages;
    private double price;

    public Book(int id, String name, String author, String publishingHouse,
                int yearOfPublishing, int numOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numOfPages = numOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println("Id: " + id + "\nName: " + name + "\nAuthor: " + author
        + "\nPublishingHouse: " + publishingHouse + "\nYear: " + yearOfPublishing
        + "\nNumber of pages: " + numOfPages + "\nPrice: " + price);
        System.out.println();
    }
}

package com.epam.lesson6;

public class Books {
    Book[] books;
    int lastIndex = 0;

    public Books(int size) {
        books = new Book[size];
    }

    public void addBook(Book inputBook){
        books[lastIndex] = inputBook;
        lastIndex++;
    }

    public void printBooks(){
        for (Book elem:books) {
            elem.view();
        }
    }

    public void changePrice(double percent){
        if (percent > 100 || percent < -100) {
            return;
        }
        for(int i = 0; i < books.length; i++) {
            books[i].setPrice(books[i].getPrice() +
                    (books[i].getPrice() * (percent / 100)));
        }
    }

    public Books searchByAuthor(String author){
        int count = 0;
        for(int i = 0; i < books.length; i++){
            if(author.equals(books[i].getAuthor())){
                count++;
            }
        }
        Books object = new Books(count);
        for(int i = 0; i < books.length; i++){
            if(author.equals(books[i].getAuthor())){
                object.addBook(books[i]);
            }
        }
        if(object != null){
            return object;
        }
        else {
            System.out.println("Array is empty! ");
            return null;
        }
    }

    public Books searchByYear(int year){
        int count = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i].getYearOfPublishing() > year){
                count++;
            }
        }
        Books years = new Books(count);
        for(int i = 0; i < books.length; i++){
            if(books[i].getYearOfPublishing() > year){
                years.addBook(books[i]);
            }
        }
        if(years != null){
            return years;
        }
        else {
            System.out.println("Array is empty! ");
            return null;
        }
    }
}

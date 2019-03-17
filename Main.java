package com.epam.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please amount of books: ");
        int size = sc.nextInt();
        Books array = new Books(size);
        for(int i = 0; i < size; i++){
            System.out.println();
            System.out.println("Enter id of book: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter please name of book: ");
            String name = sc.nextLine();
            System.out.println("Enter please author: ");
            String author = sc.nextLine();
            System.out.println("Enter please publishing house: ");
            String publishingHouse = sc.nextLine();
            System.out.println("Enter please year of publishing: ");
            int yearOfPublishing = sc.nextInt();
            System.out.println("Enter amount of pages: ");
            int pages = sc.nextInt();
            System.out.println("Enter price of book: ");
            double price = sc.nextDouble();

            Book item = new Book(id, name, author, publishingHouse, yearOfPublishing,
                    pages, price);
            array.addBook(item);
        }
        array.printBooks();

        int choice = 0;
        do{
        System.out.println("Choose action what to do: " +
                "\n1 - change price of all books, \n2 - search by author, " +
                "\n3 - search all books, which were published after input year" +
                "\n0 - close;");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                System.out.print("Enter percent to change price: ");
                double per = sc.nextDouble();
                array.changePrice(per);
                array.printBooks();
                break;
            case 2:
                System.out.println("Enter author to search books: ");
                String searchAuthor = sc.nextLine();
                Books ob = array.searchByAuthor(searchAuthor);
                ob.printBooks();
                break;
            case 3:
                System.out.println("Enter year: ");
                int year = sc.nextInt();
                Books search = array.searchByYear(year);
                search.printBooks();
                break;
            default:
                break;
            }
        }while (choice != 0);
    }
}

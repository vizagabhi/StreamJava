package org.example.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bmain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Silent River", 450, "Fiction", "Arundhati Rao", 2018));
        books.add(new Book("Java in Depth", 799, "Technology", "James Gosling", 2020));
        books.add(new Book("The Art of Peace", 550, "Philosophy", "Morihei Ueshiba", 2015));
        books.add(new Book("Cosmic Wonders", 620, "Science", "Carl Sagan", 2017));
        books.add(new Book("Mystery of the East", 400, "Travel", "William Dalrymple", 2019));
        books.add(new Book("The Hidden Truth", 350, "Thriller", "Dan Brown", 2016));
        books.add(new Book("Cooking Magic", 250, "Cooking", "Sanjeev Kapoor", 2014));
        books.add(new Book("Modern Web Design", 899, "Technology", "Ethan Marcotte", 2022));
        books.add(new Book("Mindful Living", 300, "Self-Help", "Jay Shetty", 2021));
        books.add(new Book("The Startup Way", 700, "Business", "Eric Ries", 2018));
        books.add(new Book("Deep Dive into AI", 950, "Technology", "Andrew Ng", 2023));
        books.add(new Book("The Ancient Path", 480, "History", "Yuval Noah Harari", 2016));
        books.add(new Book("Poems of the Heart", 200, "Poetry", "Gulzar", 2013));
        books.add(new Book("Wings of Fire", 350, "Autobiography", "A.P.J. Abdul Kalam", 1999));
        books.add(new Book("Green Planet", 500, "Environment", "David Attenborough", 2021));


        //Price over 500/-
        //books.stream().filter(book->book.getBprice()>500).forEach(System.out::println);

        //Published b4 2000.
       // books.stream().filter(book->book.getLaunchYear()<2000).forEach(System.out::println);

        //Adding Coming Soon title.
        //books.stream().map(book->book.getBname()+ " (COMING SOON)").forEach(System.out::println);

        //Sorted by ascending order of price
       // books.stream().sorted(Comparator.comparingInt(Book::getBprice)).forEach(System.out::println);

        //Rare Book -> title >15 letters
        books.stream().filter(book->book.getBname().length()>18).forEach(System.out::println);

    }
}
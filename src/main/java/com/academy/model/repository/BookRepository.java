package com.academy.model.repository;

import com.academy.model.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
  public List<Book> getBooks() {
    List<Book> books = new ArrayList<>();

    Book book = new Book("Title1", "Ivan", "sdfes32323", 1000);
    Book book1 = new Book("Title2", "Petya", "sdfes32323", 1900);
    Book book2 = new Book("Title3", "Sergey", "sdfes32323", 2010);
    Book book3 = new Book("Title4", "Sergey", "sdfes32323", 2100);

    books.add(book);
    books.add(book1);
    books.add(book2);
    books.add(book3);

    return books;
  }
}

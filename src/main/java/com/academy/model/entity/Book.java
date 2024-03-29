package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
  private String title;
  private String author;
  private String isbn;
  private int year;
}

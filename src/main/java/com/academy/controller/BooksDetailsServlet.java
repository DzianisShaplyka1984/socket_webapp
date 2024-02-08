package com.academy.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book_details")
public class BooksDetailsServlet extends HttpServlet {

  @Override
  protected void doGet(
      HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");

    PrintWriter out = resp.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("</head>");
    out.println("<body>");

    out.println("Book title: Title123, author: Ivan Ivanov <br>");
    out.println("Book isbn: ferfer43543523443 <br>");
    out.println("Book year:2001");

    out.println("</body>");
    out.println("</html>");

    out.close();
  }
}

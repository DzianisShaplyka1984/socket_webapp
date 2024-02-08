package com.academy.model.repository;

import com.academy.model.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  public List<User> getUsers() {
    List<User> users = new ArrayList<>();

    User user = new User("admin", "admin");
    User user1 = new User("root", "root");

    users.add(user);
    users.add(user1);

    return users;
  }
}

package com.academy.service;

import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;
import java.util.List;

public class LoginService {
  public boolean checkCredentials(String login, String password) {
    UserRepository userRepository = new UserRepository();

    List<User> users = userRepository.getUsers();

    for (User user : users) {
      if (user.getLogin().equals(login) && user.getPassword().equals(password)) {

        return true;
      }
    }

    return false;
  }
}

package com.java.courses.javafx;

public class UserAuthorization {

  public static boolean checkCredentials(String user, String password) {
    if (user.equals("admin") && password.equals("secret")) {
      return true;
    }

    return false;
  }
}

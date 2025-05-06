package com.example;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    String hash = BCrypt.hashpw("123456", BCrypt.gensalt());
    System.out.println("Hash generado: " + hash);
  }
}

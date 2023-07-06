package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Решение задания с бинами
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}

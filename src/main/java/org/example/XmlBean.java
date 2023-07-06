package org.example;

import lombok.Getter;

@Getter
public class XmlBean {
  private final String beanName = "Бин из под XML";

  XmlBean() {
    System.out.println(beanName);
  }
}

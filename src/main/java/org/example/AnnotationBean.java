package org.example;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AnnotationBean {
  private final String beanName = "бин из под аннотации";
}

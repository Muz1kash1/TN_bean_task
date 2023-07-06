package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Решение задания с бинами
 */
public class App {
  public static void main(String[] args) {
    // Бин на основе XML
    ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    XmlBean xmlBean = xmlContext.getBean("xmlBean", XmlBean.class);
    System.out.println(xmlBean.getBeanName());
    // Бин на основе Аннотации компонент
    AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(AnnotationBean.class);
    AnnotationBean annotationBean = annotationContext.getBean(AnnotationBean.class);
    System.out.println(annotationBean.getBeanName());
    // Бин на основе конфигурации
    AnnotationConfigApplicationContext javaConfigContext = new AnnotationConfigApplicationContext();
    javaConfigContext.register(AppConfig.class);
    javaConfigContext.refresh();
    AppConfiguredBean appConfiguredBean = javaConfigContext.getBean(AppConfiguredBean.class);
    System.out.println(appConfiguredBean.getBeanName());

    //Закрываем контексты
    xmlContext.close();
    annotationContext.close();
    javaConfigContext.close();


  }
}

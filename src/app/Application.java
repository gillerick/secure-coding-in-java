package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
  public static void main(String[] args) {
    Person gill = new Person("Gill", "Erick", "ogayogill95@gmail.com");
    LOGGER.info("Person Details: {}", gill);
  }
}

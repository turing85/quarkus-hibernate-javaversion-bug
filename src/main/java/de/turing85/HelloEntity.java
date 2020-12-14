package de.turing85;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelloEntity {

  @Id
  private long id;

  private String hello;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getHello() {
    return hello;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }
}

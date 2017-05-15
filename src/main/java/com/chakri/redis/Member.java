package com.chakri.redis;

import java.io.Serializable;

/**
 * Created by chakradhar on 28/04/17.
 */
public class Member implements Serializable {

  private String name;

  private String number;

  public Member() {

  }

  public Member(String name, String number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Member{" + "name='" + name + '\'' + ", number='" + number + '\'' + '}';
  }
}

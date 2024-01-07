package com.rt.plantguardianapi.model;

import java.io.Serializable;

public class Plant implements Serializable {

  private static final long serialVersionUID = -2706277976133759428L;

  private Long id;
  private String name;

  public Plant() {
  }

  public Plant(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    return "Plant{" +
          "id='" + id + '\'' +
          ", name=" + name +
          '}';
  }
}

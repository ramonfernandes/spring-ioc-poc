package com.ramonfernandes.springioc.pojo;

import java.util.HashMap;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class SingletonMap {

  private HashMap<Integer, String> map;

  public SingletonMap() {
    map = new HashMap<>();
  }

  public HashMap<Integer, String> getMap() {
    return map;
  }

  public void setMap(HashMap<Integer, String> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    map.forEach((integer, s) -> {
      stringBuilder.append(integer).append(" - ").append(s);
    });

    return stringBuilder.toString();
  }
}

package org.yakov.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.yakov.util.IdProvider;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@RequiredArgsConstructor
public class Developer extends User {

  private String name;
  private int salary;
  private List<Task> tasks;

  public Developer(IdProvider idProvider, String name, int salary) {
    super(idProvider);
    this.name = name;
    this.salary = salary;
  }
}


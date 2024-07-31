package org.yakov.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Developer extends User {
  private final String name;
  private int salary;

}


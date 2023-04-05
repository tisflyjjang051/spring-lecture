package com.jjang051.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TodoJpa {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int no;

  private String todo;

  private int done;
  private String pickedDate;
}

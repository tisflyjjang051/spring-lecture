package com.jjang051.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TodoTable")
public class TodoJpa {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int no;

  private String todo;

  private int done;
  private String pickedDate;
}

package com.jjang051.ch04.dto;

import lombok.Data;

@Data
public class BoardDto {

  private int no;
  private String userName;
  private String subject;
  private String contents;
  private String regDate;
  private int hit;
}

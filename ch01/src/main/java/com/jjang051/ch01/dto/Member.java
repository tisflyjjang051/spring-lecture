package com.jjang051.ch01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Setter
// @Getter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member {

  private String id;
  private String name;
  private String addr;
}

package com.jjang051.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member {

  private String userId;
  private String userPw;
  private String userName;
  private String tel;
  private String addr;
}

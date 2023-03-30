package com.jjang051.replyboard03.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MemberDto {

  //private int no;

  // @NotBlank
  // @Size(min = 5, max = 20, message = "id는 5글자 이상 20 글자 이하여야 합니다.")
  private String userId;

  //@NotBlank(message = "필수 입력사항입니다.")
  private String userPw;

  //@Email(message = "이메일 형식을 확인해 주세요.")
  private String email;

  // @NotBlank(message = "필수입력사항입니다.")
  // @Size(min = 5, max = 20, message = "id는 5글자 이상 20 글자 이하여야 합니다.")
  private String userName;
}

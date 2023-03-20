package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

  // @Controller 는 파일로 응답.... .jsp,.html   둥 파일로 리턴한다.  (web)
  // @RestController는 body에 응답한다.   (json)

  @GetMapping("/txt01")
  public String returnTxt() {
    return "hello";
  }

  @GetMapping("/json01")
  public String returnJson01() {
    return "{\"name\":\"jjang051\"}";
  }

  @GetMapping("/json02")
  public HashMap<String, String> returnJson02() {
    HashMap<String, String> hashMap = new HashMap<>();

    hashMap.put("name", "jjang051");
    hashMap.put("weight", "80");
    hashMap.put("age", "30");
    return hashMap;
  }

  @GetMapping("/json03")
  public Member returnJson03() {
    Member member = new Member();
    member.setUserId("jjang051");
    member.setUserName("장성호");
    member.setAddr("지구 어딘가");

    return member;
  }

  @GetMapping("/json04")
  public ArrayList returnJson04() {
    ArrayList<Member> arrayList = new ArrayList<>();
    Member member01 = new Member();
    member01.setUserId("jjang051");
    member01.setUserName("장성호");
    member01.setAddr("지구 어딘가");

    arrayList.add(member01);

    Member member02 = new Member();
    member02.setUserId("jjang052");
    member02.setUserName("장동건");
    member02.setAddr("청담동");

    arrayList.add(member01);

    Member member03 = new Member();
    member03.setUserId("jjang053");
    member03.setUserName("고소영");
    member03.setAddr("한남동");

    arrayList.add(member03);

    return arrayList;
  }
}

package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {

  @GetMapping("/join")
  public String join(
    @RequestParam String userId,
    @RequestParam String userPw,
    @RequestParam String userName,
    @RequestParam String tel,
    @RequestParam String addr
  ) {
    log.info(addr);
    log.info(userId);
    log.info(userName);
    log.info(tel);
    log.info(addr);
    return "/member/join";
  }

  @GetMapping("/join02")
  public String join02(Member member) {
    System.out.println(member.toString());
    return "/member/join";
  }

  @GetMapping("/join03")
  public String join03(String name, int age) {
    //System.out.println(name + "==" + age);
    return "/member/join";
  }

  @GetMapping("/list")
  public String list(@RequestParam int page) {
    System.out.println("page===" + page);
    return "/member/list";
  }

  @GetMapping("/login")
  public String login(
    @RequestParam String userId,
    @RequestParam(name = "password") String userPw
  ) {
    System.out.println("userId===" + userId + "===userPw===" + userPw);
    return "/member/login";
  }

  @GetMapping("/info/{id}")
  public String memberIfo(@PathVariable("id") String id) {
    System.out.println("id===" + id);
    return "/member/info";
  }

  // @RequestMapping(method = RequestMethod.GET, path = "/member/delete")
  // public String delete() {
  //   return "/member/delete";
  // }

  @GetMapping("/delete")
  public String delete() {
    return "/member/delete";
  }
}

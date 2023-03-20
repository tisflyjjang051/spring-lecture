package com.jjang051.ch01.controller;

import com.jjang051.ch01.dto.Member;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("name", "장성호");
    return "/index/index";
  }

  @GetMapping("/member/list")
  public String list(Model model) {
    ArrayList<Member> memberList = new ArrayList<>();
    memberList.add(new Member("01", "장성호", "파주"));
    memberList.add(new Member("02", "장동건", "청담"));
    memberList.add(new Member("03", "현빈", "한남"));

    model.addAttribute("memberList", memberList);
    return "/member/list";
  }

  @GetMapping("/mv")
  public ModelAndView home02() {
    ModelAndView mav = new ModelAndView();
    mav.addObject("subject", "제목을 실어서 보냅니다.");
    mav.setViewName("/index/index02");
    return mav;
  }
}

package com.jjang051.replyboard03.controller;

import com.jjang051.replyboard03.dto.MemberDto;
import com.jjang051.replyboard03.service.MemberService;
import com.jjang051.replyboard03.utils.ScriptWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
@Log4j2
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping("/join")
  public String join() {
    return "/member/join";
  }

  @PostMapping("/joinProcess")
  public String joinProcess(
    MemberDto memberDto,
    RedirectAttributes redirectAttributes,
    HttpServletResponse response
  ) throws IOException {
    int result = memberService.insertMember(memberDto);
    if (result > 0) {
      redirectAttributes.addFlashAttribute("msg", "회원가입 되었습니다.");
      return "redirect:/member/login";
    } else {
      ScriptWriter.alertAndBack(response, "다시 시도해 주세요.");
      return null;
    }
  }
}

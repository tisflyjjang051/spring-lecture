package com.jjang051.replyboard.controller;

import com.jjang051.replyboard.dto.ReplyBoardDto;
import com.jjang051.replyboard.service.ReplyBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

  @Autowired
  ReplyBoardService replyBoardService;

  @GetMapping("/write")
  public String write() {
    return "/board/write";
  }

  @PostMapping("/writeProcess")
  public String writeProcess(ReplyBoardDto replyBoardDto) {
    int maxRegroup = replyBoardService.getMaxReGroup();
    replyBoardDto.setReGroup(maxRegroup);
    replyBoardDto.setReLevel(1);
    replyBoardDto.setReStep(1);
    replyBoardService.insertReplyBoard(replyBoardDto);
    return "redirect:/board/list";
  }

  @PostMapping("/replyWriteProcess")
  public String replyWriteProcess(ReplyBoardDto replyBoardDto) {
    return "redirect:/board/list";
  }

  @GetMapping("/list")
  public String list() {
    return "/board/list";
  }
}

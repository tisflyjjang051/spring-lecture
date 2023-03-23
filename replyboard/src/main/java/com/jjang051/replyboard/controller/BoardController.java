package com.jjang051.replyboard.controller;

import com.jjang051.replyboard.dto.ReplyBoardDto;
import com.jjang051.replyboard.service.ReplyBoardService;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
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
    replyBoardDto.setReGroup(maxRegroup + 1);
    replyBoardDto.setReLevel(1);
    replyBoardDto.setReStep(1);
    log.info(replyBoardDto);
    replyBoardService.insertBoard(replyBoardDto);
    return "redirect:/board/list";
  }

  @PostMapping("/replyProcess")
  public String replyWriteProcess(ReplyBoardDto replyBoardDto) {
    replyBoardService.insertReplyBoard(replyBoardDto);
    return "redirect:/board/list";
  }

  @GetMapping("/list")
  public String list(Model model) {
    List<ReplyBoardDto> boardList = replyBoardService.getAllReplyBoard();
    model.addAttribute("boardList", boardList);
    return "/board/list";
  }

  @GetMapping("/reply")
  public String reply(int no) {
    return "/board/reply";
  }

  @GetMapping("/view")
  public String view(int no, Model model) {
    ReplyBoardDto boardDto = replyBoardService.getSelectedBoard(no);
    model.addAttribute("boardDto", boardDto);
    return "/board/view";
  }
}

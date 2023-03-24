package com.jjang051.replyboard.service;

import com.jjang051.replyboard.dto.ReplyBoardDto;
import java.util.List;

public interface ReplyBoardService {
  List<ReplyBoardDto> getAllReplyBoard();
  int insertBoard(ReplyBoardDto replyBoardDto);
  int getMaxReGroup();
  ReplyBoardDto getSelectedBoard(int no);
  int insertReplyBoard(ReplyBoardDto replyBoardDto);
  int updateRelevel(ReplyBoardDto replyBoardDto);
}

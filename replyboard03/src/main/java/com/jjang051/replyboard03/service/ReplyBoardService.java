package com.jjang051.replyboard03.service;

import com.jjang051.replyboard03.dto.ReplyBoardDto;
import java.util.List;

public interface ReplyBoardService {
  public int insertBoard(ReplyBoardDto replyBoardDto);

  public List<ReplyBoardDto> getAllBoardList();
}

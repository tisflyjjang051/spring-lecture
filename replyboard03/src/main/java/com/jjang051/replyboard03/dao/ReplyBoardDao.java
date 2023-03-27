package com.jjang051.replyboard03.dao;

import com.jjang051.replyboard03.dto.ReplyBoardDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyBoardDao {
  int insertBoard(ReplyBoardDto replyBoardDto);
}

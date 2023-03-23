package com.jjang051.replyboard.dao;

import com.jjang051.replyboard.dto.ReplyBoardDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReplyBoardDao {
  List<ReplyBoardDto> getAllReplyBoard();
  int insertReplyBoard(ReplyBoardDto replyBoardDto);
}

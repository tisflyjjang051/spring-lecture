package com.jjang051.ch04.dao;

import com.jjang051.ch04.dto.BoardDto;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {
  ArrayList<BoardDto> getAllBoard();
  int insertBoard(BoardDto boardDto);
}

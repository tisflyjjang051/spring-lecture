package com.jjang051.replyboard.service;

import com.jjang051.replyboard.dao.ReplyBoardDao;
import com.jjang051.replyboard.dto.ReplyBoardDto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReplyBoardServiceImpl implements ReplyBoardService {

  @Autowired
  ReplyBoardDao replyBoardDao;

  public ReplyBoardServiceImpl() {
    log.info("===============ReplyBoardService===========");
  }

  public List<ReplyBoardDto> getAllReplyBoard() {
    return replyBoardDao.getAllReplyBoard();
  }

  public int insertBoard(ReplyBoardDto replyBoardDto) {
    int maxRegroup = getMaxReGroup();
    replyBoardDto.setReGroup(maxRegroup + 1);
    replyBoardDto.setReLevel(1);
    replyBoardDto.setReStep(1);
    return replyBoardDao.insertBoard(replyBoardDto);
  }

  public int insertReplyBoard(ReplyBoardDto replyBoardDto) {
    // front에서 넘어온 값
    int reGroup = replyBoardDto.getReGroup();
    int reLevel = replyBoardDto.getReLevel();
    int reStep = replyBoardDto.getReStep();

    // 증가 시키기
    updateRelevel(replyBoardDto);

    replyBoardDto.setReGroup(reGroup);
    replyBoardDto.setReLevel(reLevel + 1);
    replyBoardDto.setReStep(reStep + 1);

    return replyBoardDao.insertReplyBoard(replyBoardDto);
  }

  public int getMaxReGroup() {
    return replyBoardDao.getMaxReGroup();
  }

  public ReplyBoardDto getSelectedBoard(int no) {
    return replyBoardDao.getSelectedBoard(no);
  }

  public int updateRelevel(ReplyBoardDto replyBoardDto) {
    return replyBoardDao.updateRelevel(replyBoardDto);
  }
}

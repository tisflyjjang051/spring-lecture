package com.jjang051.replyboard03.service;

import com.jjang051.replyboard03.dao.MemberDao;
import com.jjang051.replyboard03.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

  @Autowired
  MemberDao memberDao;

  public int insertMember(MemberDto memberDto) {
    int result = memberDao.insertMember(memberDto);
    return result;
  }

  @Override
  public MemberDto loginMember(MemberDto memberDto) {
    MemberDto loginMemberDto = memberDao.loginMember(memberDto);
    return loginMemberDto;
  }
}

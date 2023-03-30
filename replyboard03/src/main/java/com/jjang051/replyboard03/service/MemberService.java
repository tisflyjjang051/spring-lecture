package com.jjang051.replyboard03.service;

import com.jjang051.replyboard03.dto.MemberDto;

public interface MemberService {
  public int insertMember(MemberDto memberDto);

  public MemberDto loginMember(MemberDto memberDto);
}

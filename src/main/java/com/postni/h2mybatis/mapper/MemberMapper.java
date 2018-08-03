package com.postni.h2mybatis.mapper;

import com.postni.h2mybatis.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public int createMember(Member member);
    public List getMembers();
    public Member getMember(String id);
}

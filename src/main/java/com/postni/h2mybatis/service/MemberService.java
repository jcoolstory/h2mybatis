package com.postni.h2mybatis.service;

import com.postni.h2mybatis.domain.Member;
import com.postni.h2mybatis.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> getUsers() {
        return this.memberMapper.getMembers();
    }

    public boolean loginCheck(String id, String password) {
        Member member = this.memberMapper.getMember(id);
        if (member != null)
            return member.getPassword().equals( password);
        return false;
    }

    public Member getUser(String id) {
        return this.memberMapper.getMember(id);
    }

    public Member getMemberDetail(String id) {
        return this.memberMapper.getMemberDetail(id);
    }
}

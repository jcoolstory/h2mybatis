package com.postni.h2mybatis.mapper;

import com.postni.h2mybatis.domain.Board;
import com.postni.h2mybatis.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    long createBoard(Board board);
    long updateBoard(Board board);
    long deleteBoard(long boardNo);

    List getBoardList();
    Board getBoard(long boardNo);
    List getComments(long boardNo);
    int writeComment(Comment comment);
    int incrementBoardHit(long no);
}

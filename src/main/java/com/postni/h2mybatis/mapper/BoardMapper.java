package com.postni.h2mybatis.mapper;

import com.postni.h2mybatis.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public long createBoard(Board board);
    public long updateBoard(Board board);
    public long deleteBoard(int boardNo);

    public List getBoardList();
    public Board getBoard(int boardNo);

}

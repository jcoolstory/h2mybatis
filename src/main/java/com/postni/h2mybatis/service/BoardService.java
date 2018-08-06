package com.postni.h2mybatis.service;

import com.postni.h2mybatis.domain.Board;
import com.postni.h2mybatis.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public long createBoard(Board board)  {
        return boardMapper.createBoard(board);
    }

    public long updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    public long deleteBoard(int boardNo) {
        return boardMapper.deleteBoard(boardNo);
    }

    public List getBoardList() {
        return boardMapper.getBoardList();
    }

    public Board getBoard(int boardNo) {
        return boardMapper.getBoard(boardNo);
    }
}

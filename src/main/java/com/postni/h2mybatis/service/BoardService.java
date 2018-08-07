package com.postni.h2mybatis.service;

import com.postni.h2mybatis.domain.Board;
import com.postni.h2mybatis.domain.Comment;
import com.postni.h2mybatis.exceptions.WebPageNotFundException;
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

    public long deleteBoard(long boardNo) {
        return boardMapper.deleteBoard(boardNo);
    }

    public List getBoardList() {
        return boardMapper.getBoardList();
    }

    public Board getBoard(long boardNo) {

        Board board = boardMapper.getBoard(boardNo);
        if (board == null)
            throw new WebPageNotFundException("No such page");

        boardMapper.getComments(boardNo);
        incrementBoardHit(board.getNo());

        return board;
    }

    public int writeComment(Comment comment) {
        return boardMapper.writeComment(comment);
    }

    public int incrementBoardHit(long no) {
        return boardMapper.incrementBoardHit(no);
    }
}

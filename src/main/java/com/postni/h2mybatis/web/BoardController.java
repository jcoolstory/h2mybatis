package com.postni.h2mybatis.web;

import com.postni.h2mybatis.domain.Board;
import com.postni.h2mybatis.domain.Member;
import com.postni.h2mybatis.mapper.BoardMapper;
import com.postni.h2mybatis.util.LoginRequire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardMapper boardMapper;

    @RequestMapping(value="")
    public String getBoardList(Model model) {

        model.addAttribute("boards",boardMapper.getBoardList());
        return "board/boards.jsp";
    }

    @RequestMapping(value="/{no}")
    public String getBoard(@PathVariable int no, Model model){

        model.addAttribute("board",boardMapper.getBoard(no));
        return "board/boardDetail.jsp";
    }

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public String createBoardGet(Model model, HttpSession session) {

        if (!LoginRequire.isLogin(session)){
            return "redirect:/";
        }

        return "board/createBoard.jsp";
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String createBoardPost(@ModelAttribute Board board, HttpSession session) {

        String id = LoginRequire.getLoginId(session);
        if (":::guest:::".equals(id)) {
            return "redirect:/";
        }

        Member member = new Member();

        member.setId(id);
        board.setAuthor(member);

        boardMapper.createBoard(board);
        return "redirect:/";
    }

}

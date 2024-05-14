package com.springclass.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springclass.bbs.domain.Board;
import com.springclass.bbs.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value= {"/boardList","list"})
	public String boardList(Model model) {
		List<Board> bList = boardService.boardList();
		model.addAttribute("bList",bList);
		return "boardList";
	}
}

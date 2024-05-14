package com.springclass.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springclass.bbs.dao.BoardDao;
import com.springclass.bbs.domain.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao  boardDao;

	@Override
	public List<Board> boardList() {
		return boardDao.boardList();
	}

	@Override
	public Board getBoard(int no) {
		return boardDao.getBoard(no);
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String isPassCheck(int no, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}

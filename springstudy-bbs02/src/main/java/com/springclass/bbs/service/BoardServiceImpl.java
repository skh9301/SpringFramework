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
		boardDao.updateBoard(board);
	}

	@Override
	public void deleteBoard(int no) {
		boardDao.deleteBoard(no);
	}

	@Override
	public void insertBoard(Board board) {
		boardDao.insertBoard(board);
	}

	@Override
	public boolean isPassCheck(int no, String pass) {
		boolean result = false;
		String dbPass =boardDao.isPassCheck(no, pass);
		if(dbPass.equals(pass)) {
			result=true;
		}
		return result;
	}

}

package com.springclass.bbs.service;

import java.util.List;

import com.springclass.bbs.domain.Board;

public interface BoardService {
	
	//보드리스트 출력
	public abstract List<Board> boardList();
	
	//리스트중 1개출력
	public abstract Board getBoard(int no);
	//보드 수정
	public abstract void updateBoard(Board board);
	//보드 삭제
	public abstract void deleteBoard(int no);
	//보드 추가
	public abstract void insertBoard(Board board);
	//비번 유효성검사
	public String isPassCheck(int no , String pass);
	
}

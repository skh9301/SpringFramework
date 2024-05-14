package com.springclass.bbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springclass.bbs.domain.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	private final String NAME_SPACE = "com.springclass.bbs.mapper.BoardMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Board> boardList() {
		
		return sqlSession.selectList(NAME_SPACE+".boardList");
	}

	@Override
	public Board getBoard(int no) {
		return sqlSession.selectOne(NAME_SPACE+".getBoard",no);
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

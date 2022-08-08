package com.myspring.pro30.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.board.vo.ArticleVO;


public interface BoardDAO {
	//글목록
	public List selectAllArticlesList() throws DataAccessException;
	// 글목록 페이지버전
	public List selectAllArticles2(Map pagingMap) throws DataAccessException;
	public int selectToArticles() throws DataAccessException;
	
	//새글
	public int insertNewArticle(Map articleMap) throws DataAccessException;
	public void insertNewImage(Map articleMap) throws DataAccessException;
	
	public ArticleVO selectArticle(int articleNO) throws DataAccessException;
	// 수정
	public void updateArticle(Map articleMap) throws DataAccessException;
	public void updateImages(Map articleMap) throws DataAccessException;
	
	public void deleteArticle(int articleNO) throws DataAccessException;
	
	public List selectImageFileList(int articleNO) throws DataAccessException;
}

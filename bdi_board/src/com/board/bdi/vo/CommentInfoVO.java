package com.board.bdi.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 댓글정보 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class CommentInfoVO implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 댓글번호. */
	private Integer cinum;

	/** 댓글내용. */
	private String citext;

	/** 댓글수정일. */
	private String cimoddat;

	/** 댓글등록일. */
	private String cicredat;

	/** 유저정보. */
	private UserInfoVO userInfo;

	/** 게시판. */
	private BoardInfoVO boardInfo;

	/**
	 * 생성자.
	 */
	public CommentInfoVO() {
	}

	/**
	 * 댓글번호을 설정합니다..
	 * 
	 * @param cinum
	 *            댓글번호
	 */
	public void setCinum(Integer cinum) {
		this.cinum = cinum;
	}

	/**
	 * 댓글번호을 가져옵니다..
	 * 
	 * @return 댓글번호
	 */
	public Integer getCinum() {
		return this.cinum;
	}

	/**
	 * 댓글내용을 설정합니다..
	 * 
	 * @param citext
	 *            댓글내용
	 */
	public void setCitext(String citext) {
		this.citext = citext;
	}

	/**
	 * 댓글내용을 가져옵니다..
	 * 
	 * @return 댓글내용
	 */
	public String getCitext() {
		return this.citext;
	}

	/**
	 * 댓글수정일을 설정합니다..
	 * 
	 * @param cimoddat
	 *            댓글수정일
	 */
	public void setCimoddat(String cimoddat) {
		this.cimoddat = cimoddat;
	}

	/**
	 * 댓글수정일을 가져옵니다..
	 * 
	 * @return 댓글수정일
	 */
	public String getCimoddat() {
		return this.cimoddat;
	}

	/**
	 * 댓글등록일을 설정합니다..
	 * 
	 * @param cicredat
	 *            댓글등록일
	 */
	public void setCicredat(String cicredat) {
		this.cicredat = cicredat;
	}

	/**
	 * 댓글등록일을 가져옵니다..
	 * 
	 * @return 댓글등록일
	 */
	public String getCicredat() {
		return this.cicredat;
	}

	/**
	 * 유저정보을 설정합니다..
	 * 
	 * @param userInfo
	 *            유저정보
	 */
	public void setUserInfo(UserInfoVO userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * 유저정보을 가져옵니다..
	 * 
	 * @return 유저정보
	 */
	public UserInfoVO getUserInfo() {
		return this.userInfo;
	}

	/**
	 * 게시판을 설정합니다..
	 * 
	 * @param boardInfo
	 *            게시판
	 */
	public void setBoardInfo(BoardInfoVO boardInfo) {
		this.boardInfo = boardInfo;
	}

	/**
	 * 게시판을 가져옵니다..
	 * 
	 * @return 게시판
	 */
	public BoardInfoVO getBoardInfo() {
		return this.boardInfo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cinum == null) ? 0 : cinum.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CommentInfoVO other = (CommentInfoVO) obj;
		if (cinum == null) {
			if (other.cinum != null) {
				return false;
			}
		} else if (!cinum.equals(other.cinum)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CommentInfoVO [cinum=" + cinum + ", citext=" + citext + ", cimoddat=" + cimoddat + ", cicredat="
				+ cicredat + ", userInfo=" + userInfo + ", boardInfo=" + boardInfo + "]";
	}

}

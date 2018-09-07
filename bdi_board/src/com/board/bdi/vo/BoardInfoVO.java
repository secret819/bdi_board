package com.board.bdi.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 게시판 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BoardInfoVO implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시판번호. */
	private Integer binum;

	/** 게시판제목. */
	private String bititle;

	/** 게시판내용. */
	private String bitext;

	/** 게시판파일. */
	private String bifile;

	/** 게시판등록일자. */
	private String bicredate;

	/** 게시판수정일자. */
	private String bimoddat;

	/** 게시판조회수. */
	private Integer bicnt;

	/** 게시판활성여부. */
	private Byte biactive;

	/** 유저정보. */
	private UserInfoVO userInfo;

	/** 댓글정보 목록. */
	private Set<CommentInfoVO> commentInfoSet;

	/**
	 * 생성자.
	 */
	public BoardInfoVO() {
		this.commentInfoSet = new HashSet<CommentInfoVO>();
	}

	/**
	 * 게시판번호을 설정합니다..
	 * 
	 * @param binum
	 *            게시판번호
	 */
	public void setBinum(Integer binum) {
		this.binum = binum;
	}

	/**
	 * 게시판번호을 가져옵니다..
	 * 
	 * @return 게시판번호
	 */
	public Integer getBinum() {
		return this.binum;
	}

	/**
	 * 게시판제목을 설정합니다..
	 * 
	 * @param bititle
	 *            게시판제목
	 */
	public void setBititle(String bititle) {
		this.bititle = bititle;
	}

	/**
	 * 게시판제목을 가져옵니다..
	 * 
	 * @return 게시판제목
	 */
	public String getBititle() {
		return this.bititle;
	}

	/**
	 * 게시판내용을 설정합니다..
	 * 
	 * @param bitext
	 *            게시판내용
	 */
	public void setBitext(String bitext) {
		this.bitext = bitext;
	}

	/**
	 * 게시판내용을 가져옵니다..
	 * 
	 * @return 게시판내용
	 */
	public String getBitext() {
		return this.bitext;
	}

	/**
	 * 게시판파일을 설정합니다..
	 * 
	 * @param bifile
	 *            게시판파일
	 */
	public void setBifile(String bifile) {
		this.bifile = bifile;
	}

	/**
	 * 게시판파일을 가져옵니다..
	 * 
	 * @return 게시판파일
	 */
	public String getBifile() {
		return this.bifile;
	}

	/**
	 * 게시판등록일자을 설정합니다..
	 * 
	 * @param bicredate
	 *            게시판등록일자
	 */
	public void setBicredate(String bicredate) {
		this.bicredate = bicredate;
	}

	/**
	 * 게시판등록일자을 가져옵니다..
	 * 
	 * @return 게시판등록일자
	 */
	public String getBicredate() {
		return this.bicredate;
	}

	/**
	 * 게시판수정일자을 설정합니다..
	 * 
	 * @param bimoddat
	 *            게시판수정일자
	 */
	public void setBimoddat(String bimoddat) {
		this.bimoddat = bimoddat;
	}

	/**
	 * 게시판수정일자을 가져옵니다..
	 * 
	 * @return 게시판수정일자
	 */
	public String getBimoddat() {
		return this.bimoddat;
	}

	/**
	 * 게시판조회수을 설정합니다..
	 * 
	 * @param bicnt
	 *            게시판조회수
	 */
	public void setBicnt(Integer bicnt) {
		this.bicnt = bicnt;
	}

	/**
	 * 게시판조회수을 가져옵니다..
	 * 
	 * @return 게시판조회수
	 */
	public Integer getBicnt() {
		return this.bicnt;
	}

	/**
	 * 게시판활성여부을 설정합니다..
	 * 
	 * @param biactive
	 *            게시판활성여부
	 */
	public void setBiactive(Byte biactive) {
		this.biactive = biactive;
	}

	/**
	 * 게시판활성여부을 가져옵니다..
	 * 
	 * @return 게시판활성여부
	 */
	public Byte getBiactive() {
		return this.biactive;
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
	 * 댓글정보 목록을 설정합니다..
	 * 
	 * @param commentInfoSet
	 *            댓글정보 목록
	 */
	public void setCommentInfoSet(Set<CommentInfoVO> commentInfoSet) {
		this.commentInfoSet = commentInfoSet;
	}

	/**
	 * 댓글정보를 추가합니다..
	 * 
	 * @param commentInfo
	 *            댓글정보
	 */
	public void addCommentInfo(CommentInfoVO commentInfo) {
		this.commentInfoSet.add(commentInfo);
	}

	/**
	 * 댓글정보 목록을 가져옵니다..
	 * 
	 * @return 댓글정보 목록
	 */
	public Set<CommentInfoVO> getCommentInfoSet() {
		return this.commentInfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((binum == null) ? 0 : binum.hashCode());
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
		BoardInfoVO other = (BoardInfoVO) obj;
		if (binum == null) {
			if (other.binum != null) {
				return false;
			}
		} else if (!binum.equals(other.binum)) {
			return false;
		}
		return true;
	}

}

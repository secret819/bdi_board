package com.board.bdi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.bdi.dao.BoardDAO;
import com.board.bdi.vo.BoardInfoVO;

public class BoardDAOImpl implements BoardDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;	
	
	@Override
	public void setCon(Connection con) {
		this.con = con;
	}

	@Override
	public int insertBoard(BoardInfoVO bi) throws SQLException {
		String sql = "insert into board_info(bititle, bitext, bicredat, bimoddat, bicnt, biactive, uinum, bifile)";
		sql += " values(?,?,now(),now(),0,1,?,?)";
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, bi.getBititle());
			ps.setString(2, bi.getBitext());
			ps.setInt(3, bi.getUinum());
			ps.setString(4, bi.getBifile());
			return ps.executeUpdate();
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public BoardInfoVO selectBoard(BoardInfoVO bi) throws SQLException {
		String sql = "select bi.*,ui.name from board_info bi,\r\n" + 
				"user_info ui\r\n" + 
				"where\r\n" + 
				"ui.uinum = bi.uinum\r\n" +
				"and bi.BINUM=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bi.getBinum());
			rs = ps.executeQuery();
			while(rs.next()) {
				bi = new BoardInfoVO();
				bi.setBinum(rs.getInt("binum"));
				bi.setBititle(rs.getString("bititle"));
				bi.setBitext(rs.getString("bitext"));
				bi.setBifile(rs.getString("bifile"));
				bi.setBicredat(rs.getString("bicredat"));
				bi.setBimoddat(rs.getString("bimoddat"));
				bi.setBicnt(rs.getInt("bicnt"));
				bi.setUinum(rs.getInt("uinum"));
				bi.setUiname(rs.getString("uiname"));
				return bi;
			}			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		return null;
	}

	@Override
	public List<BoardInfoVO> selectBoardList(BoardInfoVO bi) throws SQLException {
		String sql = "select * from board_info";
		List<BoardInfoVO> biList = new ArrayList<BoardInfoVO>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				bi = new BoardInfoVO();
				bi.setBinum(rs.getInt("binum"));
				bi.setBititle(rs.getString("bititle"));
				bi.setBitext(rs.getString("bitext"));
				bi.setBifile(rs.getString("bifile"));
				bi.setBicredat(rs.getString("bicredat"));
				bi.setBimoddat(rs.getString("bimoddat"));
				bi.setBicnt(rs.getInt("bicnt"));
				bi.setUinum(rs.getInt("uinum"));
				biList.add(bi);
			}
			return biList;
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}
	
	private void close() {
		if(rs!=null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

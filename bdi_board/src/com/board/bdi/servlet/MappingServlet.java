package com.board.bdi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.bdi.common.ParseUtil;
import com.board.bdi.vo.CommentInfoVO;

@WebServlet("/mapping/*")
public class MappingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MappingServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommentInfoVO ci = ParseUtil.parseRequest(request,CommentInfoVO.class);
		System.out.println(ci);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

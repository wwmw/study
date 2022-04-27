package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/slc")
public class ServletLifecycle extends HttpServlet {

	// servlet ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-- doGet() --");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("-- postConstruct() --");
	}

	// servlet ����
	@Override
	public void init() throws ServletException {
		System.out.println("-- init() --");
	}
	
	// servlet ����
	@Override
	public void destroy() {
		System.out.println("-- destroy() --");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("-- preDestroy() --");
	}
}

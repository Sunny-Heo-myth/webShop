package com.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.util.DeptDTO;
import com.kosta.util.DeptService;

/**
 * Servlet implementation class DeptDetailServlet
 */
@WebServlet("/dept/deptDetail")
public class DeptDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptId = request.getParameter("deptid");
		int deptid = Integer.parseInt(deptId);
		String path = getServletContext().getRealPath(".");
		DeptService service = new DeptService(path);
		DeptDTO dept = service.selectByIDService(deptid);
		request.setAttribute("dept", dept);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("deptDetail.jsp");
		rd.forward(request, response);
			
	}



}

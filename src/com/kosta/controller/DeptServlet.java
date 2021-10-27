package com.kosta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.util.DeptDTO;
import com.kosta.util.DeptService;

/**
 * Servlet implementation class DeptServlet
 */
@WebServlet("/dept/deptlist")
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = getServletContext().getRealPath(".");
		System.out.println(path);
		
		DeptService service = new DeptService(path);
		List<DeptDTO> deptlist = service.selectALLService();
		request.setAttribute("deptlistInfo", deptlist);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("deptAll.jsp");
		rd.forward(request, response);
	}

}

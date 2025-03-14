package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Batch;
import dao.batchdao;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchController() {
        super();
        // TODO Auto-generated constructor stub
    }
    batchdao bd = new batchdao();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		bd.viewAllBatch();
		//System.err.println(bd.viewAllBatch());
		List<Batch> listOfBatch = bd.viewAllBatch();
		System.out.println(listOfBatch);
		HttpSession hs = request.getSession();
		hs.setAttribute("batches", listOfBatch);
		
		response.sendRedirect("viewBatch.jsp");
		
		RequestDispatcher rd = request.getRequestDispatcher("addbatch.jsp");
		
		rd.include(request, response);
		response.setContentType("text/html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
    	
		String bid = request.getParameter("bid");
        String weekday = request.getParameter("weekday");
        String time = request.getParameter("time");
        
        System.out.println(bid);
        System.out.println(weekday);
        
                
        Batch bb = new Batch();
		bb.setbId(bid);
		bb.setWeekday(weekday);
		bb.setTime(time);
		int result = bd.storeBatchinfo(bb);
		RequestDispatcher rd = request.getRequestDispatcher("addbatch.jsp");
		rd.include(request, response);
		response.setContentType("text/html");
		
        response.getWriter().println("<h1 <p style=\"color: green;\">Form Submitted Successfully!</h1>");
        response.getWriter().println("<p>Batch Id: " + bid + "</p>");
        response.getWriter().println("<p>Day of the week: " + weekday + "</p>");
        response.getWriter().println("<p>Time of day: " + time + "</p>");

	}

}

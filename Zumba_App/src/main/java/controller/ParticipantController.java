package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Participants;
import dao.participantsdao;

/**
 * Servlet implementation class ParticipantController
 */
@WebServlet("/ParticipantController")
public class ParticipantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParticipantController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    participantsdao pd = new participantsdao();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
        	String pname = request.getParameter("pname");
            String email = request.getParameter("email");
            String pnumber = request.getParameter("pnumber");

            Participants participant = new Participants();
            participant.setpname(pname);
            participant.setemail(email);
            participant.setpnumber(pnumber);
            
            pd.storeParticipantinfo(participant);
            
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
    		rd.include(request, response);
    		response.setContentType("text/html");
    		
            System.out.println(email);
            System.out.println(pnumber);
            response.getWriter().append("form submitted");
  

}}

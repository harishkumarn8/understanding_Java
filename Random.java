package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Random
 */
@WebServlet({ "/Random", "/random" })
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random() {
        super();
        // TODO Auto-generated constructor stub
    }

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
	//	doGet(request, response);
		 String s=request.getParameter("username");
	      String p = request.getParameter("userpass");
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Hello</title>");
	      out.println("</head>");
	      out.println("<body >");
	      out.println("<p>Random numbers are</p>");
	      out.println("<ul>");
	      out.println("<li>");
	      out.println(Math.random());
	      out.println("</li>");
	      out.println("<li>");
	      out.println(Math.random());
	      out.println("</li>");
	      out.println("<li>");
	      out.println(Math.random());
	      out.println("</li>");
	      out.println("<li>");
	      out.println(Math.random());
	      out.println("<li>");
	      out.println("</ul>");
	      out.println("</body>");
	      out.println("</html>");
	   
	}

}

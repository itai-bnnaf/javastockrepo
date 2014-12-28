package com.t2k.javacourse;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyProjectServlet extends HttpServlet {
	byte num1 = 4, num2 = 3, num3 = 7;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Result of (" + num1 + "+" + num2 +")*" + num3 + "=" + "<span style=\"font-style:italic; color:red;\">	" + (num1+num2)*num3 + "</span></h1>");
	}	
}
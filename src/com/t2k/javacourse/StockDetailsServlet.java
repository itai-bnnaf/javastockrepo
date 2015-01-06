package com.t2k.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;


@SuppressWarnings("serial")
public class StockDetailsServlet extends HttpServlet {
	
	
	public Stock stock1 = new Stock ("PIH", 13.1f, 12.4f);
	public Stock stock2 = new Stock ("AAL", 5.78f, 5.5f);
	public Stock stock3 = new Stock ("CAAS", 32.2f, 31.5f);
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			resp.setContentType("text/html");
			resp.getWriter().println("<h1>Exercise 4: Stock Details</h1>"
					+ "<br><table Style=\"width: 25%; text-align: left;\"><tr style=\"color: white; background-color: #2E74B5;\"><th>#</th><th>Symbol</th><th>ask</th><th>bid</th><th>date</th></tr>"
					+ "<tr><td><b>1.</b></td>" + stock1.getHtmlDescription() + "</tr><tr style=\"background-color: lightgray;\"><td><b>2.</b></td>" + stock2.getHtmlDescription() + "</tr><tr><td><b>3.</b></td>" +stock3.getHtmlDescription() + "</tr></table><br>"
					+ "<div style=\"font-style: italic; font-family: arial; color: gray;\"><b>NOTE:</b><br>"
					+ "<ul>"
					+ "<li> I created one date for all the stocks because I couldn't make it work when the creation of new Date object was within the costructor</li>"
					+ "<li>I Didn't succeed setting a specific date in the date data member</li></ul></div>");
	}
}

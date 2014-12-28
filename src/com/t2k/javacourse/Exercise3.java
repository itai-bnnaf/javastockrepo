package com.t2k.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;


@SuppressWarnings("serial")
public class Exercise3 extends HttpServlet {
	
	// Circle Area calculation
	int radius = 50; //declaring a constant. the value is in cm.
	double circleArea = Math.PI*radius*radius; //declaring a variable and assigning its value by calculation of circle area.
	DecimalFormat df = new DecimalFormat ("0.000");	// Formating decimals number to show only 3 figures after the decimal point. 	
	
	// Opposite length
	int angleB = 30; //degress
	int hypotenuse = 50; //cm
	double angleBRadian = Math.toRadians(angleB); // converting the angle to Radians
	double oppositeLength = hypotenuse*Math.sin(angleBRadian); //calculating the Opposite
	
	// Power 20 E13
	double powerResult = Math.pow(20,13); //20 power 13.
	
	// Print to Screen
	String line1 = new String("<li>Area of a circle with radius of " + radius + "cm is: <b>" + df.format(circleArea) + "</b> square-cm (rounded).</li>"); 
	String line2 = new String("<li>Length of opposite where angle B is 30 degrees and Hypotenuse length is 50cm is: <b>" + oppositeLength +"</b>cm.</li>");
	String line3 = new String("<li>Power of 20 with exp of 13 is: <b>" + powerResult + "</b> .</li>");
	String resultString = new String("<ol>" + line1 + line2 + line3 +"</ol>");
			
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			resp.setContentType("text/html");
			resp.getWriter().println("<h1>Exercise 3: Calculations</h1>"
					+ resultString);
	}
}

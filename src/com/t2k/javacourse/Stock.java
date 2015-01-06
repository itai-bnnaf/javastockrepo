package com.t2k.javacourse;
import java.text.*;
import java.util.Date;

public class Stock {
	
	// Data members	
	private String symbol;
	private float ask; 
	private float bid;
	SimpleDateFormat sdf = new SimpleDateFormat ("MM/dd/yyyy");
	private Date date = new Date();
	String  stockHtmlDetailsString; 
	
	//Constructors
	public Stock (){//setting the default values for new Stock objects
		symbol = "Undefined";
		ask = (float) 0.0;
		bid = (float) 0.0;
	}
	
	
	public Stock (String stockSymbol, float stockAsk, float stockBid) { //setting stock objects parameters definition
		symbol = stockSymbol;
		ask = stockAsk;
		bid = stockBid;
	}
		
	//Methods
	public void setStockHtmlDetailsString() {
	}
	
	public String getSymbol() { //getter for symbol
		return symbol;
	}
	
	public void setSymbol(String stockSymbol) { //setter for symbol
		symbol = stockSymbol;
	}
	
	public float getAsk() { //getter for ask
		return ask;
	}
	
	public void setAsk(float stockAsk) { //setter for ask
		ask = stockAsk;
	}
	
	public float getBid() { //getter for bid
		return bid;
	}
	
	public void setBid(float stockBid) { //setter for bid
		bid = stockBid;
	}
	
	public Date getDate() { //getter for date
		return date;
	}
	
	public void setDate() { //setter for date
	}
	
	public String getHtmlDescription(){
		return new String ("<td>" + getSymbol() + "</td><td>" + getAsk() + "</td><td>" + getBid()+ "</td><td>" + sdf.format(getDate())+ "</td>"); 
	}
}

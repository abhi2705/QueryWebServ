package com.web.csi;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Query
 */
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
/*    public void run(HttpServletResponse response) {
    	 
    	response.setContentType("text/html");
		
    	URL url = getClass().getResource("hello.csv");
    	
        String csvFile = url.getPath();
        BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
     
    	try {
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		out.println("<table border=\"2\">");
			
    		while ((line = br.readLine()) != null) {
     
   			line = line.replace("\"","");
    			String[] data = line.split(cvsSplitBy);
    			out.println("<tr>");
    			for(int i=0;i<data.length;i++)
    			{
    				if(data[i].equals(""))
    				{
    				out.println("<td>"+"</td>");
    				continue;
    				}
   // 				System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    //			System.out.println();
    			
    		}
    		out.println("</tr>");
    		out.println("</table>");
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		if (br != null) {
    			try {
    				br.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
     
    	System.out.println("Done");
      }
    
    */
    public void search(HttpServletResponse response,String name) {
   	 
    	response.setContentType("text/html");
    	
    	URL url = getClass().getResource("hello.csv");
//    	
        String csvFile = url.getPath();
 //   	String csvFile = "";
    	//System.out.println(csvFile);
    	BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
     
    	try {
    		
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		/*
    		out.println("<table border=\"2\">");
			
    		line = br.readLine();
    		System.out.println(line);
    		line = line.replace("\"","");
			String[] data = line.split(cvsSplitBy);
			System.out.println("Data[2]");
			System.out.println(data[2]);
			out.println("<tr>");
			for(int i=0;i<data.length;i++)
			{
				if(data[i].equals(""))
				{
				out.println("<td>"+"</td>");
				continue;
				}
				System.out.println(data[i]);
				out.println("<td><b>"+data[i]+"</b></td>");
			}
    		*/
    		while ((line = br.readLine()) != null) {
    			
   			line = line.replace("\"","");
   			System.out.println(line);
   			System.out.println("Another While");
   			 String[]  data = line.split(cvsSplitBy);
    			System.out.println(data[1]);
    			System.out.println("Name which you have passed");
    			System.out.println(name);
    			if(data[1].equals(name))
    			{
    				System.out.println("In If");
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        				System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        			System.out.println();
    			}
    			
    		}
    		out.println("</tr>");
    		out.println("</table>");
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		if (br != null) {
    			try {
    				br.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
      }
    
    
    

    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
      }
    
        
        
        
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		Query obj = new Query();
		//obj.run(response);
		String name = request.getParameter("firstName");
		//String name = JOptionPane.showInputDialog("Enter Student Name");
		obj.search(response, name);
// 		
//		out.println("Hello World");
//		
	}

}

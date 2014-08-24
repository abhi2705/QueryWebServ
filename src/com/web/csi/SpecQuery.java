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

/**
 * Servlet implementation class SpecQuery
 */
public class SpecQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpecQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
    public void run(HttpServletResponse response) {
   	 
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
    				System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    			System.out.println();
    			
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
    public void search(HttpServletResponse response,String gender,String Yantras) {
      	 
    	response.setContentType("text/html");
    	
    	URL url = getClass().getResource("hello.csv");
    	
        String csvFile = url.getPath();
    	BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
    	int count=0;
    	try {
    		//System.out.println(gender);
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		out.println("<table border=\"2\">");
			
    	/*	line = br.readLine();
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
				System.out.println(data[i]);
				out.println("<td><b>"+data[i]+"</b></td>");
			}
    		*/
    		while ((line = br.readLine()) != null) {
     
   			line = line.replace("\"","");
    		String[]	data = line.split(cvsSplitBy);
    			
    		
    		if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   Yantras.equals("All"))
			{
    			count++;
				out.println("<tr>");
    			for(int i=0;i<data.length;i++)
    			{
    				if(data[i].equals(""))
    				{
    				out.println("<td>"+"</td>");
    				continue;
    				}
    			//	System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    			//System.out.println();
			}
			
    		
    		
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[15].equals("NONE"))) || (!(data[16].equals("NONE"))) || (!(data[17].equals("NONE")))    )  &&  Yantras.equals("Sanganitra"))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[18].equals("NONE"))) || (!(data[19].equals("NONE"))) || (!(data[20].equals("NONE")))    )  &&  Yantras.equals("Vidyut"))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        		//		System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        			//System.out.println();
    			}
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[24].equals("NONE"))) || (!(data[25].equals("NONE"))) || (!(data[26].equals("NONE")))    )  &&  Yantras.equals("Yantrika"))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[21].equals("NONE"))) || (!(data[22].equals("NONE"))) || (!(data[23].equals("NONE")))  ||  (!(data[27].equals("NONE"))) ||   (!(data[28].equals("NONE")))    ||   (!(data[29].equals("NONE")))   ||    (!(data[30].equals("NONE")))   ||   (!(data[31].equals("NONE")))  ||  (!(data[32].equals("NONE")))  )  &&  Yantras.equals("NonTech"))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			
    			
    /*			
    			if(Yantras.equals("Sanganitra"))
    			{
    				if((!(data[16].equals("NONE"))) || (!(data[17].equals("NONE"))) || (!(data[18].equals("NONE")))    )
    				{	
    					count++;
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
            			
    				}
    			}
    			*/
    			
    		}
    		System.out.println(count);
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

    
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		SpecQuery obj = new SpecQuery();
		String gender = request.getParameter("gender");
		String Yantras= request.getParameter("Yantras");
	//	System.out.println(gender);
		obj.search(response,gender,Yantras);
		
		
		
		//out.println("Hello World");
		
	}

}

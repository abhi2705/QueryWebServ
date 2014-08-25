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
    public void search(HttpServletResponse response,String gender,String Yantras, String Test,String Sang_score,String Vid_score,String Yan_score) {
      	 
    	response.setContentType("text/html");
    	
    	URL url = getClass().getResource("hello.csv");
    	
        String csvFile = url.getPath();
    	BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
    	int count=0; 
    	Double score,sanscore,vidscore,yanscore;
    	sanscore=Double.valueOf(Sang_score);
    	vidscore=Double.valueOf(Vid_score);
    	yanscore=Double.valueOf(Yan_score);
   /* 	if(Sang_score.equals("NONE"))
    	{
    		 sanscore=0.0;
    	}
    	
    	if(Vid_score.equals("NONE"))
    	{
    		 vidscore=0.0;
    	}
    	
    	if(Yan_score.equals("NONE"))
    	{
    		 yanscore=0.0;
    	}
    */	
    	score= Double.valueOf(Test);
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
    		
    		Double apti= Double.valueOf(data[37]);
    		Double s1=Double.valueOf(data[38]);
    		Double s2=Double.valueOf(data[39]);
    		Double s3=Double.valueOf(data[40]);
    		
    		if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   Yantras.equals("All")   && ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore) ))
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
			
    		
    		
   			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[15].equals("NONE"))) || (!(data[16].equals("NONE"))) || (!(data[17].equals("NONE")))    )  &&  Yantras.equals("Sanganitra")    &&  (apti>score)    )
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
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[18].equals("NONE"))) || (!(data[19].equals("NONE"))) || (!(data[20].equals("NONE")))    )  &&  Yantras.equals("Vidyut")     && (apti>score)       )
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
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[24].equals("NONE"))) || (!(data[25].equals("NONE"))) || (!(data[26].equals("NONE")))    )  &&  Yantras.equals("Yantrika")    &&     (apti>score) )
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
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[21].equals("NONE"))) || (!(data[22].equals("NONE"))) || (!(data[23].equals("NONE")))  ||  (!(data[27].equals("NONE"))) ||   (!(data[28].equals("NONE")))    ||   (!(data[29].equals("NONE")))   ||    (!(data[30].equals("NONE")))   ||   (!(data[31].equals("NONE")))  ||  (!(data[32].equals("NONE")))  )  &&  Yantras.equals("NonTech")    &&     (apti>score) )
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
    		out.println(count);
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
		String Test= request.getParameter("test");
		String Sang_score=request.getParameter("Sang_score");
		String Vid_score=request.getParameter("Vid_score");
		String Yan_score=request.getParameter("Yan_score");
//		String Sang_score=request.getParameter("Sang_score");
		System.out.println(gender);
		obj.search(response,gender,Yantras,Test,Sang_score,Vid_score,Yan_score);
		
		
		
		//out.println("Hello World");
		
	}

}

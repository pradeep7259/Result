package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Student;
import Dto.Records;
@WebServlet("/insertrecord")
public class InsertRecord extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		Long mobile=Long.parseLong(req.getParameter("mobile"));
		int maths=Integer.parseInt(req.getParameter("maths"));
		int science=Integer.parseInt(req.getParameter("science"));
		int english=Integer.parseInt(req.getParameter("english"));
		
		int totalmarks=maths+science+english;
		int percentage=(totalmarks/3);
		String result="";
		String fail="Fail";
		String firstclass="FirstClass";
		String secondclass="SecondClass";
		String distinction="Distinction";
		
		Student student=new Student();
		
		Records records=new Records();	
		records.setName(name);
		records.setEmail(email);
		records.setMobile(mobile);
		records.setMaths(maths);
		records.setEnglish(english);
		records.setScience(science);
		records.setTotalmarks(totalmarks);
		records.setPercentage(percentage);
		if (percentage<35) 
		{
			records.setResult(fail);
		}
		else if (percentage>35&&percentage<60) 
		{
			records.setResult(firstclass);
		}else if (percentage>60&&percentage<85) 
		{
			records.setResult(secondclass);
		}
		else if(percentage>=85){
			records.setResult(distinction);
		}
		
		student.save(records);
		//req.setAttribute("records", student.fetchAll());
		
		resp.getWriter().print("<h1>Data Entered Successfully</h1>");
		req.getRequestDispatcher("index.jsp").include(req, resp);
	}
}

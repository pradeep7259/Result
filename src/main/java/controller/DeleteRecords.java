package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Student;
import Dto.Records;
@WebServlet("/deleterecords")
public class DeleteRecords extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		Student student=new Student();
		Records record=student.fetchRecord(id);
		
		student.remove(record);
		resp.getWriter().print("<h1> Record deleted succesintsfully</h1>");
		req.setAttribute("records", student.fetchAll());
		req.getRequestDispatcher("FetchRecord.jsp").include(req, resp);
	}
}

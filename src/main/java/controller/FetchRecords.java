package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Student;
@WebServlet("/fetchrecords")

public class FetchRecords extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student student=new Student();
		req.setAttribute("records", student.fetchAll());
		req.getRequestDispatcher("FetchRecord.jsp").include(req, resp);
	}
}

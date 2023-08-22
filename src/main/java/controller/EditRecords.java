package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Student;
@WebServlet("/editrecords")
public class EditRecords extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		Student student=new Student();
		req.setAttribute("records", student.fetchRecord(id));
		req.getRequestDispatcher("EditRecords.jsp").forward(req, resp);
	}
}

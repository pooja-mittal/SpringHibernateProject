package com.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.student.model.Student;
import com.student.service.StudentServiceInterface;

@SuppressWarnings("serial")

public class StudentController extends HttpServlet {
	ConfigurableApplicationContext beanContext;

	@Override
	public void init() throws ServletException {
		beanContext = new ClassPathXmlApplicationContext("com\\resource\\spring.xml");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String contact = req.getParameter("contact");
		String reportingManager = req.getParameter("manager");
		// send data to service class
		StudentServiceInterface stdnt = (StudentServiceInterface) beanContext.getBean("bs");
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setCity(city);
		st.setContact(contact);
		st.setReportingManager(reportingManager);
		System.out.println("student "+st);
		int i = stdnt.createStudent(st);
		if (i != 0) {
			resp.getWriter().println("successfully updated new student");
		} else {
			resp.getWriter().println("failed to update new student");
		}
	}

	@Override
	public void destroy() {
		beanContext.close();
		super.destroy();
	}

}

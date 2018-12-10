package com.student.service;

import com.student.dao.StudentDaoInterface;
import com.student.model.Student;

public class StudentServiceImplntn implements StudentServiceInterface {
	StudentDaoInterface stdntDao;

	public void setStdntDao(StudentDaoInterface stdntDao) {
		this.stdntDao = stdntDao;
	}

	@Override
	public int createStudent(Student s1) {
		return stdntDao.createStudent(s1);
	}

	@Override
	public Student findStudent(int id) {
		return stdntDao.findStudent(id);
	}
}

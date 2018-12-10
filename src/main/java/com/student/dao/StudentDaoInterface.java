package com.student.dao;

import com.student.model.Student;

public interface StudentDaoInterface {
	
	public int createStudent(Student s1);
	public Student findStudent(int id);

}

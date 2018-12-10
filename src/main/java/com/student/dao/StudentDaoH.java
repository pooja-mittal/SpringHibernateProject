package com.student.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.student.model.Student;

public class StudentDaoH implements StudentDaoInterface {

	HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int createStudent(Student s1) {
		int i = (Integer) ht.save(s1);
		return i;
	}

	@Override
	public Student findStudent(int id) {
		Object obj = ht.get(StudentDaoH.class, id);
		Student studnt = (Student) obj;
		return studnt;
	}

}

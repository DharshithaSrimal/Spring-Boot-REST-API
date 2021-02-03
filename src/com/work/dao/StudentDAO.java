package com.work.dao;

import java.util.List;
import com.work.entity.Student;

public interface StudentDAO {
	
	public void saveStudentObj(Student studentObj);
	 
	public List<Student> getAllStudents();
	 
	public Student getStudentObj(int theId);
	 
	public void removeStudentObj(int theId);
}
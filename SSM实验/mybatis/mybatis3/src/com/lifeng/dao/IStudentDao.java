package com.lifeng.dao;

import java.util.List;

import com.lifeng.entity.Student;

public interface IStudentDao {
	//查找全部学生
	public List<Student> findAllStudents();
}

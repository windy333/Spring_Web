package com.lifeng.dao;

import java.util.List;

import com.lifeng.entity.Student;

public interface IStudentDao {
	//����ȫ��ѧ��
	public List<Student> findAllStudents();
}

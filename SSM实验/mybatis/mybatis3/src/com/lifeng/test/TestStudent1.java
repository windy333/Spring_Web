package com.lifeng.test;

import java.util.List;

import com.lifeng.dao.IStudentDao;
import com.lifeng.dao.StudentDaoImpl;
import com.lifeng.entity.Student;

public class TestStudent1 {
	public static void main(String[] args) {
		findAllStudents();
	}	
	public static void findAllStudents(){
		IStudentDao studentDao=new StudentDaoImpl();
		List<Student> sList=studentDao.findAllStudents();		
		for(int i=0;i<sList.size();i++){
			sList.get(i).show();					
		}
	}
}


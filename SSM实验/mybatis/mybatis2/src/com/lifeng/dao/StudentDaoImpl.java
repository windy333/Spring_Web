package com.lifeng.dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.lifeng.entity.Student;
import com.lifeng.utils.MyBatisUtil;

public class StudentDaoImpl implements IStudentDao{	
	
	@Override
	public List<Student> findAllStudents() {
		SqlSession session = null;
		List<Student> list = new ArrayList<Student>();
		try {			
			session = MyBatisUtil.getSession();
			list = session.selectList("com.lifeng.dao.IStudentDao.findAllStudents");	
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}

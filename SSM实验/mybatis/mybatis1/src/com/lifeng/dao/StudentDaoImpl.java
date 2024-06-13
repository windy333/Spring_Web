package com.lifeng.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.lifeng.entity.Student;

public class StudentDaoImpl implements IStudentDao{	
	@Override
	public List<Student> findAllStudents() {
		SqlSession session = null;
		List<Student> list = new ArrayList<Student>();
		try {
			//1.��ȡ�������ļ�mybatis-config.xml
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			//2.�����������ļ�mybatis-config.xml����SqlSessionFactory����factory
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			//3.����SqlSessionFactory���󴴽�SqlSession����session
			session = factory.openSession();
			//4.����SqlSession����session��selectList����ִ�в�ѯ���ݿ�Ĳ���������ӳ���Ľ������
			list = session.selectList("com.lifeng.dao.IStudentDao.findAllStudents");			
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}

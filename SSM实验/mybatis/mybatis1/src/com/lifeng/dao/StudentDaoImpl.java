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
			//1.读取主配置文件mybatis-config.xml
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			//2.根据主配置文件mybatis-config.xml构建SqlSessionFactory对象factory
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			//3.根据SqlSessionFactory对象创建SqlSession对象session
			session = factory.openSession();
			//4.调用SqlSession对象session的selectList方法执行查询数据库的操作，返回映射后的结果集合
			list = session.selectList("com.lifeng.dao.IStudentDao.findAllStudents");			
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}

package com.lifeng.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private MyBatisUtil(){
	}
	private static final String RESOURCE = "mybatis-config.xml";
	private static SqlSessionFactory sqlSessionFactory = null;
	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(RESOURCE);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			sqlSessionFactory = builder.build(reader);
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new ExceptionInInitializerError("初始化MyBatis错误，请�?查配置文件或数据�?");
			
		}
	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
	public static SqlSession getSession(){
		//sessionTL的get()方法根据当前线程返回其对应的线程内部变量�?
		//也就是我们需要的Session，多线程情况下共享数据库链接是不安全的�??
		//ThreadLocal保证了每个线程都有自己的Session�?
		SqlSession session = threadLocal.get();
		// 如果session为null，则打开�?个新的session
		if (session == null){
			session = (sqlSessionFactory !=null) ?sqlSessionFactory.openSession():null;
			threadLocal.set(session); // 5
		}
		return session;
	}
	public static void closeSession(){
		SqlSession session = (SqlSession) threadLocal.get(); // 2
		threadLocal.set(null);
		if (session !=null){
			session.close();
		}
	}
}

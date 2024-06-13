package com.lifeng.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.lifeng.entity.User;

public class UserDaoImpl implements UserDao{       
	JdbcTemplate jdbcTemplate;		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void create() {
	    String tableName = "user";
	    
	    String dropSql = "drop table if exists " + tableName;
	    jdbcTemplate.execute(dropSql);
	    String createSql = "create table " + tableName + "(uid varchar(20), uname varchar(50), gender varchar(6), age int);";
	    jdbcTemplate.execute(createSql);        
	}
	
	@Override
	public void add(User user) {
		String sql="insert into user(uid,uname,gender,age) values(?,?,?,?)";
		Object[] params={ user.getUid(),user.getUname(),user.getGender(),user.getAge()};
		jdbcTemplate.update(sql,params);		
	}
	
	@Override
	public void delete(String id) {
		String sql="delete from user where uid=?";
		Object[] params={id};
		jdbcTemplate.update(sql,params);		
	}
	
	@Override
	public void update(User user) {
		String sql="update user set uname=?,gender=?,age=? where uid=?";
		Object[] params={user.getUname(),user.getGender(),user.getAge(),user.getUid()};
		jdbcTemplate.update(sql,params);		
	}
	
	@Override
	public List<User> findAllUsers() {		
		String sql="select * from user";
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		List<User> list= jdbcTemplate.query(sql, rowMapper);		
		return list;		
	}
	
	@Override
	public User findUserById(int id) {
		String sql="select * from user where uid=?";
		Object[] params={id};
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		User user= jdbcTemplate.queryForObject(sql, params,rowMapper);
		return user;
	}

	@Override
	public int count() {
		String sql="select count(*) from user";
		SqlRowSet rs=jdbcTemplate.queryForRowSet(sql);
		if (rs.next()) {
			return rs.getInt(1);
		}
		return 0;		
	}


}

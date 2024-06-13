package com.lifeng.service;

import com.lifeng.dao.RegisterDao;
import com.lifeng.dao.RegisterDaoImpl;

public class RegisterService {
RegisterDao registerDao;
public void regist() {
	registerDao=new RegisterDaoImpl();
	registerDao.regist();
}
public RegisterDao getRegisterDao() {
	return registerDao;
}
public void setRegisterDao(RegisterDao registerDao) {
	this.registerDao = registerDao;
}

}

package com.lifeng.aop;
public class MyAspect {	
	public void beforeSave(String uname){
		System.out.println("开始执行添加....名为"+ uname +"的用户");
	}	
	public void afterSave(String uname){
		System.out.println("完成执行添加....名为"+ uname +"的用户\n\n");
	}	
	public void beforeUpdate(String uid,String uname,String gender,int age){
		System.out.println("开始执行修改....编号id为:"+ uid+",名为:"+ uname +"，性别为："+gender+",年龄为:"+age+"的用户");
	}	
	public void afterUpdate(String uid,String uname,String gender,int age){
		System.out.println("完成执行修改....编号id为:"+ uid+",名为:"+ uname +"，性别为："+ gender +",年龄为:"+age+"的用户\n\n");
	}	
	public void beforeDelete(){
		System.out.println("开始删除用户,返回start deleting");
	}
	//切面获取到切点的返回值	
	public void afterDelete(String result){
		System.out.println(result+"\n\n");
	}	
	public void throwMethod(Throwable t){
		System.out.println("出现异常啦,异常信息:"+t.getMessage());
	}
}

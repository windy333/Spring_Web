<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#btn1").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax1",
				data:{
					username:"admin",
					password:"123"
				},
				success:function(data){				
					var jsonobject=JSON.parse(data);
	    			alert("用户名:"+jsonobject.username+"密码:"+jsonobject.password);
				}
			});		
		});
		
		$("#btn2").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax2",
				success:function(data){				
	    			alert(data);
				}
			});		
		});
		
		$("#btn3").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax3",
				success:function(data){				
	    			alert(data);
				}
			});		
		});
		
		$("#btn4").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax4",
				success:function(data){				
	    			alert("user:"+data.username+"pwd:"+data.password);
				}
			});		
		});
		
		$("#btn5").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax5",
				success:function(data){				
					alert("user:"+data.user1.username+"pwd:"+data.user1.password);
					alert("user:"+data.user2.username+"pwd:"+data.user2.password);
				}
			});		
		});
		
		$("#btn6").click(function(){		
			$.ajax({
				type: "GET",
				url:"doajax6",
				success:function(data){	
					$(data).each(function(index){	
						alert("user:"+data[index].username+"pwd:"+data[index].password);
					})
				}
			});		
		});
		
		
		
	});
</script>
</head>
<body>
<input id="btn1" type="button" value="click1"/>
<input id="btn2" type="button" value="return number"/>
<input id="btn3" type="button" value="return String"/>
<input id="btn4" type="button" value="return Object"/>
<input id="btn5" type="button" value="return Map"/>
<input id="btn6" type="button" value="return List"/>
</body>
</html>
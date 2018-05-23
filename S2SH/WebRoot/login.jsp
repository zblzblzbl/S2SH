<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生成绩查询系统</title>
</head>
<body>
	<div id = "loginhead">
		学生成绩查询系统
	</div>
	<form action="user.action" method="post">
		<table class="logintable" >
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="user.userName"/></td>
			</tr>
				<tr>
				<td>密码:</td>
				<td><input type="password" name="user.password" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="登录"  id="loginbutton"/>
					<input type="reset" value="取消" id="loginbutton"/>
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>
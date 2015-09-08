<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<%System.out.println((String)request.getAttribute("s")); %>
<html>
<head>
<title>登录页面</title>
</head>
<body>
<s:fielderror/>
<div style="margin:20%">
<s:form action="loginDealAction" method="post" >
<s:textfield name="user.username" value="lxy" label="用户名"/>
<s:password name="user.password" label="密码"/>
<s:submit value="登陆"  align="left"/>
<%-- <s:submit value="注册" onclick="regist()"/> --%>
</s:form>
<s:form action="registLinkAction">
<s:submit value="新注册"/>
</s:form>
</div>
</body>

<script type="text/javascript">
function regist(){
	//获取页面的第一个表单
	targetForm = document.forms[0];
	//动态修改表单的action属性
	targetForm.action = "registLinkAction";
}
</script>
</html>
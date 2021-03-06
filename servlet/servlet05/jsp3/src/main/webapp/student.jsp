<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/lhh-tags" prefix="s"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>查询学生</title>
	</head>
	<body>
		<h1>JSTL</h1>
		<!-- if -->
		<p>
			性别:
			<c:if test="${stu.sex=='M' }">男</c:if>
			<c:if test="${stu.sex=='F' }">女</c:if>
		</p>
		<!-- choose -->
		<p>
			性别:
			<c:choose>
				<c:when test="${stu.sex=='M' }">男</c:when>
				<c:otherwise>女</c:otherwise>
			</c:choose>
		</p>
		<!-- forEach -->
		<p>
			<c:forEach items="${stu.interests }" var="i">
				${i }
			</c:forEach>
		</p>
		<!-- 自定义标签 -->
		<p>
			<s:sysdate/>
		</p>
		<p>
			<s:sysdate format="yyyy年MM月dd日"/>
		</p>
		
		<h1>EL</h1>
		<h2>访问Bean属性</h2>
		<!-- request.getAttribute("stu").getName() -->
		<p>姓名:${stu.name }</p>
		<!-- request.getAttribute("stu").getAge() -->
		<p>年龄:${stu["age"] }</p>
		<!-- request.getAttribute("stu")
				.getCourse().getId() -->
		<p>课程:${stu.course.id }</p>
		<h2>EL的取值范围</h2>
		<!-- 
			EL默认从如下对象内依次取值:
				1) pageContext
				2) request
				3) session
				4) application
			若对象中存在同名数据,需指定范围:
				pageScope
				requestScope
				sessionScope
				applicationScope
		 -->
		 <p>性别:${requestScope.stu.sex }</p>
		 <h2>支持运算</h2>
		 <p>10年后:${stu.age+10 }</p>
		 <p>20-30间:${stu.age>20 && stu.age<30 }</p>
		 <p>判空:${empty stu.interests }</p>
		 <h2>获取请求参数</h2>
		 <p>参数:${param.user }</p>
	</body>
</html>






















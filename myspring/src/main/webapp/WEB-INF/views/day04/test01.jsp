<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Test01 페이지 page</h2>


	<h4> ${name }</h4>
	<h4> ${age > 10}</h4>
	
	<!--
	<h4> ${null + 10}</h4>
	<h4> ${"10" + 10}</h4>
	-->

	<h4>요청 URI :  ${pageContext.request.requestURI}</h4>
	
	<h4> ${ requestScope.name }</h4>
	<h4> ${ requestScope.age }</h4>
	
	<h4> ${ sessionScope.name }</h4>
	<h4> ${ sessionScope.age }</h4>
	
	<h4> ${param.abc}</h4>
	
	<%-- http://localhost:8080/day04/test01?abc=123 
		${param.파라미터명}요청시 넘어온 파라미터 값 출력 가능
	--%>
	
	<h4> ${hahahah }</h4>	<%-- 값이 없거나 null인경우는 화면에 출력안됨. 에러x --%>
	<h4> ${empty hahahahah}</h4>
	<h4> 위에 찍혔니~?</h4>	
	
	<h4>${arr[3] }</h4>
	<h4>${arr[0] }</h4>
	
	
	
	
	
</body>
</html>
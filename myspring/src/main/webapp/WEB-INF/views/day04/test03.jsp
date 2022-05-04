<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- c:foeTokens --%>
	<c:forTokens var="a" items="a,b,c,d,e" delims=",">
		<h1>${a}</h1>
		
	</c:forTokens>
	<%-- request.setCharacterEncoding("utf-8"); 와 동일 --%>
	<fmt:requestEncoding value="utf-8"/>
	
	
	<%-- 날짜 관련 --%>
	<fmt:formatDate value="${day}"/> <br />
	<fmt:formatDate value="${day}" type="date"/> <br />
	<fmt:formatDate value="${day}" type="time"/> <br />
	<fmt:formatDate value="${day}" type="both"/> <br />
	<br>
	<%--출력 스타일을 미리 지정해놓은 옵션 --%>
	<fmt:formatDate value="${day}" type="both" dateStyle="short"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="medium"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="long"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="full"/> <br>
	<br>	
	
	<fmt:formatDate value="${day}" type="both" dateStyle="short" timeStyle="short"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="short" timeStyle="medium"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="short" timeStyle="long"/> <br>
	<fmt:formatDate value="${day}" type="both" dateStyle="short" timeStyle="full"/> <br>
	<%-- 위 처럼 만들어진 포맷말고 내가 정한 포맷 지정 --%>
	<fmt:formatDate value="${day}" pattern="yyyy년 MM월 dd일 HH:mm:ss" /> <br />
	
	<br>
	<%-- 숫자와 관련된 --%>
	<%-- 자릿수 구별: groupingUsed default가 true --%>
	<fmt:formatNumber value="1000000" groupingUsed="true"/> <br>
	<fmt:formatNumber value="1000000" groupingUsed="false"/> <br>
	<br>
	<%-- 통화 --%>
	<fmt:formatNumber value="1000000" type="number"/> <br>	
	<fmt:formatNumber value="1000000" type="currency"/> <br>	
	<fmt:formatNumber value="1000000" type="currency" currencySymbol="\\"/> <br>	
	<fmt:formatNumber value="1000000" type="currency" currencySymbol="$"/> <br>	
	<fmt:formatNumber value="1000000" type="currency" currencySymbol="R"/> <br>	
	
	<%-- 퍼센트 --%>
	<fmt:formatNumber value="0.3" type="percent"/> <br>
	
	<%-- 소숫점 자릿수 표현 지정 : 반올림 --%>
	<fmt:formatNumber value="1200.155" pattern=".00"/> <br>
	
	<%-- (int)(10/3) 문자열을 숫자로 변환해주는 기능, var를 붙히면 변수선언처럼 사용가능 (출력x)--%>
	<fmt:parseNumber var="result" value="1000.123" integerOnly="true" /> <br>
	${result} <br>
	
	<%-- timeZone --%>
	<fmt:timeZone value="GMT">
		GMT 영국 : <fmt:formatDate value="${day }" type="both"/> <br>
	</fmt:timeZone>
	<fmt:timeZone value="GMT-4">
		미국 : <fmt:formatDate value="${day }" type="both"/> <br>
	</fmt:timeZone>
	
	<%-- *********************EL************************** --%>
	<h4>${arr }</h4>
	<h4>${arr[0] }</h4>
	
	<h3>${list }</h3>
	<h3>${list[1] }</h3>  <%-- ArrayList는 배열처럼 사용가능 --%>
	<h3>${list.get(2) }</h3> <%--메서드 호출해서 사용가능 --%>
	
	<br>
	<h3>${dto }</h3>
	<h3>${dto.id }</h3>  <%-- get 메서드 호출해서 출력 --%>
	<h3>${dto.pw }</h3>
	<h3>${dto.getId() }</h3>
	<h3>${dto.getPw() }</h3>
		
	<h4>tv : ${tv }</h4>
	<h4>tv.vol : ${tv.vol }</h4>
	<h4>tv.color : ${tv.color }</h4>
	

</body>
</html>
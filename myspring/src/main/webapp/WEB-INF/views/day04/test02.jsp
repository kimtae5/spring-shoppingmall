<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test02 page 페이지</h1>

	<%-- #1. 변수 생성 (name = 피카츄)
		var : 변수명, 표현식, EL, 정적텍스트 사용해 값 지정 가능
		property : 프로퍼티 이름지정, 자바빈의 경우 변수명(->set메서드 호출)
		target : 값 설정할 대상 객체. EL 을 사용하여 지정. 자바빈이나 Map타입
	 --%>
	<c:set var="name">피카츄</c:set>
	<c:set var="id" value="java" />
	
	<h4>name : ${name} </h4>
	<h4>id : ${id} </h4>

	<h4>dto.id : ${dto.id }</h4>
	<h4>dto.pw : ${dto.pw }</h4>
	
	<c:set target="${dto }" property="id" value="test"/>
	<c:set target="${dto }" property="pw" value="1234"/>
	<%--
	<c:set target="${dto }" property="age" value="20"/>
	--%>
	<h4>dto.id : ${dto.id }</h4>
	<h4>dto.pw : ${dto.pw }</h4>
	
	<%-- #2. 변구 삭제 : remove	 --%>
	<c:remove var="name"/>
	<c:remove var="id"/>
	<h4>dto.id : ${name }</h4>
	<h4>dto.pw : ${id }</h4>
	
	<%-- #3. c:if : 조건문. 자바에서 if문만 쓰는 형태	 
		<c:if test="${조건식}">
			//조건식이 참일경우 실행될 코드들...(화면에 보여줄 태그들작성..)
		</c:if>
	--%>
	<c:set var="num" value="100"/>
	<c:if test="${num > 100 }">
		<h4>num : @{num} 은 100보다 크다.</h4>
	</c:if>	
	<c:if test="${num == 100 }">
		<h4>num : @{num} 은 100이다.</h4>
	</c:if>	
	<c:if test="${num < 100 }">
		<h4>num : @{num} 은 100보다 작다.</h4>
	</c:if>	
	<%-- #4. c:choose, c:when, c:otherwise --%>
	<c:choose>
		<c:when test="${num > 100 }">
			<h4>num : ${num}은 100보다 크다 }</h4>
		</c:when>
		<c:when test="${num == 100 }">
			<h4>num : ${num}은 100이다</h4>
		</c:when>
		<c:otherwise >
			<h4>num : ${num}은 100보다 작다 }</h4>
		</c:otherwise>
	</c:choose>
	
	<%-- #5. c:forEach
		for(int i : arr){}
	--%>
	<c:forEach var="i" items="${arr }">
		<h3>${i}</h3>
	</c:forEach>
	<c:forEach var="j" items="${arr }" varStatus="status">
		<h3>i : ${i}, index : ${status.index}, count : ${status.count}</h3>
	</c:forEach>
	
	<c:forEach var="b" begin="1" end="10" step="1">
		<h4>${b}</h4>
	</c:forEach>
	
	<%-- 구구단 2 ~9 단까지 출력 : 2 * 1 = 2 --%>
	<c:forEach var="d" begin="2" end="9" step="1">
		<h4>******* ${d }단********</h4>
		<c:forEach var="c" begin="1" end="9" step="1">
			<h4>${d} * ${c} = ${d * c }</h4>
		</c:forEach>
	</c:forEach>
	
	<%-- c:foeTokens --%>
	<c:forTokens var="a" items="a,b,c,d,e" delims=",">
		<h1>${a}</h1>
		
	</c:forTokens>
	
	<%-- #7. c:import : include와 비슷 
	<c:import url="/day04/test01"/>
	--%>
	
	
	<%-- #8. c:redirect : 단순이동(새로요청)
		해당 url의 요청이 controller 로 다시 들어감(GET)
	
	
	<c:redirect url="/day04/test01"/>
	--%>
	
	<%-- #9. c:url : url 주소만들때 
	<c:url var="u" value="/day04/test01">
		<c:param name="id" value="java"/>
		<c:param name="pw" value="1111"/>
	</c:url>
	<c:redirect url="${u}"/>
	--%>
	
	<%-- #10. c:out : 출력태그 --%>
	<c:set var="num2" value="50"/>
	num2 : ${num2 }
	num2 : <c:out value="${num2 }"/>
	
	<input type="text" name="test" value="${num2 }">
	<input type="text" name="test" value='<c:out value="${num2}"/>'>
	
	
	
	
</body>
</html>
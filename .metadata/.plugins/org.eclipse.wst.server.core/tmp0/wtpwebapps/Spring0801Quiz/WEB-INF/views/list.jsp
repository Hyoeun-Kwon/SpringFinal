<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>주소록 조건 리스트</title>
</head>	
<body>
<h3>MyBatis 주소록 조건 검색</h3>



<form action="listQuery" method="post">

	검색선택 :
	<select name="query">
		<!-- 대문자로 작성해줘야함 왜? 마이바티스에서 대문자로 쓰기 때문 -->
		<option value="ADDRESS">주소</option>
		<option value="RELATION">관계</option>
	</select> &nbsp;&nbsp;&nbsp;
	<input type="text" name="content" size="30">
	<input type="submit" value="검색">
</form>
<br><br>

	<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>내용</td>
			<td>주소</td>
			<td>전자우편</td>
			<td>관계</td>
		</tr>
		<!-- int cnt =0; -->
		<c:set var="cnt" value="0" />
		<c:forEach items="${list }" var = "dto">
			<tr>
				<td><a href = "content_view?seqno=${dto.seqno }">${dto.seqno }</a></td>
				<td>${dto.name }</td>
				<td>${dto.telno }</td>
				<td>${dto.address }</td>
				<td>${dto.email }</td>
				<td>${dto.relation }</td>
			</tr>
		<c:set var="cnt" value="${cnt=cnt+1 }" />
		</c:forEach>
	</table>
	<br><br>
	<p>검색 결과는 <b>${cnt }</b> 명 입니다.</p>
	
	<p><a href="write_view">주소록 등록</a></p>
		
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address_Content</title>
</head>
<body>
	<table border="1">
		<form action="modify" method="post">
			<tr>
				<td>번호</td>
				<td><input type="text" name="seqno" size="50" readonly="readonly" value="${content_view.seqno }"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="50" value="${content_view.name }"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="telno" size="50" value="${content_view.telno }"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="50" value="${content_view.address }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" size="50" value="${content_view.email }"></td>
			</tr>
			<tr>
				<td>관계</td>
				<td><input type="text" name="relation" size="50" value="${content_view.relation }"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;<a href="list">목록보기</a>&nbsp;&nbsp;<a href="delete">삭제</a></td>
			</tr>
		</form>
	</table>





</body>
</html>
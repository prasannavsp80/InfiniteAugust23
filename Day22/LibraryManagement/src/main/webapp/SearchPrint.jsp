<%@page import="com.java.lib.Books"%>
<%@page import="java.util.List"%>
<%@page import="com.java.lib.LibraryDaoImpl"%>
<%@page import="com.java.lib.LibraryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp"/>
<%
		LibraryDAO dao = new LibraryDaoImpl();
		String searchType = request.getParameter("searchtype");
		String searchValue = request.getParameter("searchvalue");
		List<Books> booksList = dao.searchBooks(searchType, searchValue);
	%>
		<form action="Issue.jsp">
		<table border="3" align="center">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Edition</th>
			<th>Department</th>
			<th>Total Books</th>
		</tr>
	<%
		for(Books book : booksList) {
		
	%>
		<tr>
			<td> <%=book.getId() %> </td>
			<td><%=book.getName() %> </td>
			<td><%=book.getAuthor() %> </td>
			<td> <%=book.getEdition() %> </td>
			<td><%=book.getDept() %> </td>
			<td><%=book.getNoOfBooks() %> </td>
		
		
		
		</tr>
	<%
		}
	%>
	</table>
	<input type="submit" value="Issue Book(s)" />
	</form>
	
</body>
</html>
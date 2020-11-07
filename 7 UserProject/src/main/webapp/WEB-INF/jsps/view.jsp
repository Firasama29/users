<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/add">New Message</a></li>
                        <li>
                        	<form action="/message">
	                            <label>search messages</label><br>
	                            <input type="text" name="search" placeholder="id or sender name">
	                            <input type="submit" value="submit">
                            </form>
                        </li>
                        <li>
                        </li>
                    </ul>
                </div>
            </nav>
<div class="container">
  <table class="table">
    <thead>
      <tr>
        <th></th>
        <th>userName</th>
        <th>email</th>
        <th>dob</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
      <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.email}</td>
        <td>${user.dob}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>

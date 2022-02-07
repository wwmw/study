<%@ page language="java" contentType="text/html; charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr"); %>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Request 객체를 이용한 post 방식 예제</title>
  </head>
  <body>
    <center>
      <hr>
      post.html로부터 넘어온 값들 <br><br>
      <%
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String dept = request.getParameter("dept");

        out.println("이름 : " + name + "<br>");
        out.println("학번 : " + id + "<br>");
        out.println("소속 : " + dept + "<br>");
      %><br><br>
      <hr>
    </center>
  </body>
</html>

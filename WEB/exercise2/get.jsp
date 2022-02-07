<%@ page language="java" contentType="text/html; charset=euc-kr" %>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Request 객체를 이용한 Get 방식 예제</title>
  </head>
  <body>
    <hr>
    <center>
      get.html로부터 넘어온 값들 <br><br>
      <%
        String name = request.getParameter("name");
        name = new String(name.getBytes("ISO-8859-1"), "euc-kr");
        String id = request.getParameter("id");
        String dept =request.getParameter("dept");
        dept = new String(dept.getBytes("ISO-8859-1"), "euc-kr");

        out.println("이름 : " + name + "<br>");
        out.println("학번 : " + id + "<br>");
        out.println("소속 : " + dept + "<br>");
      %><br><br>
    </center>
    <hr>
  </body>
</html>

<%@ page contentType="text/html; charset=euc-kr" %>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Response.sendRedirect 예제</title>
  </head>
  <body>
    <%
      String name = request.getParameter("name");
      String pass = request.getParameter("pwd");

      if(name.equals("admin") && pass.equals("1234")){
        response.sendRedirect("response-success.html");
      } else {
        response.sendRedirect("response-fail.html");
      }
    %>
  </body>
</html>

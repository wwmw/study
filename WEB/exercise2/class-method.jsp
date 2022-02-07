<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.*, java.text.*, java.util.Date, java.io.*" %>

<b>Integer 클래스의 메소드</b><hr>
<%
  out.println("Integer.toString(56) => (string)" + Integer.toString(56) + "<br>");
  out.println("Integer.toString(\"56\") => (int)" + Integer.parseInt("56") + "<br>");
%>
<br>
<b>String 클래스의 메소드</b><hr>
<%
  String str = "milk";
  String str2 = "MILK";
%>
<%= "sting : milk => 대문자 : " + str.toUpperCase() + " => 소문자 : " + str2.toLowerCase()
%>
<br><br>
<%
  out.println("HOUSE".equals("House"));
%>
<br><br>
<b>Date 클래스의 메소드</b><hr>
<%!
  Date d = new Date();
%>
<%= d.getYear() + 1900 %>
<%= d.getMonth() + 1 %>
<%= d.getDate() %>
<br><br>
<b>Math 클래스의 메소드</b><hr>
<%= "-5의 절대값 : " + Math.abs(-5) + "<br> 4의 제곱근 : " + Math.sqrt(4) %>

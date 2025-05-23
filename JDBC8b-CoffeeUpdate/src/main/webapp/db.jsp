<%@ page import="java.sql.*" %>
<%
Connection conn = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
    application.setAttribute("conn", conn); // Store in application scope
} catch (Exception e) {
    out.println("Database connection error: " + e.getMessage());
}
%>

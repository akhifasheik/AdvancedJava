<%@ page import="java.sql.*" %>
<%
Connection conn = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "password");
    application.setAttribute("conn", conn);
} catch (Exception e) {
    out.println("DB Connection Error: " + e.getMessage());
}
%>

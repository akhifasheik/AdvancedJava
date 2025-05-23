<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
    <h2>Salary Report</h2>
    <%
        String startChar = request.getParameter("startChar");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "password");

            stmt = conn.createStatement();

            // Delete records where Emp_Name starts with the given character
            String deleteSQL = "DELETE FROM Emp WHERE Emp_Name LIKE '" + startChar + "%'";
            stmt.executeUpdate(deleteSQL);

            // Select remaining records
            String selectSQL = "SELECT * FROM Emp";
            rs = stmt.executeQuery(selectSQL);

            while(rs.next()) {
    %>
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
                Emp_No : <%= rs.getInt("Emp_No") %><br>
                Emp_Name: <%= rs.getString("Emp_Name") %><br>
                Basic : <%= rs.getDouble("basicsalary") %><br>
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
    <%
            }
        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch(Exception e) {}
            try { if (stmt != null) stmt.close(); } catch(Exception e) {}
            try { if (conn != null) conn.close(); } catch(Exception e) {}
        }
    %>
</body>
</html>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
    <h2>Salary Report (Emp_Name starting with 'R')</h2>
<%
    String url = "jdbc:mysql://localhost/Employee";
    String user = "root";
    String password = "password";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);

        String query = "SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            int empno = rs.getInt("Emp_NO");
            String empname = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");
%>
    <pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No    : <%= empno %>
Emp_Name  : <%= empname %>
Basic     : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    </pre>
<%
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>

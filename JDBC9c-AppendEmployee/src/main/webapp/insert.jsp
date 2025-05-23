<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    String url = "jdbc:mysql://localhost/Employee";
    String user = "root";
    String password = "password"; // Change as needed

    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        String insertSQL = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(insertSQL);
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setInt(3, Integer.parseInt(basicsalary));

        int result = ps.executeUpdate();

        if (result > 0) {
            out.println("<p>Employee added successfully!</p>");
        } else {
            out.println("<p>Failed to add employee.</p>");
        }

        conn.close();
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
<a href="addEmp.html">Go back</a>

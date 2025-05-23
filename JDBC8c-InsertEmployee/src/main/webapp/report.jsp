<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int empno = rs.getInt("Emp_NO");
            String empname = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");

            grandTotal += salary;
%>
Emp_No   : <%= empno %>
Emp_Name : <%= empname %>
Basic    : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        }
%>
Grand Salary : <%= grandTotal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        rs.close();
        stmt.close();
        con.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
</pre>
<a href="insert.jsp">Go Back</a>
</body>
</html>

<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salary = request.getParameter("salary");

    Connection con = null;
    PreparedStatement pst = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "password");

        String query = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        pst = con.prepareStatement(query);
        pst.setInt(1, Integer.parseInt(empno));
        pst.setString(2, empname);
        pst.setInt(3, Integer.parseInt(salary));

        int rows = pst.executeUpdate();

        if (rows > 0) {
            out.println("<h3>Employee added successfully!</h3>");
        } else {
            out.println("<h3>Error inserting data.</h3>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (pst != null) pst.close();
        if (con != null) con.close();
    }
%>
<a href="insert.jsp">Go Back</a>

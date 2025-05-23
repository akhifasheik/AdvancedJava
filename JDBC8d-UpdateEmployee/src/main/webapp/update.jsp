<%@ page import="java.sql.*" %>
<jsp:include page="db.jsp" />

<%
Connection conn = (Connection) application.getAttribute("conn");

String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalary = request.getParameter("basicsalary");

if (empno != null && empname != null && basicsalary != null) {
    try {
        PreparedStatement ps = conn.prepareStatement(
            "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?"
        );
        ps.setString(1, empname);
        ps.setInt(2, Integer.parseInt(basicsalary));
        ps.setInt(3, Integer.parseInt(empno));

        int updated = ps.executeUpdate();

        if (updated > 0) {
            out.println("<p style='color:green;'>Employee updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>No employee found with that Employee Number.</p>");
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
}

out.println("<h2>All Employees</h2>");
try {
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    out.println("<table border='1'><tr><th>Emp No</th><th>Name</th><th>Salary</th></tr>");
    while (rs.next()) {
        out.println("<tr><td>" + rs.getInt("Emp_NO") + "</td><td>" +
                    rs.getString("Emp_Name") + "</td><td>" +
                    rs.getInt("Basicsalary") + "</td></tr>");
    }
    out.println("</table>");
} catch (Exception e) {
    out.println("<p>Error displaying data: " + e.getMessage() + "</p>");
}
%>

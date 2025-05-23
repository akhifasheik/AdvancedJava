<%@ page import="java.sql.*" %>
<%
    String idStr = request.getParameter("id");
    if (idStr != null && !idStr.isEmpty()) {
        int id = Integer.parseInt(idStr);
        String url = "jdbc:mysql://localhost/test";
        String user = "root";
        String password = "password";  // Set your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "DELETE FROM coffee WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<h3>Record with ID " + id + " deleted successfully.</h3>");
            } else {
                out.println("<h3>No record found with ID " + id + ".</h3>");
            }

            conn.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    } else {
        out.println("<h3>Invalid ID provided.</h3>");
    }
%>

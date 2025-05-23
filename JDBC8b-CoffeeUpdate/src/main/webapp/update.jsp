<%@ page import="java.sql.*" %>
<jsp:include page="db.jsp" />

<%
Connection conn = (Connection) application.getAttribute("conn");

String id = request.getParameter("id");
String name = request.getParameter("coffee_name");
String price = request.getParameter("price");

if (id != null && name != null && price != null) {
    try {
        PreparedStatement ps = conn.prepareStatement("UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?");
        ps.setString(1, name);
        ps.setDouble(2, Double.parseDouble(price));
        ps.setInt(3, Integer.parseInt(id));
        int updated = ps.executeUpdate();

        if (updated > 0) {
            out.println("<p style='color:green;'>Coffee record updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>No coffee found with the given ID.</p>");
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
}

out.println("<h2>All Coffee Products</h2>");
try {
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");
    while (rs.next()) {
        out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                    rs.getString("coffee_name") + "</td><td>" +
                    rs.getDouble("price") + "</td></tr>");
    }
    out.println("</table>");
} catch (Exception e) {
    out.println("<p>Error displaying data: " + e.getMessage() + "</p>");
}
%>

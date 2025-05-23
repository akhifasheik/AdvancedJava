<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Results Starting with 'D'</title>
    <style>
        table {
            border-collapse: collapse;
            width: 60%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #000;
            padding: 8px;
            text-align: center;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>Coffee Records Starting with 'D'</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
<%
    String url = "jdbc:mysql://localhost/test";
    String user = "root";
    String password = "password"; // Change this if your MySQL has a password
    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("coffee_name");
            int price = rs.getInt("price");
%>
        <tr>
            <td><%= id %></td>
            <td><%= name %></td>
            <td><%= price %></td>
        </tr>
<%
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
%>
        <tr>
            <td colspan="3">Error: <%= e.getMessage() %></td>
        </tr>
<%
    }
%>
    </table>
</body>
</html>

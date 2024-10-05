<jsp:useBean id="result" scope="request" type="org.example.webdlab3.model.Result"/>
<%--
  Created by IntelliJ IDEA.
  User: Николай Резниченко
  Date: 01.10.2024
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="table">
    <h2>Max and Min Values</h2>
    <table>
        <thead>
        <tr><th></th><th>I</th><th>X</th><th>Y</th></tr>
        </thead>
        <tbody>
        <tr><td>Max</td><td>${result.maxI}</td><td>${result.maxX}</td><td>${result.maxY}</td></tr>
        <tr><td>Min</td><td>${result.minI}</td><td>${result.minX}</td><td>${result.minY}</td></tr>
        </tbody>
    </table>

    <h2> Sum and Average</h2>
    <table>
        <thead><tr><th>Sum</th><th>Average</th></tr></thead>
        <tbody>
        <tr><td>${result.sum}</td><td>${result.average}</td></tr>
        </tbody>
    </table>
    <button type="submit" class="button" onclick="GoBack()">Tabulate</button>
</div>

<div class="container">
    <h2>Arrays X and Y</h2>
    <%
        double[] arrX = result.getXArr();
        double[] arrY = result.getYArr();

    %>
    <table class="table">
        <thead>
        <tr><th>Index</th><th>X</th><th>Y</th></tr>
        </thead>
        <tbody>
        <%
            for (int i = 0; i < arrX.length; i++) {
        %>
        <tr>
            <td><%= i %></td>
            <td><%= arrX[i] %></td>
            <td><%= arrY[i] %></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

<script>
    function GoBack() {
        window.location.href = "index.jsp";
    }
</script>
</body>
</html>

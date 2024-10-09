<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<br/>
<div class="main">
    <div class="container">
        <form action="calculate" method="post">
            <label for="start">Start:</label>
            <input type="number" id="start" name="start" required step="0.1" value="0.8"><br>
            <label for="end">End:</label>
            <input type="number" id="end" name="end" required step="0.1" value="2"><br>
            <label for="step">Step:</label>
            <input type="number" id="step" name="step" required step="0.001" value="0.005"><br>

            <button type="submit" class="button">Tabulate</button>
        </form>
    </div>
</div>
</body>
</html>
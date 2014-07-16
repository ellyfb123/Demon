<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>MathAddAndStringLink</title>
</head>
<body>
<h1>Budget Query</h1>
<form action="" method="post" name="information" id="information" onsubmit="return checkId()">
    name
    <input type="text" name="name" id="name"></br>
    id&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="text" name="id" id="id"></br></br>
    &nbsp&nbsp&nbsp&nbsp<input type="button" name="cancel" value="cancel" onclick="close();document.write('<n>')">&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="submit" name="submit" value="submit">
</form>
</body>
</html>
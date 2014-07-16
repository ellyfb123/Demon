
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>MathAdd</title>
</head>
<body>
<h1>MathAdd</h1>
<form action="add" method="post" name="information" id="information">
        <div style="margin:10px">
            <span style="padding:20px">add1</span>
            <input type="text" name="add1" id="add1">
        </div>

        <div style="margin:10px">
            <span style="padding:20px">add2</span>
            <input type="text" name="add2" id="add2">
        </div>
        <input type="reset" name="cancel" value="cancel" style="margin:0px 30px">
        <input type="submit" name="submit" value="submit" style="margin:0px 20px">


    </form>

 <%
            String result = (String)request.getAttribute("result");
            if(result == null)
            {result = "";}
 %>
           <div style="background-color:#EEEEEE;width:'100%';font-size:14px;">
           <div style="float:left;width:28%; margin:10px 30px"><%=result%></div>
           </div>
           <h1>${msg}</h1>
</body>
</html>

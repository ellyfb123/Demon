 <%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
    <head>
    </head>

    <body>
        <h1 style = "color:green;text-align:center;font-size = 19px">The Result of Query</h1>
        <div style="background-color:#EEEEEE;width:'100%';font-size:16px;">
            <div style="float:left;width:24%; margin:10px 0px" >Name</div>
            <div style="float:left;width:24%; margin:10px 0px" >Available</div>
            <div style="float:left;width:24%; margin:10px 0px">Cost</div>
            <div style="float:left;width:24%; margin:10px 0px">Balance</div>
        </div>

        <div style="background-color:#EEEEEE;width:'100%';font-size:14px;">
            <div style="float:left;width:24%; margin:10px 0px" >${name}</div>
            <div style="float:left;width:24%; margin:10px 0px" >${available}</div>
            <div style="float:left;width:24%; margin:10px 0px">${cost}</div>
            <div style="float:left;width:24%; margin:10px 0px">${balance}</div>
        </div>
    </body>
</html>
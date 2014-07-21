<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>BudgetQuery</title>
        <script type="text/javascript">
                 function checkId(){
                 var myId = document.getElementById("id").value;
                 var re = /^\d{5}$/;
                     if(!re.test(myId)){
                         alert("the id is wrong, please input again");
                         return false;}
                     return true;}
         </script>

</head>
<body>
	<div class="title" style="text-align:center;background-color:rgb(0,200,0);margin:2px 3px;padding:5px;color:yellow">
        <h1>Budget Query</h1>
	</div>
    <form action="query" method="post" name="information" id="information" onsubmit="return checkId()" style="margin:20px">
        <div class= "name" style="text-align:center;">
            <span>name</span>
            <input type="text" name="name" id="name">
        </div>

        <div class="id" style="text-align:center;margin:15px;">
            <span>id</span>
            <input type="text" name="id" id="id">
        </div>
        <div class="reset" style="text-align:center;">
            <input type="reset" name="cancel" value="cancel">
			<input type="submit" name="submit" value="submit">
        </div>
        <div style="text-align:center;margin:15px" >${errorMsg}</div>
    </form>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to employee portal page</h1>


<hr>


<form action="displayAll" method="post">
<h2> 
Click here to see all employee records <br>
<input type="submit" name="submit" value="Display All Employees"></h2>
</form >

<hr>

<form action="displayEmp" method="post">
<h2>
Enter Emp Id : <input type="text" name="eid">
<input type="submit" name="submit" value="DISPLAY">
</h2></form>

<hr>


<form action="displayDesignation" method="post">
<h2>
Enter Designation: <input type="text" name="designation">
<input type="submit" name="submit" value="DISPLAY">
</h2></form>


<hr>


<form action="displayByAge" method="post">
<h2>
Click here to see all employee records by age
<input type="submit" name="submit" value="DISPLAY All Employees">
</h2></form>


<hr>



<form action="displayByDesignation" method="post">
<h2>
Click here to see all employee records by designation
<input type="text" name="designation">
<input type="submit" name="submit" value="DISPLAY All Employees">
</h2></form>


<hr>

<form action="collect" method="post">
<h2>
Click here to display details of employee and designation
<input type="submit" name="submit" value="DISPLAY All details">
</h2></form>


<hr>



<form action="insertEmp" method="post">
<h2>
Enter ID: <input type="text" name="eid"><br>
Enter Name: <input type="text" name="name"><br>
Enter Age: <input type="text" name="age"><br>
Enter Designation: <input type="text" name="designation">
<br>
<input type="submit" name="submit" value="INSERT">
<br><input type="reset" name="reset" value="RESET">
</h2></form>


<hr>



<form action="updateEmp" method="post">
<h2>
Enter ID: <input type="text" name="eid"><br>
Enter Name: <input type="text" name="name"><br>
Enter Age: <input type="text" name="age"><br>
Enter Designation: <input type="text" name="designation">
<br> <input type="submit" name="submit" value="Update">
<br><input type="reset" name="reset" value="RESET">
</h2></form>


<hr>



<form action="deleteEmp" method="post">
<h2>
Enter ID to delete: <input type="text" name="eid"><br>
<br>
<input type="submit" name="submit" value="Remove">
</h2></form>


</body>
</html>
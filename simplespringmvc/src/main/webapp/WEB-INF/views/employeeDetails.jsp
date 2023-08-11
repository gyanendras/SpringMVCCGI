<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>


<h2>
<%="Hello From Jsp" %>
</h2>
<label style="background-color: red; border:2px blue solid">
<%=new Date() %>
</label>
<%! int x = 20; %>

<Form class="text-primary" action="http://localhost:8080/simplespringmvc/emp" method="get" onsubmit="true">
	<label class="form-label" name="lbl1">Name</label>
	<input type="text" name="fname" class="form-control">
	<label name="errFname"></label>
	<label class="form-label">DOB</label>
	<input type="date" name="dob" class="form-control">
	<label class="form-label">Gender</label>
	<label class="form-label" name="rd1">male</label>
	<input type="radio" name="gender" value="male" >
	<label class="form-label">Female</label>
	<input type="radio" name="gender" value="female">
	<label name="errRd"></label>
	
	<label class="form-label" class="form-text">Area of Interest</label>
	
	<label class="form-label">Jobs</label>
	<input type="checkbox" name="interest1" value="Jobs" class="form-control">
	
	<label class="form-label">Interns</label>
	<input type="checkbox" name="interest2" value="Interns" class="form-control">
	
	<label class="form-label">Sales</label>
	<input type="checkbox" name="interest3" value="sales" class="form-control" >
	
	<label class="form-label">Select your preferrred cities </label>
	<select class="form-control" >
		<option>Lucknow</option>
		<option>Delhi</option>
		<option>Pune</option>
		<option>Bangalore</option>
		<option>Vizag</option>
		
	</select>
	
	<label class="form-label">Any feedback</label>
	<textarea  oninput="printMsg()" ="t1" class="form-control"></textarea>
	<input type="submit" class="form-control" value="Submit">
	
	
</Form>


</body>
</html>
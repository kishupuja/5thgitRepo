<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>SSN Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h1 style="color:Green;text-align: center ">Federal Government Data Registration</h1>
  <font color="green">${result1}</font>
  <font color="red">${result2}</font>
  <form:form class="form-horizontal" action="register" modelAttribute="userdata">
    <div class="form-group">
      <label class="control-label col-sm-2" for="">FirstName:</label>
      <div class="col-sm-10">
        <form:input path="firstName" class="form-control" id="firstname" placeholder="Enter FirstName" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="">LastName:</label>
      <div class="col-sm-10">
        <form:input  path="lastName" class="form-control" id="lastName" placeholder="Enter LastName" />
      </div>
    </div>
   
    <div class="form-group">
      <label class="control-label col-sm-2" for="">DOB</label>
      <div class="col-sm-10">
        <form:input path="dob" class="form-control" id="dob" placeholder="Enter DOB"/>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form:form>
</div>

</body>
</html>
    
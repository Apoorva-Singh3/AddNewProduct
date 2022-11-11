<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>

<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>

</head>
<body>
 <div class="container">
 <div class="row text-center" style="color: tomato;">
  <h2>Add Product with JSP, Servlet and Hibernate</h2>
 </div>
 <hr>
  <div class="row col-md-10 col-md-offset-3"> 
   
   <div class="card card-body">
   
    <div class="col-md-8 col-md-offset-3">

     <form action="<%=request.getContextPath()%>/register" method="post">

      <div class="form-group">
       <label for="ProductId">ProductId:</label> <input type="text"
        class="form-control" id="ProductId" placeholder="ProductId"
        name="ProductId" required>
      </div>

      <div class="form-group">
       <label for="ProductName">ProductName:</label> <input type="text"
        class="form-control" id="ProductName" placeholder="ProductName"
        name="ProductName" required>
      </div>

      <button type="submit" class="btn btn-primary">Submit</button>

     </form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>
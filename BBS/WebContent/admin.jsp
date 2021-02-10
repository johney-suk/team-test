<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<style>

.container-lg{
margin-top: 80px;
width: 50%;

}

.submit{
margin-top: 20px;
text-align: center;
}

</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1" >
<link rel="stylesheet" href="css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.js"></script>

<title>관리자 로그인</title>

</head>


<body>
<div class="container-lg">
  <div class="row gx-5">    
    <div class="col">
      <form method = "post" action = "loginAction.jsp">
      <h3 style = "text-align: center;">관리자 로그인</h3>                 
  <div class="mb-3">
    <label for="exampleInputId" class="form-label">ID</label>
    <input type="text" class="form-control"  name = "userID">    
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" name = "userPassword">
  </div>
  
  <div class="submit">
  <button type="submit" class="btn btn-primary">로그인</button>
  </div>
</form>

            </div>
            </div> 
    </div>
        
	
	
</body>
</html>
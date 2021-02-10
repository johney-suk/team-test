<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1" >
<link rel="stylesheet" href="css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.js"></script>

<style>

.container-lg{
margin-top: 30px;

}

h2{
text-align: center;
}

.submit{
margin-top: 20px;
text-align: center;
}

</style>


<title>회원가입</title>

</head>


<body>
<div class="container-lg">
  <div class="row gx-5">    
    <div class="col">
      <div class="p-3 border bg-light"><h2>회원 가입</h2>
      
      
      <form method = "post" action = "joinAction.jsp">
            
  <div class="mb-3">
    <label for="name" class="form-label">이름</label>
    <input type="text" class="form-control" name="name" aria-describedby="namebox">    
  </div>
  
  <label for="enail" class="form-label">이메일</label>
  <div class="input-group mb-3">
  <input type="text" class="form-control" name="email" placeholder="id@xxx.xxx" aria-label="Username">  
 
</div>

<div class="mb-3">
    <label for="phone" class="form-label">전화번호</label>
    <input type="text" class="form-control" name="phone" aria-describedby="namebox">    
  </div>
  
<label for="name" class="form-label">성별</label>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
    남자
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
    여자
  </label>
</div>

<br>  
  <div class="col-md-4">
  <label for="class" class="form-label">직업<br></label>
    <label for="inputState" class="form-label"></label>
    <select id="inputState" class="form-select">  
      <option selected>Choose...</option>
      <option value="1">학생</option>
      <option value="2">직장인</option>
      <option value="3">무직</option>
      <option value="4">기타</option>
    </select>
      </div>
    
    
  
  <br>
  <div class="col-md-4">
  <label for="class" class="form-label">수강 과목<br></label>
    <label for="inputState" class="form-label"></label>
    <select id="inputState" class="form-select">  
    <option selected>Choose...</option>          
      <option value="1">줌바</option>      
      <option value="2">에어로빅</option>
      <option value="3">스피닝</option>
      <option value="4">헬스</option>
      
    </select>
  </div>
  

<div class="submit">
  <button type="submit" class="btn btn-primary">등록</button>  
  </div>
    
  	</form>
  
      
      </div>
    </div>
  </div>
</div>
	
	
</body>
</html>
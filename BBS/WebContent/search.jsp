<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1" >
<link rel="stylesheet" href="css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.js"></script>

<title>회원검색 및 수정</title>

<style>
h2 {
	text-align: center;
	margin-top: 30px;
}


</style>

</head>
<body>

<h2>관리자 페이지</h2>
<br>

<form class="row row-cols-lg-auto g-3 align-items-center" style = "float: right; margin-right:30px">
  
  <div class="col-12" >
      <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="검색어 입력">
    </div>
  


  <div class="col-12">
    <button type="submit" class="btn btn-primary">검색</button>
  </div>
</form>
	
	<br>
	<br>
	<table class ="table" style = "text-align: center; border: 1px solid #ddddd">
	<thead>
	<tr>
	<th style="background-color: #fafafa; text-align: center;">이름</th>
	<th style="background-color: #fafafa; text-align: center;">이메일</th>
	<th style="background-color: #fafafa; text-align: center;">전화번호</th>
	<th style="background-color: #fafafa; text-align: center;">성별</th>
	<th style="background-color: #fafafa; text-align: center;">직업</th>
	<th style="background-color: #fafafa; text-align: center;">수강과목</th>
	<th style="background-color: #fafafa; text-align: center;">수정</th>
	<th style="background-color: #fafafa; text-align: center;">삭제</th>
	
	
	</tr>
	</thead>
	
	<tbody>
	<tr>
	<td> 에이젝스</td>
	<td> sdf@mmsdf.com</td>
	<td> 123324324</td>
	<td> 여</td>
	<td> 학생</td>
	<td> 줌바</td>
	<td> <button type="button" class="btn btn-outline-success">수정</button></td>
	<td> <button type="button" class="btn btn-outline-danger">삭제</button></td>
	
	
	</tr>
	
	</tbody>
	</table>
		
	
	
</body>
</html>
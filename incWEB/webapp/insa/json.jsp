<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	VO :: <br/>
	<div id="vo"></div>
	<p/>
	LIST :: <br/>
	<div id="ary"></div>
	<p/>
	<a href="javascript:test('${user.id }', ${user.age })">링크</a>
		
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
		function test(id, age) {
			alert(id +" , "+age);
			$.ajax({
				url  : "" ,
				type : "" ,
				data : {id : id, age : age} ,
				dataType : "json" ,
				success : function(obj) {
					
				}
			});
		}
		
		$(document).ready(function() {
			var user = ${user} ;
			console.log(user);
			var list = ${lists} ;
			console.log(list);
			
			$("#vo").html(user.id);
			
			var txt = "";
			$.each(list, function(idx, e) {
				txt += e.id;
			})
			$("#ary").html(txt);
		});
	</script>
</body>
</html>
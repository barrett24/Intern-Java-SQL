<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	AJAX :: <br/>
	<input type="text" name="id" id="id">
	<button id="btn">AJAX BTN</button>
	<button id="sendbtn">AJAX SEND BTN</button>
	<p/>
	
	TABLE :: <br/>
	<table>
		<tr>
			<th>ID</th><th>PWD</th>
		<tr/>
		<tbody id="tbody"></tbody>
	</table>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			console.log("script ready") ;
			$('#btn').click(function() {
				alert('깜짝이야!');
				// $.ajax()
				$.ajax({
					url  : "sinc.ajax" ,
					type : "post" ,
					// data : {} ,
					dataType : "json" ,
					success : function(obj) {
						alert(obj);
						// val(): 값을 assign set get 둘다 가능, prop() : 태그에 속성 추가
						// $("#id").prop("value", obj.id);
						$("#id").val(obj.id);
					}
				});
			});
			$("#sendbtn").click(function() {
				$.ajax({
					url  : "param_sinc.ajax" ,
					type : "post" ,
					data : { id : $("#id").val() } ,
					dataType : "json" ,
					success : function(ary) {
						var txt = "";
						$.each(ary, function(idx, e){
							txt += "<tr>";
							txt += "<td>" + e.id +"</td><td>" + e.pwd +"</td>";
							txt += "</tr>";
						});
						$("#tbody").html(txt);
					}
				});
			});
		}) ;
	</script>
	
</body>
</html>
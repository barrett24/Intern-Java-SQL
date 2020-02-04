<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<button id="btn">띠용~!~!</button>
	<button id="clearBtn">빠잉~!~!</button>
	<div id="result">
	
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
		var obj = {id : 'jslim', pwd : 'jslim'};
		var ary = [{id : 'jslim', pwd : 'jslim'}, {id : 'jslim', pwd : 'jslim'}];
		var map = {"list01" : [{id : 'jslim', pwd : 'jslim'}, {id : 'jslim', pwd : 'jslim'}],
				   "list02" : [{id : 'jslim', pwd : 'jslim'}, {id : 'jslim', pwd : 'jslim'}]};
		
		function printAry(aryData) {
			$.each(aryData, function(idx, data) {
				$('#result').append(data.id+" , "+data.pwd+"<br/>");
			});
		}
		
		$(document).ready(function() {
			$('#btn').click(function() {
				//window.alert("이벤트 확인");
				//text(), append(), html()
				//$('#result').html("<font color='red'>"+obj.id+"</font> , "+obj.pwd);
				/* $.each(ary, function(idx, data) {
					$('#result').append(data.id+" , "+data.pwd+"<br/>");
				}); */
				printAry(map.list01); printAry(map.list02);
			});
			$('#clearBtn').bind('click', function() {
				// empty(), remove()-> 객체아예삭제 
				$('#result').empty();
			});
		});
	</script>
</body>
</html>
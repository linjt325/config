<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../common/BasePath.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="Js/config/config.js"></script>
<style type="text/css">
	
</style>
</head>
<body>
<!-- <div style="width:200px;background:#0081c2;height:100%;float:left;position:absolute"> -->
<!-- 	<div id="list"></div> -->
<!-- </div> -->
<div style="position: absolute;left:0px;top:0px;bottom:0px;right:0px">
	<div id="detail">
		<span>picid: </span>
		<input id="picid" style="width:100px;height:30px;">
		<span>objid: </span>
		<input id="objid" > 
		<span>enname:(当objid多变,当enname都为同一个时使用)</span>
		<input id="enname">
		<div style="width:100%">
			<span>配置</span>
			<textarea id="config" style="width:95%;height:300px"></textarea>
		</div>
		<button id="submit">提交</button>
		<div style="width:100%">
			<span >配置数: </span>
			<input id="total" readonly="readonly"></input>
			<span>成功插入:</span>
			<input id="success" readonly="readonly"></input>
			<span>条</span>
		</div>
		<div style="width:100%;height:500px">
			<div id="grid"  >
			</div>
		</div>
	</div>
</div>

</body>
</html>
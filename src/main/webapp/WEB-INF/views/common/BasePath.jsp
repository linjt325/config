<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath %>" />
<!-- 通用的css 引用 -->

<link rel="stylesheet" href="Plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="Plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" href="Plugins/easyui/datagrid.css"/>
<link rel="stylesheet" href="Plugins/ztree/zTreeStyle.css"/>
<link rel="stylesheet" href="Plugins/easyui/easyui.css"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="Plugins/ieCompatibility/html5.min.js"></script>
    <script type="text/javascript" src="Plugins/ieCompatibility/respond.js"></script>
    <![endif]-->
<!-- jquery 引用 -->
<script type="text/javascript" src="Plugins/jquery/jquery-1.10.1.js"></script>
<script src="Plugins/easyui/js/jquery.easyui.min.js"></script>
<script src="Plugins/easyui/js/easyui-lang-zh_CN.js"></script>
<script src="Plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="Plugins/echarts/echarts.common.min.js"></script>
<script src="Plugins/layer/layer.js"></script>
<script src="Plugins/echarts/echarts.min.js"></script>
<script src="Plugins/ztree/jquery.ztree.all.min.js"></script>
<script src="Js/common/globel.js"></script>
<script src="Js/common/waterutils.js"></script>
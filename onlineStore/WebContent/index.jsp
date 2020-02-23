<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<script src="js/style.js"></script>
<title>在线商城</title>
</head>
<body>
    <div>
        <div id="banner">
            <a href="#/car.jsp">购物车</a>
            <a href="login.jsp">登录/注册</a>
            <a href="#/me.jsp">我的</a>
            <a href="#">退出</a>
        </div>
        <hr>
        <div id="searcher">
            <input type="text" name="product_info" value="">
            <a href="${pageContext.request.contextPath}/SearchServlet"><button onclick="search()">搜索</button></a>
        </div>
        <hr>
    </div>
    <table width="100%" id="table_show">
        <tr>
            <td>
                <div>
                    <img src="https://img10.360buyimg.com/babel/jfs/t1/85194/18/11757/25540/5e3cc120E8a2cfce7/810b18068094b828.png.webp" alt="惠普游戏台机">
                </div>
                <a href="https://pro.jd.com/mall/active/4FUGMUcLFap5hN1dCoZhsVbogLrQ/index.html">惠普游戏台机</a>
            </td>
            <td>
                <div>
                    <img src="https://img13.360buyimg.com/n7/jfs/t1/85609/5/12569/264653/5e4a6b89E5ae9c264/65f5a5c70037e4e4.jpg" alt="iphone11">
                </div>
                <a href="https://item.jd.com/100004770235.html">iphone11</a>
            </td>
            <td>
                <div>
                    <img src="https://img11.360buyimg.com/n7/jfs/t1/104159/16/12413/63948/5e482028E41fa1a26/8fa65c224bc16ff1.jpg" alt="医用口罩">
                </div>
                <a href="https://item.jd.com/100011385146.html">医用口罩</a>
            </td>
        </tr>
    </table>
    <table width="100%" id="table_searchResult">
    	<tr>
    		<td>待定~</td>
    	</tr>
    </table>
</body>
</html>
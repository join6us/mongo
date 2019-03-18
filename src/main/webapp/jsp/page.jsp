<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
    <title>${pageName}</title>
</head>
 
<body>
    <div id="data">
        <c:forEach var="x" items="${dataList}">
            <p>${x.bno}</p>
        </c:forEach>
    </div>
    <div id="dataResult"></div>
    <div id="root"></div>
    <script src="/js/react/${pageName}.bundle.js"></script>
</body>
</html>
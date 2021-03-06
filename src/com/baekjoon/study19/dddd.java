<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판</title>
		<link href="${pageContext.request.contextPath }/assets/css/mysite.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/assets/css/board.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath }/assets/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/bootstrap/js/bootstrap.js"></script>
	</head>
	
	
	<body>
		<div id="wrap">
	
			<!-- //header -->
			<c:import url="/WEB-INF/views/includes/header.jsp"></c:import>
	
			<div id="container" class="clearfix">
				<div id="aside">
					<h2>게시판</h2>
					<ul>
						<li><a href="${pageContext.request.contextPath}/board/list">일반게시판</a></li>
						<li><a href="${pageContext.request.contextPath}/rboard/list">댓글게시판</a></li>
					</ul>
				</div>
				<!-- //aside -->
	
				<div id="content">
	
					<div id="content-head">
						<h3>게시판</h3>
						<div id="location">
							<ul>
								<li>홈</li>
								<li>게시판</li>
								<li class="last">일반게시판</li>
							</ul>
						</div>
						<div class="clear"></div>
					</div>
					<!-- //content-head -->
		
					<div id="board">
						<div id="list">
							<form action="${pageContext.request.contextPath}/board/list" method="get">
								<div class="form-group text-right">
									<input type="text" name="keyword" value="">
									<button type="submit" id=btn_search>검색</button>
								</div>
							</form>
							<table >
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>글쓴이</th>
										<th>조회수</th>
										<th>작성일</th>
										<th>관리</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${rList}" var="rMap">
										<tr>
											<td>${rMap.NO }</td>
											<td class="text-left"><a href="${pageContext.request.contextPath}/rboard/read/${rMap.NO }">${rMap.TITLE }</a></td>
											<td>${rMap.NAME }</td>
											<td>${rMap.HIT }</td>
											<td>${rMap.REGDATE }</td>
											<td>
												<c:if test="${authUser.no == rMap.USERNO }">
													<a href="${pageContext.request.contextPath}/board/delete/${rMap.NO }">[삭제]</a>
												</c:if>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
				
							<div id="paging">
								<ul>
									<li><a href="">◀</a></li>
									<li><a href="">1</a></li>
									<li><a href="">2</a></li>
									<li><a href="">3</a></li>
									<li><a href="">4</a></li>
									<li class="active"><a href="">5</a></li>
									<li><a href="">6</a></li>
									<li><a href="">7</a></li>
									<li><a href="">8</a></li>
									<li><a href="">9</a></li>
									<li><a href="">▶</a></li>
								</ul>
								
								
								<div class="clear"></div>
							</div>
							<c:choose>
								<c:when test="${authUser == null }"></c:when>
								<c:otherwise><a id="btn_write" href="${pageContext.request.contextPath}/rboard/writeForm?groupNo=0&orderNo=1&depth=0">글쓰기</a></c:otherwise>
							</c:choose>
						
						</div>
						<!-- //list -->
					</div>
					<!-- //board -->
				</div>
				<!-- //content  -->
	
			</div>
			<!-- //container  -->
			
	
			<c:import url="/WEB-INF/views/includes/footer.jsp"></c:import>
			<!-- //footer -->
		</div>
		<!-- //wrap -->
	
	</body>

</html>
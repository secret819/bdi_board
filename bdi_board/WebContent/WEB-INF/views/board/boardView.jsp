<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:if test="${!empty ciCnt}">
	<script>
		alert("커멘트가 정상적으로 등록되었습니다.");
	</script>
</c:if>
<c:if test="${!empty ciDelCnt}">
	<script>
		alert("커멘트가 정상적으로 삭제되었습니다.");
	</script>
</c:if>
<body>
	<article class="container">
		<div class="page-header">
			<div class="col-md-6 col-md-offset-3">
				<h3>게시글 작성</h3>
			</div>
		</div>
		<div class="col-sm-6 col-md-offset-3">
			<div class="form-group">
				<!-- Name field -->
				<label class="control-label " for="uiname">등록자</label> <input
					class="form-control" id="uiname" name="uiname" type="text"
					value="${user.uiname}" disabled />
			</div>
			<div class="form-group">
				<!-- Subject field -->
				<label class="control-label " for="bititle">제목</label> <input
					class="form-control" id="bititle" name="bititle" type="text"
					disabled value="${bi.bititle}" />
			</div>

			<div class="form-group">
				<!-- Message field -->
				<label class="control-label " for="bitext">내용</label>
				<textarea class="form-control" cols="40" id="bitext" name="bitext"
					rows="10" disabled value="${bi.bitext}"></textarea>
			</div>

			<div class="form-group">
				<!-- Message field -->
				<label class="control-label " for="bifile">파일</label>
				<button>
					<a href="${bi.bifile}">${bi.bifile}</a>
				</button>
			</div>

			<div class="form-group">

				<button class="btn" data-page="/board/boardList">리스트가기</button>
			</div>
			<form action="/comment/commentInsert" method="post">
				댓글[${user.uiname}] :
				<textarea name="citext" cols="40"></textarea>
				<button class="btn btn-primary " type="submit">등록</button>
				<input type="hidden" name="binum" value="${bi.binum}"> <input
					type="hidden" name="uinum" value="${user.uinum}">
			</form>
			<c:forEach items="${ciList}" var="ci">
				<div class="form-group">
					${ci.uiname} : ${ci.citext} [${ci.cicredat}]
					<c:if test="${ci.uinum eq user.uinum}">
						<a
							href="/comment/commentDelete?cinum=${ci.cinum}&binum=${ci.binum}">x</a>
					</c:if>
				</div>
			</c:forEach>
		</div>
	</article>
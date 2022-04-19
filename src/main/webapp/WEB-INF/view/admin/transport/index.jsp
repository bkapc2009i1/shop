<jsp:include page="../layout/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-wrapper">
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Transport list</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">List</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<section class="content">
		<div class="card">
			<div class="card-header">
				<h3 class="card-title">
					<a href="${ pageContext.request.contextPath }/admin/transport/create"
						class="btn btn-success">ADD</a>
				</h3>
				<div class="card-tools">
					<button type="button" class="btn btn-tool"
						data-card-widget="collapse" title="Collapse">
						<i class="fas fa-minus"></i>
					</button>
					<button type="button" class="btn btn-tool"
						data-card-widget="remove" title="Remove">
						<i class="fas fa-times"></i>
					</button>
				</div>
			</div>
			<div class="card-body table-responsive p-0">
				<table class="table table-hover text-nowrap">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Fee</th>
							<th>Created_at</th>
							<th>Options</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list }" var="t">
							<tr>
								<td>${t.id }</td>
								<td>${t.name }</td>
								<td>${t.fee }</td>
								<td>${t.created_at }</td>
								<td><a
									href="${ pageContext.request.contextPath }/admin/transport/delete/${t.id}">Delete</a>
									<a
									href="${ pageContext.request.contextPath }/admin/transport/edit/${t.id}">Edit</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="card-footer">Footer</div>
		</div>
	</section>
</div>

<jsp:include page="../layout/footer.jsp" />
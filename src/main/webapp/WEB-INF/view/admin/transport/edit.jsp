<jsp:include page="../layout/header.jsp" />
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper">
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Transport Edit #${transport.id }</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Edit</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<section class="content">
		<div class="card">
			<div class="card-header">
				<h3 class="card-title">
					<a href="${ pageContext.request.contextPath }/admin/transport"
						class="btn btn-success">Back</a>
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
			<form:form
				action="${ pageContext.request.contextPath }/admin/transport/update"
				method="post" modelAttribute="transport">
				<form:hidden path="id" />
				<div class="card-body table-responsive">
					<div class="row">
						<div class="col-md-5">
							<div class="form-group">
								<label for="">Transport name</label>
								<form:input class="form-control" placeholder="Transport name"
									path="name" />
								<form:errors path="name" cssClass="text-danger" />
							</div>
						</div>
						<div class="col-md-5">
							<div class="form-group">
								<label for="">Transport fee</label>
								<form:input class="form-control" placeholder="Transport fee"
									path="fee" />
								<form:errors path="fee" cssClass="text-danger" />
							</div>
						</div>
					</div>
				</div>
				<div class="card-footer text-right">
					<button type="reset" class="btn btn-warning">Reset</button>
					<button class="btn btn-success">Submit</button>
				</div>
			</form:form>
		</div>
	</section>
</div>

<jsp:include page="../layout/footer.jsp" />
<jsp:include page="../layout/header.jsp" />
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper">
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>product create</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Create</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<section class="content">
		<div class="card">
			<div class="card-header">
				<h3 class="card-title">
					<a href="${ pageContext.request.contextPath }/product"
						class="btn btn-success">back</a>
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
			<form:form action="" method="post" modelAttribute="product">
				<div class="card-body table-responsive">
					<div class="row">
						<div class="col-md-5">
							<h3>Product info</h3>
							<hr>
							<div class="form-group">
								<label for="">Product name</label>
								<form:input class="form-control" placeholder="Product name"
									path="name" />
								<form:errors path="name" cssClass="text-danger" />
							</div>
							<div class="form-group">
								<label for="">Product Description</label>
								<form:input path="description" class="form-control"
									placeholder="Product Desciption" />
								<form:errors path="description" cssClass="text-danger" />
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label for="">Category </label>
										<form:select class="form-control" path="category.id">
											<form:option value="1">Danh mục</form:option>
										</form:select>
										<form:errors path="category.id" cssClass="text-danger" />
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label for="">Brand </label>
										<form:select class="form-control" path="brand.id">
											<form:option value="1">Brand</form:option>
										</form:select>
										<form:errors path="brand.id" cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="">Product Content</label>
								<form:textarea id="summernote" path="info"></form:textarea>
								<form:errors path="info" cssClass="text-danger" />
							</div>
						</div>
						<div class="col-md-7 product-detail">
							<h3>
								Product Detail
								<button type="button" class="btn btn-secondary btn-sm create-detail">
									<i class="fa fa-plus"></i>
								</button>
							</h3>
							<hr>
							<div class="row">
								<div class="col-md-3">
									<div class="form-group">
										<label for="">Product Price</label> <input
											class="form-control" placeholder="Price" name="price[]"/>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-group">
										<label for="">Product Quantity</label> <input
											class="form-control" placeholder="Quantity" name="quantity[]"/>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-group">
										<label for="">Product Color</label> 
										<select class="form-control" name="color[]">
											<option value="1">Color</option>
										</select>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-group">
										<label for="">Product Price</label> <input type="file"
											class="form-control" name="upload[]" accept=".jpg,.png,.jpeg"/>
									</div>
								</div>
							</div>
							<hr/>
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
<script>
	$("#summernote").summernote({
		height : 100
	})
	$(".create-detail").click(() => {
		let html = `<div class="row">
			<div class="col-md-3">
			<div class="form-group">
				<label for="">Product Price</label> <input
					class="form-control" placeholder="Price" name="price[]"/>
			</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
					<label for="">Product Quantity</label> <input
						class="form-control" placeholder="Quantity" name="quantity[]"/>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
					<label for="">Product Color</label> 
					<select class="form-control" name="color[]">
						<option value="1">Color</option>
					</select>
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
					<label for="">Product Price</label> <input type="file"
						class="form-control" name="upload[]" accept=".jpg,.png,.jpeg"/>
				</div>
			</div>
		</div>
		<hr/>`
		$(".product-detail").append(html)
	})
</script>
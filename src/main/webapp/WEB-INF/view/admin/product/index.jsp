<jsp:include page="../layout/header.jsp" />

<div class="content-wrapper">
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>product list</h1>
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
					<a href="${ pageContext.request.contextPath }/product/create" class="btn btn-success">ADD</a>
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
							<th>Price</th>
							<th>Category</th>
							<th>Brand</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>183</td>
							<td>John Doe</td>
							<td>11-7-2014</td>
							<td><span class="tag tag-success">Approved</span></td>
							<td>Bacon ipsum dolor sit amet salami venison chicken flank
								fatback doner.</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="card-footer">Footer</div>
		</div>
	</section>
</div>

<jsp:include page="../layout/footer.jsp" />
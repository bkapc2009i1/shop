<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<footer class="main-footer">
	<div class="float-right d-none d-sm-block">
		<b>Version</b> 3.2.0
	</div>
	<strong>Copyright &copy; 2014-2021 <a
		href="https://adminlte.io">AdminLTE.io</a>.
	</strong> All rights reserved.
</footer>
<aside class="control-sidebar control-sidebar-dark"></aside>
</div>
<script src="/admin/plugins/jquery/jquery.min.js"></script>
<script src="/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
<script src="/admin/dist/js/adminlte.min.js"></script>
<script type="text/javascript"
	src="/toastr/toastr.js"></script>
<c:if test="${Success.length() > 0 }">
	<script type="text/javascript">
		toastr.success('${Success}', "Success", {
			timeOut : 1500
		});
	</script>
</c:if>

<c:if test="${Errors.length() > 0 }">
	<script type="text/javascript">
		toastr.error('${Errors}', "Error", {
			timeOut : 1500
		});
	</script>
</c:if>
<script>
	$(document).ready(function() {
		$('#summernote').summernote();
	});
</script>
</body>
</html>
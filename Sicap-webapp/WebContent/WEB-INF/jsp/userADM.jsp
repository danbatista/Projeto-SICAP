<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title> Úsuario - Administração</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="/sicap_assets/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	rel="stylesheet">
<link href="/sicap_assets/assets/css/font-awesome.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/style.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/pages/dashboard.css"
	rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<%@ include file="navbar.jsp" %>
	
	<%@ include file="subnavbar.jsp" %>
	
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					
					<%@ include file="userInsert.jsp" %>

				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /main-inner -->
   </div>

	<!-- javascript list ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/excanvas.min.js"></script>
	<script src="/sicap_assets/assets/js/chart.min.js" type="text/javascript"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
	<script src="/sicap_assets/assets/js/base.js"></script>
	<script language="javascript" type="text/javascript" src="/sicap_assets/assets/js/full-calendar/fullcalendar.min.js">
	</script>
		<script
		src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<script>
		$( document ).ready(function() {
			$(".clean-fields").click(function() {
			    $(this).closest('form').find("input, textarea").val("");
			});
			
			$('#userTable').DataTable();
			
			
			 $("table tbody tr td a").click(function(){
				 console.log("pegou o click");
				  window.location.href = "#update";
				  return true;
			 });

		});
	</script>
</body>
</html>

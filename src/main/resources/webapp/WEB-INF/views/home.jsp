<html>
<head>
<title>Doctors</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../static/css/style.css" th:href="@{/css/style.css}"
	rel="stylesheet" />
</head>
<body>

	<div id="navbar">
		<a href="/healthsystem/doctors/">Home</a> <a href="/healthsystem/doctors/delete">Delete</a> <a
			href="/healthsystem/doctors/create">Create</a>
	</div>

	<br />
	<br />
	<div class="container-fluid">
		<table class="table table-bordered text-center">
			<thead>
				<tr>
					<th scope="col" class="text-center">#</th>
					<th scope="col" class="text-center">Name</th>
					<th scope="col" class="text-center">Specialization</th>
				</tr>
			</thead>
			<tbody>
				<tr th:each="doctor : ${doctors}">
					<td><span th:text="${doctor.id}"> ID </span></td>
					<td><span th:text="${doctor.name}"> Name </span></td>
					<td><span th:text="${doctor.specilization}"> Specilization </span></td>
				</tr>
			</tbody>
		</table>
	</div>
	<br/><br/>

	<script>
		window.onscroll = function() {
			myFunction()
		};

		var navbar = document.getElementById("navbar");
		var sticky = navbar.offsetTop;

		function myFunction() {
			if (window.pageYOffset >= sticky) {
				navbar.classList.add("sticky")
			} else {
				navbar.classList.remove("sticky");
			}
		}
	</script>
</body>
</html>
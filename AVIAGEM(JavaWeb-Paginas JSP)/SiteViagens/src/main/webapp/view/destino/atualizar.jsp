<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Destino</title>

<!-- CDN CSS Bootstrap v-5.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
</head>
<body>
	<main>
		<header class="header">
			<div class="row my-4">
				<div class="col">
					<h1>Atualizar Destino</h1>
				</div>
			</div>

		</header>

		<div class="container py-3">
			<form action="./atualizar-destino">

				<div class="form-group mb-3">
					<label for="id" class="form-label"> Nome </label> <input
						type="text" id="nome" name="nome" class="form-control"
						value="<%=request.getAttribute("nome")%>" />
				</div>

				<div class="form-group mb-3">
					<label for="nome" class="form-label"> Valor </label> <input
						type="text" id="valor" name="valor" class="form-control"
						value="<%=request.getAttribute("valor")%>" />
				</div>

				<div class="form-group mb-3">
					<label for="email" class="form-label"> ID Destino </label> <input
						type="text" id="id_destino" name="nome" class="form-control"
						value="<%=request.getAttribute("id_destino")%>" />
				</div>

				<button type="submit" class="btn btn-primary">Enviar</button>

				<a href="../../cliente" class="btn btn-danger"
					style="margin-left: 10px"> Cancelar </a>
			</form>
		</div>

	</main>

	<!-- CDN JS Bootstrap v-5.1 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
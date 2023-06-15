<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Gestión Material</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Matrícula Alumno" onclick="window.location.href='redirectMatriculaAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Alta Portatil" onclick="window.location.href='redirectAltaPortatil'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Baja Portatil" onclick="window.location.href='redirectBajaAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Consulta Portatil" onclick="window.location.href='redirectConsultaPortatilPorAlumno'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Consulta Alumno" onclick="window.location.href='redirectConsultaAlumnoPorPortatil'"/>
      </li>
      <li class="nav-item active">
        <input type="button" class="btn btn-light" value="Todos los alumnos y sus portatiles" onclick="window.location.href='redirectTodosLosAlunosYSusPortatiles'"/>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>
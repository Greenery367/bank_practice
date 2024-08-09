<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>myBank</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/common.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<div class="m--flex-container">
		<div class="m--container">
			<div class="jumbotron text-center m--banner-img" style="margin-bottom: 0">
				<h1>My Bank</h1>
				<p>마이바이티스를 활용한 스프링 부트 앱 만들어보기</p>
			</div>
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<a class="navbar-brand" href="#">Navbar</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					</ul>
				</div>
			</nav>

			<div class="container" style="margin-top: 30px">
				<div class="row">
					<div class="col-sm-4">
						<h2>About Me</h2>
						<h5>Photo of me:</h5>
						<div class="m--profile"></div>
						<p>코린이 개발을 위한 뱅크 앱</p>
						<h3>Some Links</h3>
						<p>Lorem ipsum dolor sit ame.</p>
						<ul class="nav nav-pills flex-column">
							<li class="nav-item"><a class="nav-link active" href="#">Active</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
							<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a></li>
						</ul>
						<hr class="d-sm-none">
					</div>
					<!-- end of header.jsp  -->
					
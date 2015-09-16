<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<!-- <link rel="icon" href="../../favicon.ico"> -->

<title>主页</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="resources/js/jquery-2.1.4.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<!-- Custom styles for this template -->
<link href="resources/css/main/main1.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand active" href="#">主页</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#main">功能1</a></li>
					<li><a href="#about">功能2</a></li>
					<li><a href="#contact">功能3</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dropdown <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
<!-- 	<div class="jumbotron"> -->
<!-- 		<div class="container"> -->
<!-- 			<h1><br><br><br>Sign</h1> -->
<!-- 		</div> -->
<!-- 	</div> -->
	<section>
		<div class="container">
			<div class="row">
				<main class="col-md-8">
					<artical >
						<div class="post-head">
							<div class="post-title">
								<h1>title</h1>
							</div>
							<div class="post-meta">
								<span class="post-meta">author</span><time>2011/01/01</time>
							</div>
						</div>
						<div>content</div>
						<div>permalink</div>
						<footer>tag</footer>
					</artical>
				</main>
				<aside class="col-md-4">
					<div class="widgt">
						<h4>bbb</h4>
					</div>
				</aside>
			</div>
		</div>
	</section>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!--     <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>

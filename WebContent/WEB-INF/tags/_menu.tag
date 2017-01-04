<!-- INICIO NAV (alterar pra include)-->

  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">

        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Project Name</a>
      </div>

      <div class="collapse navbar-collapse" id="menu">
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
            <ul class="dropdown-menu">
	            	              <li><a href="<c:url value='/product/form'/>"><span class="glyphicon glyphicon-plus-sign"></span> Add product</a></li>	              
	              <li><a href="<c:url value='/product'/>"><span class="glyphicon glyphicon-menu-hamburger"></span> List product</a></li>
				  <li role="separator" class="divider"></li>
	              <li><a href="<c:url value='/category/form'/>"><span class="glyphicon glyphicon-plus-sign"></span> Add category</a></li>	              
	              <li><a href="<c:url value='/category'/>"><span class="glyphicon glyphicon-menu-hamburger"></span> List category</a></li>
				  <li role="separator" class="divider"></li>
            </ul>
          </li>
        </ul>
        
      </div>
    </div>
  </nav>

  <!-- FINAL NAV -->
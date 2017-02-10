<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="main-header" >
  <a href="#" class="logo">
    <span class="logo-mini">eSf</span>
    <span class="logo-lg"><text font-family="lucida calligraphy"><span><b>eSafe</b></span> Orion</text></span>
  </a>
  <nav class="navbar navbar-static-top" role="navigation">
    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
      <span class="sr-only">Toggle navigation</span>
    </a>
    <div class="navbar-custom-menu">
      <ul class="nav navbar-nav">
        <!-- Language menu -->
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
              <span>
              	<img class="img-circle" src="<c:url value='/'/>{{'LANG_IMAGE' | translate}}" />
                <span class="caret"></span>
              </span>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="pt-btn" href="#" ng-click="changeLanguage('pt')"><img class="img-circle" src="<c:url value='/img/pt-br.png'/>"/> Português</a></li>
            <li><a id="en-btn" href="#" ng-click="changeLanguage('en')"><img class="img-circle" src="<c:url value='/img/en.png'/>"/> English</a></li>
            <li><a id="es-btn" href="#" ng-click="changeLanguage('es')"><img class="img-circle" src="<c:url value='/img/es.png'/>"/> Español</a></li>
          </ul>
        </li>
        <!-- User Account: style can be found in dropdown.less -->
        <li class="dropdown user user-menu">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
            <img src="<c:url value='/img/avatar5.png'/>" class="user-image" alt="?">
            <span class="hidden-xs">USER <!--%= user.name %--></span>
            <span class="caret"></span>
          </a>
          <ul class="dropdown-menu">
            <!-- User image -->
            <li class="user-header">
              <img src="<c:url value='/img/avatar5.png'/>" class="img-circle" alt="?">
              <p>
                <!-- %= user.name %-->User name - <!-- %= user.login %> --> login
                <small><!--%= user.profile.description %-->Perfil do usuário</small>
              </p>
            </li>
            <!-- Menu Footer-->
            <li class="user-footer">
              <div class="pull-left">
                <a href="<c:url value='/profile'/>" target="_self" class="btn btn-default btn-flat">Perfil</a>
              </div>
              <div class="pull-right">
                <a href="<c:url value='/logout'/>" target="_self" class="btn btn-default btn-flat">Sair</a>
              </div>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </nav>
</header>

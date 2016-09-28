<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="main-header" >
  <a href="#" class="logo">
    <!-- mini logo for sidebar mini 50x50 pixels -->
    <span class="logo-mini">e<b>S</b>afe</span>
    <!-- logo for regular state and mobile devices -->
    <span class="logo-lg"><text font-family="lucida calligraphy"><b>eSafe</b> Orion</text></span>
    <!-- LOGO -->
  </a>
  <!-- Header Navbar: style can be found in header.less -->
  <nav class="navbar navbar-static-top" role="navigation">
    <!-- Sidebar toggle button-->
    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
      <span class="sr-only">Toggle navigation</span>
    </a>
    <!-- User Account menu -->
    <div class="navbar-custom-menu">
      <ul class="nav navbar-nav">
        <!-- Language menu -->
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
            <!-- <div data-translatable> -->
              <span><img class="img-circle" src="<c:url value='/img/pt-br.png'/>" /><span class="caret"></span></span>
            <!-- 
              <span><img class="img-circle" src="<c:url value='/img/en.png'/>" /><span class="caret"></span></span>
              <span><img class="img-circle" src="<c:url value='/img/es.png'/>" /><span class="caret"></span></span>
            </div>
            -->
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="pt-btn" href="#"><img class="img-circle" src="<c:url value='/img/pt-br.png'/>"/> Portugu�s</a></li>
            <li><a id="en-btn" href="#"><img class="img-circle" src="<c:url value='/img/en.png'/>"/> English</a></li>
            <li><a id="es-btn" href="#"><img class="img-circle" src="<c:url value='/img/es.png'/>"/> Espa�ol</a></li>
          </ul>
        </li>
        <!-- User Account: style can be found in dropdown.less -->
        <li class="dropdown user user-menu">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">
            <img src="<c:url value='/img/avatar5.png'/>" class="user-image" alt="User Image">
            <span class="hidden-xs">USER <!--%= user.name %--></span>
          </a>
          <ul class="dropdown-menu">
            <!-- User image -->
            <li class="user-header">
              <img src="<c:url value='/img/avatar5.png'/>" class="img-circle" alt="User Image">
              <p>
                <!-- %= user.name %-->User name - <!-- %= user.login %> --> login
                <small><!--%= user.profile.description %-->Perfil do usu�rio</small>
              </p>
            </li>
            <!-- Menu Footer-->
            <li class="user-footer">
              <div class="pull-left">
                <a href="/profile" class="btn btn-default btn-flat">Perfil</a>
              </div>
              <div class="pull-right">
                <a href="/logout" class="btn btn-default btn-flat">Sair</a>
              </div>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </nav>
</header>

<!-- 
<script>
  var ptButton = document.getElementById('pt-btn');
  var enButton = document.getElementById('en-btn');
  var esButton = document.getElementById('es-btn');
  var i18n = domI18n({
    selector: '[data-translatable]',
    separator: ' // ',
    languages: ['pt-BR', 'en', 'es'],
    defaultLanguage: 'pt-BR',
    currentLanguage: 'pt-BR'
  });
  ptButton.onclick = function () {
    i18n.changeLanguage('pt-BR');
  };
  enButton.onclick = function () {
    i18n.changeLanguage('en');
  };
  esButton.onclick = function () {
    i18n.changeLanguage('es');
  };
</script>
 -->
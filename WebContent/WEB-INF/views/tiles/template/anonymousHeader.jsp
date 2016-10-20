<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="main-header" >
  <a href="#" class="logo">
    <span class="logo-mini">eSf</span>
    <span class="logo-lg"><text font-family="lucida calligraphy"><span><b>eSafe</b></span> Orion</text></span>
  </a>
  <nav class="navbar navbar-static-top" role="navigation">
    <div class="navbar-custom-menu">
      <ul class="nav navbar-nav">
        <!-- Language menu -->
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
              <span><img class="img-circle" src="<c:url value='/'/>{{'LANG_IMAGE' | translate}}" /><span class="caret"></span></span>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="pt-btn" href="#" ng-click="changeLanguage('pt-BR')"><img class="img-circle" src="<c:url value='/img/pt-br.png'/>"/> Português</a></li>
            <li><a id="en-btn" href="#" ng-click="changeLanguage('en')"><img class="img-circle" src="<c:url value='/img/en.png'/>"/> English</a></li>
            <li><a id="es-btn" href="#" ng-click="changeLanguage('es')"><img class="img-circle" src="<c:url value='/img/es.png'/>"/> Español</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </nav>
</header>

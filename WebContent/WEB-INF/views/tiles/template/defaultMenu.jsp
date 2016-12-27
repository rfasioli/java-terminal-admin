<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="main-sidebar">
  <!-- Inner sidebar -->
  <div class="sidebar">
    <!-- Sidebar Menu -->
    <ul class="sidebar-menu" ng-controller="ngMenu">
      <li class="header">{{'MENU_TITLE' | translate}}</li>
      <li class="treeview" ng-repeat="item in menu">
        <a href="" target="_self" ><i class="{{item.menu.dsIcone}}"></i><span>{{item.menu.dsPrograma | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li ng-repeat="subitem in item.submenus">
          	<a href="<c:url value='/'/>{{subitem.dsPath}}" target="_self" >
          	  <i class="{{subitem.dsIcone}}"></i>{{subitem.dsPrograma | translate}}
          	</a>
          </li>
        </ul>
      </li>
    </ul><!-- /.sidebar-menu -->
  </div><!-- /.sidebar -->
</div><!-- /.main-sidebar -->	

<script type="text/javascript" src="<c:url value='/js/controller/menu.js' />"></script>

<script>
  $(document).ready(function() {
     $(".treeview-menu li.disabled a").click(function() {
       return false;
     });
  });
</script>

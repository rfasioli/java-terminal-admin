
<div class="main-sidebar">
  <!-- Inner sidebar -->
  <div class="sidebar">
    <!-- Sidebar Menu -->
    <ul class="sidebar-menu"> <!-- ng-app="menuApp" ng-controller="montaMenuCtrl" -->
      <li class="header">{{'MENU_TITLE' | translate}}</li>
      <li class="treeview">
        <a href="#"><i class="fa fa-area-chart"></i><span>{{'MENU_MONITORING' | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="active"><a href="/geral"><i class="fa fa-user-plus"></i>{{'MENU_MONITORING_OVERVIEW' | translate}}</a></li>
          <li><a href="/monitoramento"><i class="fa fa-key"></i>{{'MENU_MONITORING_TERMINALS' | translate}}</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-tachometer" aria-hidden="true"></i><span>{{'MENU_MANAGEMENT' | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/gerenciamento/usuario"><i class="fa fa-user-plus"></i>{{'MENU_MANAGEMENT_USERS' | translate}}</a></li>
          <li class="disabled"><a href="/gerenciamento/fornecedor"><i class="fa fa-industry"></i>{{'MENU_MANAGEMENT_PROVIDER' | translate}}</a></li>
          <li class="disabled"><a href="/gerenciamento/regiao"><i class="fa fa-globe"></i>{{'MENU_MANAGEMENT_REGION' | translate}}</a></li>
          <li class="disabled"><a href="/gerenciamento/terminal"><i class="fa fa-laptop"></i>{{'MENU_MANAGEMENT_TERMINAL' | translate}}</a></li>
          <li class="disabled"><a href="/gerenciamento/estabelecimento"><i class="fa fa-home"></i>{{'MENU_MANAGEMENT_STORE' | translate}}</a></li>
          <li><a href="/management/cadastraCliente"><i class="fa fa-institution"></i>{{'MENU_MANAGEMENT_CLIENT' | translate}}</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-search"></i><span>{{'MENU_QUERY' | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/consultas/usuario"><i class="fa fa-group"></i>{{'MENU_QUERY_USERS' | translate }}</a></li>
          <li class="disabled"><a href="/consultas/terminais"><i class="fa fa-desktop"></i>{{'MENU_QUERY_TERMINALS' | translate}}</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-print"></i><span>{{'MENU_REPORT' | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li><a href="/reports/depositos"><i class="fa fa-folder-open-o"></i>{{'MENU_REPORT_DEPOSIT' | translate}}</a></li>
          <li><a href="/reports/fechamento"><i class="fa fa-folder-o"></i>{{'MENU_REPORT_CLOSING' | translate}}</a></li>
          <li><a href="/reports/numerario"><i class="fa fa-money"></i>{{'MENU_REPORT_TOTALCASH' | translate}}</a></li>
          <li><a href="/reports/usuario_cofre"><i class="fa fa-user"></i>{{'MENU_REPORT_SAFEBOXUSERS' | translate}}</a></li>
          <li><a href="/reports/movimento_cofre"><i class="fa fa-exchange"></i>{{'MENU_REPORT_SAFEBOXTRANSACTIONS' | translate}}</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-cog"></i><span>{{'MENU_SYSTEM' | translate}}</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/sistema/permissao" ><i class="fa fa-universal-access"></i>{{'MENU_SYSTEM_PERMISSION' | translate}}</a></li>
          <li class="disabled"><a href="/sistema/preferencias"><i class="fa fa-cog"></i>{{'MENU_SYSTEM_PREFERENCES' | translate}}</a></li>
        </ul>
      </li>
<!--       <div ng-app="menuApp" ng-controller="montaMenuCtrl">
        <li class="treeview">
          <a href="#"><span>Meu Menu</span></a>
          <ul class="treeview-menu" ng-repeat="item in items">
            <li><a href="#"><span>ITEM: {{item.DS_ITEM}} {{item.</span></a></li>
          </ul>
        </li>
      </div>
 -->      
    </ul><!-- /.sidebar-menu -->
  </div><!-- /.sidebar -->
</div><!-- /.main-sidebar -->	

<!-- <script src="/controllers/menu.js"></script> -->
<!-- 
<script>
  $(document).ready(function() {
     $(".treeview-menu li.disabled a").click(function() {
       return false;
     });
  });  
  
  var menuApp = angular.module('menuApp', []);

  function montaMenuCtrl($scope, $http) {
    $http.get('/model/master/MenuPerfil?id_cliente=3&id_perfil=%=user.profile.id%>')
    .success(function(data) {
      $scope.items = data[0];
    })
    .error(function(data) {
      console.log('menuApp::montaMenuCtrl - Error: ' + data);
    });
    
  }
</script>
-->  


<div class="main-sidebar">
  <!-- Inner sidebar -->
  <div class="sidebar">
    <!-- Sidebar Menu -->
    <ul class="sidebar-menu"> <!-- ng-app="menuApp" ng-controller="montaMenuCtrl" -->
      <li class="header">Painel Administrativo</li>
      <li class="treeview">
        <a href="#"><i class="fa fa-area-chart"></i><span>Monitora��o</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="active"><a href="/geral"><i class="fa fa-user-plus"></i>Vis�o Geral</a></li>
          <li><a href="/monitoramento"><i class="fa fa-key"></i>Monitora��o Terminais</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-tachometer" aria-hidden="true"></i><span>Gerenciamento</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/gerenciamento/usuario"><i class="fa fa-user-plus"></i>Cadastro de usu�rio </a></li>
          <li class="disabled"><a href="/gerenciamento/senha"><i class="fa fa-key"></i>Altera��o de senha</a></li>
          <li class="disabled"><a href="/gerenciamento/fornecedor"><i class="fa fa-industry"></i>Cadastro Fornecedor</a></li>
          <li class="disabled"><a href="/gerenciamento/regiao"><i class="fa fa-globe"></i>Cadastro Regi�o</a></li>
          <li class="disabled"><a href="/gerenciamento/terminal"><i class="fa fa-laptop"></i>Cadastro Terminal</a></li>
          <li class="disabled"><a href="/gerenciamento/permissao"><i class="fa fa-unlock-alt"></i>Permiss�o Terminal</a></li>
          <li class="disabled"><a href="/gerenciamento/estabelecimento"><i class="fa fa-home"></i>Cadastro Estabelecimento</a></li>
          <li><a href="/management/cadastraCliente"><i class="fa fa-institution"></i>Cadastro Cliente</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-search"></i><span>Consulta</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/consultas/usuario"><i class="fa fa-group"></i>Usu�rios</a></li>
          <li class="disabled"><a href="/consultas/terminais"><i class="fa fa-desktop"></i>Terminais</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-print"></i><span>Relat�rios</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li><a href="/reports/depositos"><i class="fa fa-folder-open-o"></i>Dep�sito</a></li>
          <li><a href="/reports/fechamento"><i class="fa fa-folder-o"></i>Fechamento</a></li>
          <li><a href="/reports/numerario"><i class="fa fa-money"></i>Numer�rio</a></li>
          <li><a href="/reports/usuario_cofre"><i class="fa fa-user"></i>Usu�rio Cofre</a></li>
          <li><a href="/reports/movimento_cofre"><i class="fa fa-exchange"></i>Movimento Cofre</a></li>
        </ul>
      </li>
      <li class="treeview">
        <a href="#"><i class="fa fa-cog"></i><span>Sistema</span> <i class="fa fa-angle-left pull-right"></i></a>
        <ul class="treeview-menu">
          <li class="disabled"><a href="/sistema/permissao" ><i class="fa fa-universal-access"></i>Permiss�o Funcionalidades</a></li>
          <li class="disabled"><a href="/sistema/preferencias"><i class="fa fa-cog"></i>Prefer�ncias</a></li>
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


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		Painel de controle <small>Visão geral</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li>Monitoramento</li>
		<li class="active">Geral</li>
	</ol>
</section>
<section class="content"  id="monitoramento" ng-app="monitoramentoApp"
	ng-controller="monitoramentoAnaliticoCtrl">
	<!-- Small boxes (Stat box) -->
	<!-- Small boxes (Stat box) -->
	<!-- Small boxes (Stat box) -->
	<div class="row">
		<div class="col-lg-3 col-xs-6">
			<!-- small box -->
			<div class="small-box bg-green">
				<div class="inner">
					<h3>
						<sup style="font-size: 20px">R$</sup>{{ transito / 1000 | number :
						0 }}<sup style="font-size: 20px">k</sup>
					</h3>
					<p>
						Numerário em campo <small> em 29 terminais</small>
					</p>
				</div>
				<div class="icon">
					<i class="ion ion-social-usd"></i>
				</div>
				<a href="/reports/numerario" class="small-box-footer">Relatório
					de Numerário <i class="fa fa-arrow-circle-right"></i>
				</a>
			</div>
		</div>
		<!-- ./col -->
		<div class="col-lg-3 col-xs-6">
			<!-- small box -->
			<div class="small-box bg-yellow">
				<div class="inner">
					<h3>
						<sup style="font-size: 20px">R$</sup>{{ recolhido / 1000 | number
						: 0 }}<sup style="font-size: 20px">k</sup>
					</h3>
					<p>
						Numerário Recolhido <small> de {{estado.OK +
							estado.ERROR}} terminais</small>
					</p>
				</div>
				<div class="icon">
					<i class="ion ion-pie-graph"></i>
				</div>
				<a href="/reports/movimento_cofre" class="small-box-footer">Recolhimentos
					<i class="fa fa-arrow-circle-right"></i>
				</a>
			</div>
		</div>
		<!-- ./col -->
		<div class="col-lg-3 col-xs-6">
			<!-- small box -->
			<div class="small-box bg-aqua">
				<div class="inner">
					<h3>
						{{ estado.OK * 100 / (estado.OK + estado.ERROR) | number : 1 }}<sup
							style="font-size: 20px">%</sup>
					</h3>
					<p>
						Terminais disponíveis <small>de {{(estado.OK +
							estado.ERROR)}} terminais</small>
					</p>
				</div>
				<div class="icon">
					<i class="ion ion-ios-checkmark"></i>
				</div>
				<a href="/monitoramento" class="small-box-footer">Monitoração de
					terminais <i class="fa fa-arrow-circle-right"></i>
				</a>
			</div>
		</div>
		<!-- ./col -->
		<div class="col-lg-3 col-xs-6">
			<!-- small box -->
			<div class="small-box bg-red">
				<div class="inner">
					<h3>
						{{ estado.ERROR * 100 / (estado.OK + estado.ERROR) | number : 1}}<sup
							style="font-size: 20px">%</sup>
					</h3>
					<p>
						Terminais indisponíveis <small>{{estado.ERROR}} terminais</small>
					</p>
				</div>
				<div class="icon">
					<i class="ion ion-ios-information"></i>
				</div>
				<a href="/monitoramento" class="small-box-footer">Monitoração de
					terminais <i class="fa fa-arrow-circle-right"></i>
				</a>
			</div>
		</div>
		<!-- ./col -->
	</div>
	<!-- /.row -->

	<!-- JSChart -->
	<!-- JSChart -->
	<!-- JSChart -->
	<div class="row">
		<div class="col-md-6">
			<!-- AREA CHART -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">Depósitos</h3>
					<div class="box-tools pull-right">
						<button class="btn btn-box-tool" data-widget="collapse">
							<i class="fa fa-minus"></i>
						</button>
						<!--<button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>-->
					</div>
				</div>
				<div class="box-body">
					<div class="chart">
						<canvas id="line" class="chart chart-line" style="height: 250px"
							chart-data="data" chart-labels="labels" chart-legend="true"
							chart-series="series" chart-click="onClick">
                    </canvas>
					</div>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		</div>

		<div class="col-md-6">
			<!-- AREA CHART -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">Status Terminais</h3>
					<div class="box-tools pull-right">
						<button class="btn btn-box-tool" data-widget="collapse">
							<i class="fa fa-minus"></i>
						</button>
						<!--<button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>-->
					</div>
				</div>
				<div class="box-body">
					<div class="chart">
						<canvas id="bar" class="chart chart-bar"
							chart-data="terminal.data" chart-labels="terminal.labels"
							chart-series="terminal.series" chart-legend="true">
                    </canvas>
					</div>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		</div>

	</div>
	<!-- /.row -->
</section>

<script type="text/javascript" src="<c:url value='/js/controller/analitico.js' />"></script>

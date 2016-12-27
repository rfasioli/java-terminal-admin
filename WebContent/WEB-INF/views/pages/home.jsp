<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		eSafe <small>Sistema de gerenciamento de terminais</small>
	</h1>
</section>
<section class="content" id="home">
	<h2>Bem vindo!</h2>

	<div class="chart">
		<canvas id="line" class="chart chart-line" style="height: 250px"
			chart-data="data" chart-labels="labels" chart-legend="true"
			chart-series="series" chart-click="onClick">
        </canvas>
	</div>

</section>

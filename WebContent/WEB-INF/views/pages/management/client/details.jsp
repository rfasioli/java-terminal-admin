@model eSafeOrion.Models.TB_CLIENTE

@{
    ViewBag.Title = "Cadastro de Clientes - Detalhe";
}

<h4>
    <a href="@Url.Action("Index")">
        <span class="fa-stack" style="font-size: 0.7em;">
            <i class="fa fa-circle-thin fa-stack-2x"></i>
            <i class="fa fa-reply fa-stack-1x"></i>
        </span>
    </a>&nbsp;
    Detalhes
</h4>

<div class="panel panel-default">
    <div class="panel-heading">
        <h4>Cliente</h4>
    </div>
    <div class="panel-body fixed-panel">
        <dl class="dl-horizontal">
            <dt>@Html.DisplayNameFor(model => model.idCliente)</dt>
            <dd>@Html.DisplayFor(model => model.idCliente)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsNomeFantasia)</dt>
            <dd>@Html.DisplayFor(model => model.dsNomeFantasia)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsRazaoSocial)</dt>
            <dd>@Html.DisplayFor(model => model.dsRazaoSocial)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsCnpj)</dt>
            <dd>@Html.DisplayFor(model => model.dsCnpj)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsEndereco)</dt>
            <dd>@Html.DisplayFor(model => model.dsEndereco)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsCidade)</dt>
            <dd>@Html.DisplayFor(model => model.dsCidade)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsEstado)</dt>
            <dd>@Html.DisplayFor(model => model.dsEstado)</dd>

            <dt>@Html.DisplayNameFor(model => model.nrCep)</dt>
            <dd>@Html.DisplayFor(model => model.nrCep)</dd>

            <dt>@Html.DisplayNameFor(model => model.nrTelefone)</dt>
            <dd>@Html.DisplayFor(model => model.nrTelefone)</dd>

            <dt>@Html.DisplayNameFor(model => model.dtCadastro)</dt>
            <dd>@Html.DisplayFor(model => model.dtCadastro)</dd>

            <dt>@Html.DisplayNameFor(model => model.icAtivo)</dt>
            <dd>@Html.DisplayFor(model => model.icAtivo)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsConexao)</dt>
            <dd>@Html.DisplayFor(model => model.dsConexao)</dd>

            <dt>@Html.DisplayNameFor(model => model.dsEmail)</dt>
            <dd>@Html.DisplayFor(model => model.dsEmail)</dd>

        </dl>
    </div>
</div>

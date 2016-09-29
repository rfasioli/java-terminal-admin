@model eSafeOrion.Models.TB_CLIENTE

@{
    ViewBag.Title = "Cadastro de Cliente - Alteração";
}

<h4>
    <a href="@Url.Action("Index")">
        <span class="fa-stack" style="font-size: 0.7em;">
            <i class="fa fa-circle-thin fa-stack-2x"></i>
            <i class="fa fa-reply fa-stack-1x"></i>
        </span>
    </a>&nbsp;
    Alteração
</h4>

@using (Html.BeginForm())
{
    @Html.AntiForgeryToken()

    <div class="box box-primary">
        <div class="box-header with-border">
            <input type="submit" value="Salvar" class="btn btn-success btn-flat pull-right" />
            <h5>Cliente</h5>
        </div>
        <div class="box-body form-horizontal">
            @Html.ValidationSummary(true, "", new { @class = "text-danger" })
            @Html.HiddenFor(model => model.idCliente)


            <div class="form-group">
                @Html.LabelFor(model => model.dsNomeFantasia, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsNomeFantasia, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsNomeFantasia, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.dsRazaoSocial, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsRazaoSocial, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsRazaoSocial, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.dsCnpj, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsCnpj, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsCnpj, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.dsEndereco, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsEndereco, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsEndereco, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.dsCidade, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsCidade, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsCidade, "", new { @class = "text-danger" })
                </div>
            </div>

            @{
                var ufListItems = new List<SelectListItem>
                {
                    new SelectListItem { Text = "AC", Value = "AC" },
                    new SelectListItem { Text = "AL", Value = "AL" },
                    new SelectListItem { Text = "AM", Value = "AM" },
                    new SelectListItem { Text = "AP", Value = "AP" },
                    new SelectListItem { Text = "BA", Value = "BA" },
                    new SelectListItem { Text = "CE", Value = "CE" },
                    new SelectListItem { Text = "DF", Value = "DF" },
                    new SelectListItem { Text = "ES", Value = "ES" },
                    new SelectListItem { Text = "GO", Value = "GO" },
                    new SelectListItem { Text = "MA", Value = "MA" },
                    new SelectListItem { Text = "MG", Value = "MG" },
                    new SelectListItem { Text = "MS", Value = "MS" },
                    new SelectListItem { Text = "MT", Value = "MT" },
                    new SelectListItem { Text = "PA", Value = "PA" },
                    new SelectListItem { Text = "PB", Value = "PB" },
                    new SelectListItem { Text = "PE", Value = "PE" },
                    new SelectListItem { Text = "PI", Value = "PI" },
                    new SelectListItem { Text = "PR", Value = "PR" },
                    new SelectListItem { Text = "RJ", Value = "RJ" },
                    new SelectListItem { Text = "RN", Value = "RN" },
                    new SelectListItem { Text = "RO", Value = "RO" },
                    new SelectListItem { Text = "RR", Value = "RR" },
                    new SelectListItem { Text = "RS", Value = "RS" },
                    new SelectListItem { Text = "SC", Value = "SC" },
                    new SelectListItem { Text = "SE", Value = "SE" },
                    new SelectListItem { Text = "SP", Value = "SP" },
                    new SelectListItem { Text = "TO", Value = "TO" }
                };
            }
            <div class="form-group">
                @Html.LabelFor(model => model.dsEstado, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.DropDownListFor(model => model.dsEstado, new SelectList(ufListItems, "Value", "Text"), "-- Selecione --", new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsEstado, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.nrCep, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.nrCep, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.nrCep, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.nrTelefone, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.nrTelefone, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.nrTelefone, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.icAtivo, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.CheckBoxFor(model => model.icAtivo, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.icAtivo, "", new { @class = "text-danger" })
                </div>
            </div>

            <div class="form-group">
                @Html.LabelFor(model => model.dsEmail, htmlAttributes: new { @class = "control-label col-md-2" })
                <div class="col-md-10">
                    @Html.EditorFor(model => model.dsEmail, new { htmlAttributes = new { @class = "form-control" } })
                    @Html.ValidationMessageFor(model => model.dsEmail, "", new { @class = "text-danger" })
                </div>
            </div>

        </div>
    </div>
}


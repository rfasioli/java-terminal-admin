'use strict';

var app = angular.module('app', ['pascalprecht.translate',
                                 'ngMaterial']);

app.config(function ($translateProvider) {
	$translateProvider.fallbackLanguage('pt-BR');
	$translateProvider.registerAvailableLanguageKeys(['pt-BR', 'en'], {
		'pt_*':'pt_BR',
		'en_*':'en'
	});
	//TODO - Usar o angular-translate-loader-url para carregar arquivos de bundle para os idiomas
	$translateProvider.translations('pt-BR', {
		LANG_IMAGE: 'img/pt-br.png',
		LANG_NAME: 'Portugu�s', 
		NEW: 'Novo',
		EDIT: 'Alterar',
		SAVE: 'Salvar',
		DELETE: 'Excluir',
		UPDATE: 'Atualizar',
		DETAILS: 'Detalhes',
		CONFIRM: 'Confirmar',
		MENU_TITLE: 'Painel Administrativo',
		MENU_MANAGEMENT: 'Gerenciamento',
		MENU_MANAGEMENT_PROFILES: 'Cadastro de Perfis',
		MENU_MANAGEMENT_USERS: 'Cadastro de usu�rio',
		MENU_MANAGEMENT_PROVIDER: 'Cadastro de Fornecedor',
		MENU_MANAGEMENT_REGION: 'Cadastro de Regi�o',
		MENU_MANAGEMENT_TERMINAL: 'Cadastro de Terminal',
		MENU_MANAGEMENT_STORE: 'Cadastro de Estabelecimento',
		MENU_MANAGEMENT_CLIENT: 'Cadastro de Cliente',
		MENU_MONITORING: 'Monitora��o',
		MENU_MONITORING_OVERVIEW: 'Vis�o Geral',
		MENU_MONITORING_TERMINALS: 'Monitora��o de Terminais',
		MENU_QUERY: 'Consultas',
		MENU_QUERY_USERS: 'Usu�rios',
		MENU_QUERY_TERMINALS: 'Terminais',
		MENU_REPORT: 'Relat�rios',
		MENU_REPORT_DEPOSIT: 'Relat�rios',
		MENU_REPORT_CLOSING: 'Relat�rios',
		MENU_REPORT_TOTALCASH: 'Relat�rios',
		MENU_REPORT_SAFEBOXUSERS: 'Relat�rios',
		MENU_REPORT_SAFEBOXTRANSACTIONS: 'Relat�rios',
		MENU_SYSTEM: 'Sistema',
		MENU_SYSTEM_PERMISSION: 'Permiss�o Funcionalidades',
		MENU_SYSTEM_PREFERENCES: 'Prefer�ncias',
		CLIENT: 'Cliente',
		CLIENTS: 'Clientes',
		CLIENT_ID: 'ID',
		CLIENT_FANTASY_NAME: 'Nome Fantasia',
		CLIENT_COMPANY_NAME: 'Raz�o Social',
		CLIENT_DOCUMENT: 'CNPJ',
		CLIENT_CITY: 'Cidade',
		CLIENT_STATE: 'Estado',
		CLIENT_ACTIVE: 'Ativo',
		CLIENT_DATE_INCLUSION: 'Data de Cadastro',
		CLIENT_CONNECTION: 'Conex�o',
		CLIENT_DELETE_MESSAGE: 'Deseja apagar o registro do cliente?',
		PROFILE: 'Perfil',
		PROFILES: 'Perfis',
		PROFILE_ID: 'ID',
		PROFILE_DESCRIPTION: 'Descri��o',
		PROFILE_TYPE: 'Tipo',
		PROFILE_LEVEL: 'N�vel',
		PROFILE_ACCESS: 'Acesso',
		PROFILE_DELETE_MESSAGE: 'Deseja apagar o registro do perfil?',
		TIPO_PERFIL_MASTER: 'Master',
		TIPO_PERFIL_CLIENTE: 'Cliente',
		NIVEL_PERFIL_MASTER: 'Master',
		NIVEL_PERFIL_CLIENTE: 'Cliente',
		NIVEL_PERFIL_REGIAO: 'Regi�o',
		NIVEL_PERFIL_FILIAL: 'Filial',
		NIVEL_PERFIL_FORNECEDOR: 'Fornecedor',
		NIVEL_PERFIL_ESTABELECIMENTO: 'Estabelecimento'
	});
	$translateProvider.translations('en', {
		LANG_IMAGE: 'img/en.png',
		LANG_NAME: 'English',
		MENU_TITLE: 'Administrative Panel',
		MENU_MANAGEMENT: 'Management',
		MENU_MANAGEMENT_USERS: 'Users',
		MENU_MANAGEMENT_PROVIDER: 'Providers',
		MENU_MANAGEMENT_REGION: 'Regions',
		MENU_MANAGEMENT_TERMINAL: 'Terminals',
		MENU_MANAGEMENT_STORE: 'Stores',
		MENU_MANAGEMENT_CLIENT: 'Clients',
		MENU_MONITORING: 'Monitoring',
		MENU_MONITORING_OVERVIEW: 'Overview',
		MENU_MONITORING_TERMINALS: 'Terminals Monitoring',
		MENU_QUERY: 'Queries',
		MENU_QUERY_USERS: 'Users',
		MENU_QUERY_TERMINALS: 'Terminals',
		MENU_REPORT: 'Reports',
		MENU_SYSTEM: 'System',
		NEW: 'New'
	});
	$translateProvider.translations('es', {
		LANG_IMAGE: 'img/es.png',
		LANG_NAME: 'Espa�ol'
	});
	$translateProvider.useSanitizeValueStrategy('escape');
	$translateProvider.preferredLanguage('pt_BR');
});

app.controller('translationCtrl', ['$scope', '$translate', function ($scope, $translate) {
	$scope.changeLanguage = function (key) {
		$translate.use(key);
	}
}]);

app.controller('loadDate', ['$scope', '$element', function ($scope, $element) {
	$scope.myDate = new Date();
	$scope.Today = new Date();
	var setDate = function() {
		console.log('setDate');
		var dateInput = angular.element($element[0].querySelector('dataCadastro'));
		if (dateInput != null) {
			console.log(JSON.stringify(dateInput));
		}
	}
	/*
	var myDatePicker = angular.element($element[0].querySelector('#dataCadastro'));
	if (myDatePicker != null && myDatePicker[0] != null && myDatePicker[0].children[1] != null) {
		var myDatePickerInputContainer = angular.element(myDatePicker[0].children[1]);
		if (myDatePickerInputContainer != null && myDatePickerInputContainer[0] != null && myDatePickerInputContainer[0].children[0] != null) {
			var myDatePickerInput = angular.element(myDatePickerInputContainer[0].children[0]);
			if (myDatePickerInput != null) {
				myDatePickerInput.attr("name", "dataCadastro2");
			}
		}
	}
	*/
}]);

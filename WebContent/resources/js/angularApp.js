'use strict';

var app = angular.module('app', ['pascalprecht.translate',
                                 'ngMaterial',
                                 'datatables']);

app.config(['$locationProvider', function($locationProvider) {
    $locationProvider.html5Mode({
    	  enabled: true,
    	  requireBase: false
    	});
}]);

app.config(function ($translateProvider) {
	$translateProvider.fallbackLanguage('pt-BR');
	$translateProvider.registerAvailableLanguageKeys(['pt-BR', 'en'], {
		'pt_*':'pt_BR',
		'en_*':'en'
	});
	//TODO - Usar o angular-translate-loader-url para carregar arquivos de bundle para os idiomas
	$translateProvider.translations('pt-BR', {
		LANG_IMAGE: 'img/pt-br.png',
		LANG_NAME: 'Português', 
		NEW: 'Novo',
		ADD: 'Adicionar',
		EDIT: 'Alterar',
		SAVE: 'Salvar',
		DELETE: 'Excluir',
		UPDATE: 'Atualizar',
		DETAILS: 'Detalhes',
		CONFIRM: 'Confirmar',
		SELECT: 'Selecione',
		MENU_TITLE: 'Painel Administrativo',
		MENU_MANAGEMENT: 'Gerenciamento',
		MENU_MANAGEMENT_PROFILES: 'Cadastro de Perfis',
		MENU_MANAGEMENT_USERS: 'Cadastro de usuário',
		MENU_MANAGEMENT_PROVIDER: 'Cadastro de Fornecedor',
		MENU_MANAGEMENT_REGION: 'Cadastro de Região',
		MENU_MANAGEMENT_TERMINAL: 'Cadastro de Terminal',
		MENU_MANAGEMENT_STORE: 'Cadastro de Estabelecimento',
		MENU_MANAGEMENT_CLIENT: 'Cadastro de Cliente',
		MENU_MONITORING: 'Monitoração',
		MENU_MONITORING_OVERVIEW: 'Visão Geral',
		MENU_MONITORING_TERMINALS: 'Monitoração de Terminais',
		MENU_QUERY: 'Consultas',
		MENU_QUERY_USERS: 'Usuários',
		MENU_QUERY_TERMINALS: 'Terminais',
		MENU_REPORT: 'Relatórios',
		MENU_REPORT_DEPOSIT: 'Relatórios',
		MENU_REPORT_CLOSING: 'Relatórios',
		MENU_REPORT_TOTALCASH: 'Relatórios',
		MENU_REPORT_SAFEBOXUSERS: 'Relatórios',
		MENU_REPORT_SAFEBOXTRANSACTIONS: 'Relatórios',
		MENU_SYSTEM: 'Sistema',
		MENU_SYSTEM_PERMISSION: 'Permissão Funcionalidades',
		MENU_SYSTEM_PREFERENCES: 'Preferências',
		CLIENT: 'Cliente',
		CLIENTS: 'Clientes',
		CLIENT_ID: 'ID',
		CLIENT_FANTASY_NAME: 'Nome Fantasia',
		CLIENT_COMPANY_NAME: 'Razão Social',
		CLIENT_DOCUMENT: 'CNPJ',
		CLIENT_CITY: 'Cidade',
		CLIENT_STATE: 'Estado',
		CLIENT_ACTIVE: 'Ativo',
		CLIENT_DATE_INCLUSION: 'Data de Cadastro',
		CLIENT_CONNECTION: 'Conexão',
		CLIENT_DELETE_MESSAGE: 'Deseja apagar o registro do cliente?',
		AVAILABLE_CLIENTS: 'Clientes disponíveis',
		PROFILE: 'Perfil',
		PROFILES: 'Perfis',
		PROFILE_ID: 'ID',
		PROFILE_DESCRIPTION: 'Descrição',
		PROFILE_TYPE: 'Tipo',
		PROFILE_LEVEL: 'Nível',
		PROFILE_ACCESS: 'Acesso',
		PROFILE_DELETE_MESSAGE: 'Deseja apagar o registro do perfil?',
		TIPO_PERFIL_MASTER: 'Master',
		TIPO_PERFIL_CLIENTE: 'Cliente',
		NIVEL_PERFIL_MASTER: 'Master',
		NIVEL_PERFIL_CLIENTE: 'Cliente',
		NIVEL_PERFIL_REGIAO: 'Região',
		NIVEL_PERFIL_FILIAL: 'Filial',
		NIVEL_PERFIL_FORNECEDOR: 'Fornecedor',
		NIVEL_PERFIL_ESTABELECIMENTO: 'Estabelecimento',
		USERS: 'Usuários',
		USER: 'Usuário',
		USER_ID: 'ID',
		USER_LOGIN: 'Identificação',
		USER_EMAIL: 'eMail',
		USER_PASSWORD: 'Senha',
		USER_NAME: 'Nome',
		USER_DT_CREATE: 'Criação',
		USER_DT_UPDATE: 'Alteração',
		USER_ACTIVE: 'Ativo',
		USER_PROFILE: 'Perfil',
		USER_TOKEN: 'Controle para Troca de Senha',
		USER_DT_TOKEN: 'Geração do Controle',
		TERMINAL: 'Terminal',
		TERMINALS: 'Terminais',
		TERMINAL_ID: 'Identificação',
		NR_TERMINAL: 'Número',
		DS_TERMINAL: 'Descrição',
		AVAILABLE_TERMINALS: 'Terminais Disponíveis',
		AUTHORIZED_TERMINALS: 'Terminais Autorizados',
		ADDRESS_TYPE: 'Tipo de Endereço',
		ADDRESS_TYPE_ID: 'ID',
		ADDRESS_TYPE_DESCRIPTION: 'Descrição',
		CONTACT_TYPE: 'Tipo de Contato',
		CONTACT_TYPE_ID: 'ID',
		CONTACT_TYPE_DESCRIPTION: 'Descrição',
		CONTACT_TYPE_DELETE_MESSAGE: 'Deseja apagar o tipo do contato?',
		CLIENT_ADRESSES: 'Endereços',
		CLIENT_ADDRESS_SEQUENCE: 'Seq',
		CLIENT_ADDRESS_TYPE: 'Tipo',
		CLIENT_ADDRESS_PLACE: 'Logradouro',
		CLIENT_ADDRESS_CITY: 'Cidade',
		CLIENT_ADDRESS_STATE: 'Estado',
		CLIENT_ADDRESS_POSTAL_CODE: 'CEP',
		CLIENT_ADDRESS_COMPLEMENT: 'Complemento',
		CLIENT_ADDRESS_DISTRICT: 'Bairro',
		CLIENT_CONTACTS: 'Contatos',
		CLIENT_CONTACT_SEQUENCE: 'Seq',
		CLIENT_CONTACT_TYPE: 'Tipo',
		CLIENT_CONTACT_DESCRIPTION: 'Descrição',
		CLIENT_CONTACT_NOTE: 'Observação'
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
		LANG_NAME: 'Español'
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

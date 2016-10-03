'use strict';
var app = angular.module('app', ['pascalprecht.translate']);

app.config(function ($translateProvider) {
	$translateProvider.fallbackLanguage('pt-BR');
	$translateProvider.registerAvailableLanguageKeys(['pt-BR', 'en'], {
		'pt_*':'pt_BR',
		'en_*':'en'
	});
	//TODO - Usar o angular-translate-loader-url para carregar arquivos de bundle para os idiomas
	$translateProvider.translations('pt-BR', {
		LANG_IMAGE: '/img/pt-br.png',
		LANG_NAME: 'Português', 
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
		PROFILE: 'Perfil',
		PROFILES: 'Perfis',
		PROFILE_ID: 'ID',
		PROFILE_DESCRIPTION: 'Descrição',
		PROFILE_TYPE: 'Tipo',
		PROFILE_LEVEL: 'Nível',
		PROFILE_ACCESS: 'Acesso',
		PROFILE_DELETE_MESSAGE: 'Deseja apagar o registro do perfil?'		
	});
	$translateProvider.translations('en', {
		LANG_IMAGE: '/img/en.png',
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
		LANG_IMAGE: '/img/es.png',
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

'use strict';

var lang_pt = {
	LANG_IMAGE: 'img/pt-br.png',
	LANG_NAME: 'Portugu�s', 
	NEW: 'Novo',
	ADD: 'Adicionar',
	EDIT: 'Alterar',
	SAVE: 'Salvar',
	DELETE: 'Excluir',
	UPDATE: 'Atualizar',
	DETAILS: 'Detalhes',
	CONFIRM: 'Confirmar',
	SELECT: 'Selecione',
	ACCESS_DENIED: 'Acesso Negado',
    ACCESS_DENIED_MSG1: 'Caro',
    ACCESS_DENIED_MSG2: 'Voc� n�o possui acesso a esta funcionalidade.',
    ACCESS_DENIED_LOGOUT: 'Efetuar logout',
	MENU_TITLE: 'Painel Administrativo',
	MENU_MANAGEMENT: 'Gerenciamento',
	MENU_MANAGEMENT_PROFILES: 'Cadastro de Perfis',
	MENU_MANAGEMENT_USERS: 'Cadastro de usu�rio',
	MENU_MANAGEMENT_PROVIDER: 'Cadastro de Fornecedor',
	MENU_MANAGEMENT_REGION: 'Cadastro de Regi�o',
	MENU_MANAGEMENT_TERMINAL: 'Cadastro de Terminal',
	MENU_MANAGEMENT_STORE: 'Cadastro de Estabelecimento',
	MENU_MANAGEMENT_CLIENT: 'Cadastro de Cliente',
	MENU_MANAGEMENT_SYSTEM: 'Cadastro de Sistemas',
	MENU_MANAGEMENT_FEATURE: 'Cadastro de Funcionalidades',
	MENU_MANAGEMENT_CONTACT_TYPE: 'Tipos de contato',
	MENU_MANAGEMENT_ADDRESS_TYPE: 'Tipos de endere�o',
	MENU_MANAGEMENT_CLIENT_ADDRESS: 'Endere�os de Cliente',
	MENU_MANAGEMENT_CLIENT_CONTACT: 'Contatos de Cliente',
	MENU_MONITORING: 'Monitora��o',
	MENU_MONITORING_OVERVIEW: 'Vis�o Geral',
	MENU_MONITORING_TERMINALS: 'Monitora��o de Terminais',
	MENU_QUERY: 'Consultas',
	MENU_QUERY_USERS: 'Usu�rios',
	MENU_QUERY_TERMINALS: 'Terminais',
	MENU_REPORT: 'Relat�rios',
	MENU_REPORT_DEPOSIT: 'Dep�sitos',
	MENU_REPORT_CLOSING: 'Fechamentos',
	MENU_REPORT_TOTALCASH: 'Saldo',
	MENU_REPORT_SAFEBOXUSERS: 'Usu�rios Cofre',
	MENU_REPORT_SAFEBOXTRANSACTIONS: 'Movimento Cofre',
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
	AVAILABLE_CLIENTS: 'Clientes dispon�veis',
	PROFILE: 'Perfil',
	PROFILES: 'Perfis',
	PROFILE_ID: 'ID',
	PROFILE_DESCRIPTION: 'Descri��o',
	PROFILE_TYPE: 'Tipo',
	PROFILE_LEVEL: 'N�vel',
	PROFILE_ACCESS: 'Acesso',
	PROFILE_DELETE_MESSAGE: 'Deseja apagar o registro do perfil?',
	PROFILE_RULES: 'Regras',
	TIPO_PERFIL_MASTER: 'Master',
	TIPO_PERFIL_CLIENTE: 'Cliente',
	NIVEL_PERFIL_MASTER: 'Master',
	NIVEL_PERFIL_CLIENTE: 'Cliente',
	NIVEL_PERFIL_REGIAO: 'Regi�o',
	NIVEL_PERFIL_FILIAL: 'Filial',
	NIVEL_PERFIL_FORNECEDOR: 'Fornecedor',
	NIVEL_PERFIL_ESTABELECIMENTO: 'Estabelecimento',
	USERS: 'Usu�rios',
	USER: 'Usu�rio',
	USER_ID: 'ID',
	USER_LOGIN: 'Identifica��o',
	USER_EMAIL: 'eMail',
	USER_PASSWORD: 'Senha',
	USER_NAME: 'Nome',
	USER_DT_CREATE: 'Cria��o',
	USER_DT_UPDATE: 'Altera��o',
	USER_ACTIVE: 'Ativo',
	USER_PROFILE: 'Perfil',
	USER_TOKEN: 'Controle para Troca de Senha',
	USER_DT_TOKEN: 'Gera��o do Controle',
	TERMINAL: 'Terminal',
	TERMINALS: 'Terminais',
	TERMINAL_ID: 'Identifica��o',
	NR_TERMINAL: 'N�mero',
	DS_TERMINAL: 'Descri��o',
	AVAILABLE_TERMINALS: 'Terminais Dispon�veis',
	AUTHORIZED_TERMINALS: 'Terminais Autorizados',
	ADDRESS_TYPE: 'Tipo de Endere�o',
	ADDRESS_TYPE_ID: 'ID',
	ADDRESS_TYPE_DESCRIPTION: 'Descri��o',
	ADDRESS_TYPE_DELETE_MESSAGE: 'Deseja apagar o tipo do endere�o?',
	CONTACT_TYPE: 'Tipo de Contato',
	CONTACT_TYPE_ID: 'ID',
	CONTACT_TYPE_DESCRIPTION: 'Descri��o',
	CONTACT_TYPE_DELETE_MESSAGE: 'Deseja apagar o tipo do contato?',
	CLIENT_ADRESSES: 'Endere�os',
	CLIENT_ADDRESS_SEQUENCE: 'Seq',
	CLIENT_ADDRESS_TYPE: 'Tipo',
	CLIENT_ADDRESS_PLACE: 'Logradouro',
	CLIENT_ADDRESS_CITY: 'Cidade',
	CLIENT_ADDRESS_STATE: 'Estado',
	CLIENT_ADDRESS_POSTAL_CODE: 'CEP',
	CLIENT_ADDRESS_COMPLEMENT: 'Complemento',
	CLIENT_ADDRESS_DISTRICT: 'Bairro',
	CLIENT_CONTACT: 'Contato',
	CLIENT_CONTACTS: 'Contatos',
	CLIENT_CONTACT_SEQUENCE: 'Seq',
	CLIENT_CONTACT_TYPE: 'Tipo',
	CLIENT_CONTACT_DESCRIPTION: 'Descri��o',
	CLIENT_CONTACT_NOTE: 'Observa��o',
	SYSTEM: 'Sistema',
	SYSTEMS: 'Sistemas',
	SYSTEM_DESCRIPTION: 'Descricao',
	SYSTEM_ID: 'ID',
	SYSTEM_DELETE_MESSAGE: 'Deseja apagar o cadastro do sistema?',
	FEATURE: 'Funcionalidade',
	FEATURES: 'Funcionalidades',
	FEATURE_ID: 'ID',
	FEATURE_DESCRIPTION: 'Descricao',
	FEATURE_PROGRAM: 'Programa',
	FEATURE_PREVIOUS: 'Funcionalidade Anterior',
	FEATURE_SEQUENCE: 'Sequencia',
	FEATURE_SYSTEM: 'Sistema',
	FEATURE_ACTIVE: 'Ativa',
	FEATURE_PATH: 'Caminho',
	FEATURE_ICON: '�cone',
	FEATURE_DELETE_MESSAGE: 'Deseja apagar o cadastro do sistema?'
};

var lang_en = {
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
};

var lang_es = {
	LANG_IMAGE: 'img/es.png',
	LANG_NAME: 'Espa�ol'
};


var app = angular.module('app', ['pascalprecht.translate',
                                 'ngCookies',
                                 'ngMaterial',
                                 'datatables',
                                 'chart.js']);

app.config(['$locationProvider', function($locationProvider) {
    $locationProvider.html5Mode({
      	  enabled: true,
      	  requireBase: false
      	}).hashPrefix('*');
}]);
    
app.config(function($httpProvider) {
    $httpProvider.defaults.withCredentials = true;
});

app.config(function ($translateProvider) {
	$translateProvider.translations('pt', lang_pt)
					  .translations('en', lang_en)
					  .translations('es', lang_es);
	
	$translateProvider.fallbackLanguage('pt');
	$translateProvider.registerAvailableLanguageKeys(['pt', 'en', 'es'], {
		'pt_*':'pt',
		'en_*':'en',
		'es_*':'es'
	});

	$translateProvider.useSanitizeValueStrategy('escape');
	$translateProvider.preferredLanguage('pt');
	$translateProvider.useCookieStorage();
	//$translateProvider.useLocalStorage();

	//TODO - Usar o angular-translate-loader-url para carregar arquivos de bundle para os idiomas
//	$translateProvider.useStaticFilesLoader({
//	    prefix: '/eSafe/i18n/',
//	    suffix: '.json'
//	});
	
//	$translateProvider.useLoader('$translatePartialLoader', {  
//		  urlTemplate: '/i18n/{lang}.json'
//		});
	
});

app.controller('translationCtrl', ['$scope', '$translate', function ($scope, $translate) {
	$scope.changeLanguage = function (key) {
		$translate.use(key);
	}
}]);

/*
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
}]);
*/
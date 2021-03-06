﻿-- Table: "TB_CLIENTE"

--DROP TABLE "TB_CLIENTE";

CREATE TABLE "TB_CLIENTE"
(
  "idCliente" serial NOT NULL,
  "dsNomeFantasia" character varying(100) NOT NULL,
  "dsRazaoSocial" character varying(100) NOT NULL,
  "dsCnpj" character varying(20) NOT NULL,
  "dtCadastro" timestamp with time zone DEFAULT now() NOT NULL,
  "icAtivo" boolean NOT NULL,
  "dsConexao" character varying(256),
  CONSTRAINT "PK_CLIENTE" PRIMARY KEY ("idCliente"),
  CONSTRAINT "UX_CLIENTE_DSCNPJ" UNIQUE ("dsCnpj"),
  CONSTRAINT "UX_CLIENTE_RAZAOSOCIAL" UNIQUE ("dsRazaoSocial")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_CLIENTE"
  OWNER TO postgres;


-- Table: "TB_TIPO_ENDERECO"

--DROP TABLE "TB_TIPO_ENDERECO";

CREATE TABLE "TB_TIPO_ENDERECO"
(
  "tpEndereco" integer NOT NULL,
  "dsTipoEndereco" character varying(256) NOT NULL,
  CONSTRAINT "PK_TIPO_ENDERECO" PRIMARY KEY ("tpEndereco")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_TIPO_ENDERECO"
  OWNER TO postgres;


-- Table: "TB_CLIENTE_ENDERECO"

--DROP TABLE "TB_CLIENTE_ENDERECO";

CREATE TABLE "TB_CLIENTE_ENDERECO"
(
  "idCliente" serial NOT NULL,
  "idSequencia" integer NOT NULL,
  "tpEndereco" integer NOT NULL,
  "dsEndereco" character varying(256) NOT NULL,
  "dsCidade" character varying(100) NOT NULL,
  "dsEstado" character(2) NOT NULL,
  "nrCep" character(8) NOT NULL,
  CONSTRAINT "PK_CLIENTE_ENDERECO" PRIMARY KEY ("idCliente", "idSequencia"),
  CONSTRAINT "FK_CLIENTE_ENDERECO_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_CLIENTE_ENDERECO_TIPO_ENDERECO" FOREIGN KEY ("tpEndereco") REFERENCES "TB_TIPO_ENDERECO" ("tpEndereco") ON UPDATE NO ACTION ON DELETE NO ACTION  
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_CLIENTE_ENDERECO"
  OWNER TO postgres;


-- Table: "TB_TIPO_CONTATO"

--DROP TABLE "TB_TIPO_CONTATO";

CREATE TABLE "TB_TIPO_CONTATO"
(
  "tpContato" integer NOT NULL,
  "dsTipoContato" character varying(256) NOT NULL,
  CONSTRAINT "PK_TIPO_CONTATO" PRIMARY KEY ("tpContato")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_TIPO_CONTATO"
  OWNER TO postgres;

  
-- Table: "TB_CLIENTE_CONTATO"

--DROP TABLE "TB_CLIENTE_CONTATO";

CREATE TABLE "TB_CLIENTE_CONTATO"
(
  "idCliente" serial NOT NULL,
  "idSequencia" integer NOT NULL,
  "tpContato" integer NOT NULL,
  "dsContato" character varying(256) NOT NULL,
  CONSTRAINT "PK_CLIENTE_CONTATO" PRIMARY KEY ("idCliente", "idSequencia"),
  CONSTRAINT "FK_CLIENTE_CONTATO_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_CLIENTE_CONTATO_TIPO_CONTATO" FOREIGN KEY ("tpContato") REFERENCES "TB_TIPO_CONTATO" ("tpContato") ON UPDATE NO ACTION ON DELETE NO ACTION  
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_CLIENTE_CONTATO"
  OWNER TO postgres;



CREATE TABLE "TB_FUNCIONALIDADE"
(
	"idFuncionalidade" serial NOT NULL,
	"dsFuncionalidade" character varying(100) NOT NULL,
	"dsPrograma" character varying(100) NOT NULL,
	"idFuncionalidadeAnterior" integer NULL,
	"idSequencia" integer NULL,
	"tpSistema" integer NOT NULL,
	"icAtivo" boolean NOT NULL,
	"dsPath" character varying(100) NULL,
	"dsIcone" character varying(100) NOT NULL DEFAULT ('fa-cog'),
	CONSTRAINT "PK_TB_FUNCIONALIDADE" PRIMARY KEY ("idFuncionalidade") 
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_FUNCIONALIDADE"
  OWNER TO postgres;


CREATE TABLE "TB_FUNCIONALIDADE_CLIENTE"
(
	"idFuncionalidade" integer NOT NULL,
	"idCliente" integer NOT NULL,
	CONSTRAINT "PK_TB_FUNCIONALIDADE_CLIENTE" PRIMARY KEY ("idFuncionalidade", "idCliente"),
	CONSTRAINT "FK_FUNCIONALIDADE_CLIENTE_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION,
	CONSTRAINT "FK_FUNCIONALIDADE_CLIENTE_FUNCIONALIDADE" FOREIGN KEY ("idFuncionalidade") REFERENCES "TB_FUNCIONALIDADE" ("idFuncionalidade") ON UPDATE NO ACTION ON DELETE NO ACTION	
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_FUNCIONALIDADE_CLIENTE"
  OWNER TO postgres;


CREATE TABLE "TB_PERFIL"(
	"idPerfil" serial NOT NULL,
	"dsPerfil" character varying(100) NOT NULL,
	"tpPerfil" integer NOT NULL,
	"icNivel" integer NOT NULL,
	"tpAcesso" integer NOT NULL,
 CONSTRAINT "PK_TB_PERFIL" PRIMARY KEY ("idPerfil"),
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_PERFIL"
  OWNER TO postgres;


CREATE TABLE "TB_FUNCIONALIDADE_CLIENTE_PERFIL"(
	"idFuncionalidade" integer NOT NULL,
	"idCliente" integer NOT NULL,
	"idPerfil" integer NOT NULL,
 CONSTRAINT "PK_TB_FUNCIONALIDADE_CLIENTE_PERFIL" PRIMARY KEY ("idFuncionalidade", "idCliente", "idPerfil"),
 CONSTRAINT "FK_FUNCIONALIDADE_CLIENTE_PERFIL_FUNCIONALIDADE_CLIENTE" FOREIGN KEY ("idFuncionalidade", "idCliente") REFERENCES "TB_FUNCIONALIDADE_CLIENTE" ("idFuncionalidade", "idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION,
 CONSTRAINT "FK_FUNCIONALIDADE_CLIENTE_PERFIL_PERFIL" FOREIGN KEY ("idPerfil") REFERENCES "TB_PERFIL" ("idPerfil") ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_FUNCIONALIDADE_CLIENTE_PERFIL"
  OWNER TO postgres;



CREATE TABLE "TB_SISTEMA"(
	"idSistema" serial NOT NULL,
	"dsSistema" character varying(50) NOT NULL,
 CONSTRAINT "PK_TB_SISTEMA" PRIMARY KEY ("idSistema")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_SISTEMA"
  OWNER TO postgres;



CREATE TABLE "TB_SISTEMA_CLIENTE"(
	"idSistema" integer NOT NULL,
	"idCliente" integer NOT NULL,
 CONSTRAINT "PK_TB_SISTEMA_CLIENTE" PRIMARY KEY ("idSistema", "idCliente") ,
 CONSTRAINT "FK_SISTEMA_CLIENTE_SISTEMA" FOREIGN KEY ("idSistema") REFERENCES "TB_SISTEMA" ("idSistema") ON UPDATE NO ACTION ON DELETE NO ACTION,
 CONSTRAINT "FK_SISTEMA_CLIENTE_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_SISTEMA_CLIENTE"
  OWNER TO postgres;



CREATE TABLE "TB_TERMINAL"(
	"idTerminal" serial NOT NULL,
	"idCliente" integer NOT NULL,
	"nrTerminal" character varying(20) NOT NULL,
 CONSTRAINT "PK_TB_TERMINAL" PRIMARY KEY ("idTerminal"),
 CONSTRAINT "FK_TERMINAL_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "UX_TERMINAL_NRTERMINAL" UNIQUE ("nrTerminal")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_TERMINAL"
  OWNER TO postgres;



CREATE TABLE "TB_USUARIO"(
	"idUsuario" serial NOT NULL,
	"dsLogin" character varying(20) NOT NULL,
	"dsEMail" character varying(128) NOT NULL,
	"dsSenha" character varying(128) NULL,
	"dsNomeUsuario" character varying(100) NOT NULL,
	"dtCriacao" timestamp with time zone DEFAULT now() NOT NULL,
	"dtAlteracao" timestamp with time zone NULL,
	"icAtivo" "bit" NOT NULL,
	"dsToken" character varying(128) NULL,
	"dtGeraToken" timestamp with time zone NULL,
	"idPerfil" integer NOT NULL,
 CONSTRAINT "PK_TB_USUARIO" PRIMARY KEY ("idUsuario"),
  CONSTRAINT "UX_USUARIO_LOGIN" UNIQUE ("dsLogin")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_USUARIO"
  OWNER TO postgres;



CREATE TABLE "TB_USUARIO_CLIENTE"(
	"idUsuario" integer NOT NULL,
	"idCliente" integer NOT NULL,
 CONSTRAINT "PK_TB_USUARIO_CLIENTE" PRIMARY KEY ("idUsuario", "idCliente"),
 CONSTRAINT "FK_USUARIO_CLIENTE_USUARIO" FOREIGN KEY ("idUsuario") REFERENCES "TB_USUARIO" ("idUsuario") ON UPDATE NO ACTION ON DELETE NO ACTION,
 CONSTRAINT "FK_USUARIO_CLIENTE_CLIENTE" FOREIGN KEY ("idCliente") REFERENCES "TB_CLIENTE" ("idCliente") ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_USUARIO_CLIENTE"
  OWNER TO postgres;



 
CREATE TABLE "TB_USUARIO_TERMINAL"(
	"idTerminal" integer NOT NULL,
	"idUsuario" integer NOT NULL,
 CONSTRAINT "PK_TB_USUARIO_TERMINAL" PRIMARY KEY ("idTerminal", "idUsuario"),
 CONSTRAINT "FK_USUARIO_TERMINAL_USUARIO" FOREIGN KEY ("idUsuario") REFERENCES "TB_USUARIO" ("idUsuario") ON UPDATE NO ACTION ON DELETE NO ACTION,
 CONSTRAINT "FK_USUARIO_TERMINAL_TERMINAL" FOREIGN KEY ("idTerminal") REFERENCES "TB_TERMINAL" ("idTerminal") ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "TB_USUARIO_TERMINAL"
  OWNER TO postgres;



 












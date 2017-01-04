CREATE TYPE tipo_transacao AS ENUM('administrativa', 'financeira', 'contabil', 'operacional', 'informativa');
CREATE TYPE tipo_operacao_financeira AS ENUM('entrada', 'saida');

-- Table: tb_regiao

-- DROP TABLE tb_regiao;

CREATE TABLE tb_regiao
(
  id_regiao serial NOT NULL,
  ds_regiao character varying(100) NOT NULL,
  ic_ativo boolean NOT NULL,
  CONSTRAINT "PK_TB_REGIAO" PRIMARY KEY (id_regiao)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_regiao
  OWNER TO postgres;

  
  -- Table: tb_filial

-- DROP TABLE tb_filial;

CREATE TABLE tb_filial
(
  id_filial serial NOT NULL,
  id_regiao integer NOT NULL,
  ds_filial character varying(100) NOT NULL,
  ic_ativo boolean NOT NULL,
  CONSTRAINT "PK_TB_FILIAL" PRIMARY KEY (id_filial),
  CONSTRAINT "FK_REGIAO_FILIAL" FOREIGN KEY (id_regiao)
      REFERENCES tb_regiao (id_regiao) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_filial
  OWNER TO postgres;

-- Index: "FKI_REGIAO_FILIAL"

-- DROP INDEX "FKI_REGIAO_FILIAL";

CREATE INDEX "FKI_REGIAO_FILIAL"
  ON tb_filial
  USING btree
  (id_regiao);


  
-- Table: tb_fornecedor

-- DROP TABLE tb_fornecedor;

CREATE TABLE tb_fornecedor
(
  id_fornecedor serial NOT NULL,
  ds_fornecedor character varying(100) NOT NULL,
  ds_cnpj character varying(15),
  ic_ativo boolean NOT NULL,
  CONSTRAINT "PK_TB_FORNECEDOR" PRIMARY KEY (id_fornecedor)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_fornecedor
  OWNER TO postgres;

  
-- Table: tb_estabelecimento

-- DROP TABLE tb_estabelecimento;

CREATE TABLE tb_estabelecimento
(
  id_estabelecimento serial NOT NULL,
  id_filial integer,
  id_fornecedor integer,
  ds_estabelecimento character varying(100),
  ic_ativo boolean NOT NULL,
  CONSTRAINT "PK_TB_ESTABELECIMENTO" PRIMARY KEY (id_estabelecimento),
  CONSTRAINT "FK_FILIAL_ESTABELECIMENTO" FOREIGN KEY (id_filial)
      REFERENCES tb_filial (id_filial) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_FORNECEDOR_ESTABELECIMENTO" FOREIGN KEY (id_fornecedor)
      REFERENCES tb_fornecedor (id_fornecedor) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_estabelecimento
  OWNER TO postgres;

-- Index: "FKI_FABRICANTE_MODELO"

-- DROP INDEX "FKI_FABRICANTE_MODELO";

CREATE INDEX "FKI_FABRICANTE_MODELO"
  ON tb_estabelecimento
  USING btree
  (id_fornecedor);

-- Index: "FKI_FILIAL_ESTABELECIMENTO"

-- DROP INDEX "FKI_FILIAL_ESTABELECIMENTO";

CREATE INDEX "FKI_FILIAL_ESTABELECIMENTO"
  ON tb_estabelecimento
  USING btree
  (id_filial);

-- Index: "FKI_FORNECEDOR_ESTABELECIMENTO"

-- DROP INDEX "FKI_FORNECEDOR_ESTABELECIMENTO";

CREATE INDEX "FKI_FORNECEDOR_ESTABELECIMENTO"
  ON tb_estabelecimento
  USING btree
  (id_fornecedor);



-- Table: tb_fabricante

-- DROP TABLE tb_fabricante;

CREATE TABLE tb_fabricante
(
  id_fabricante serial NOT NULL,
  ds_fabricante character varying(100) NOT NULL,
  ds_cnpj character varying(15),
  ic_ativo bit(1) NOT NULL,
  CONSTRAINT "PK_TB_FABRICANTE" PRIMARY KEY (id_fabricante)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_fabricante
  OWNER TO postgres;

  
-- Table: tb_modelo

-- DROP TABLE tb_modelo;

CREATE TABLE tb_modelo
(
  id_modelo serial NOT NULL,
  id_fabricante integer,
  ds_modelo character varying(100) NOT NULL,
  ic_ativo bit(1) NOT NULL,
  CONSTRAINT "PK_TB_MODELO" PRIMARY KEY (id_modelo),
  CONSTRAINT "FK_FABRICANTE_MODELO" FOREIGN KEY (id_fabricante)
      REFERENCES tb_fabricante (id_fabricante) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_modelo
  OWNER TO postgres;

  
-- Table: tb_terminal

-- DROP TABLE tb_terminal;

CREATE TABLE tb_terminal
(
  id_terminal serial NOT NULL,
  id_estabelecimento integer,
  id_modelo integer,
  nr_terminal character varying(30),
  ds_terminal character varying(100),
  ic_ativo boolean,
  CONSTRAINT "PK_TB_TERMINAL" PRIMARY KEY (id_terminal),
  CONSTRAINT "FK_ESTABELECIMENTO_TERMINAL" FOREIGN KEY (id_estabelecimento)
      REFERENCES tb_estabelecimento (id_estabelecimento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_MODELO_TERMINAL" FOREIGN KEY (id_modelo)
      REFERENCES tb_modelo (id_modelo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_terminal
  OWNER TO postgres;

-- Index: "FKI_ESTABELECIMENTO_TERMINAL"

-- DROP INDEX "FKI_ESTABELECIMENTO_TERMINAL";

CREATE INDEX "FKI_ESTABELECIMENTO_TERMINAL"
  ON tb_terminal
  USING btree
  (id_estabelecimento);

-- Index: "FKI_MODELO_TERMINAL"

-- DROP INDEX "FKI_MODELO_TERMINAL";

CREATE INDEX "FKI_MODELO_TERMINAL"
  ON tb_terminal
  USING btree
  (id_modelo);


  
-- Table: tb_tipo_contato

-- DROP TABLE tb_tipo_contato;

CREATE TABLE tb_tipo_contato
(
  id_tipo_contato serial NOT NULL,
  ds_tipo_contato character varying(100) NOT NULL,
  ic_ativo bit(1) NOT NULL,
  CONSTRAINT "PK_TB_TIPO_CONTATO" PRIMARY KEY (id_tipo_contato)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_tipo_contato
  OWNER TO postgres;

  
-- Table: tb_contato_estabelecimento

-- DROP TABLE tb_contato_estabelecimento;

CREATE TABLE tb_contato_estabelecimento
(
  id_contato serial NOT NULL,
  id_tipo_contato integer NOT NULL,
  ds_contato character varying(100) NOT NULL,
  ds_observacao character varying(100),
  id_estabelecimento integer NOT NULL,
  CONSTRAINT "PK_TB_CONTATO_ESTABELECIMENTO" PRIMARY KEY (id_contato),
  CONSTRAINT "FK_CONTATO_ESTABELECIMENTO_ESTABELECIMENTO" FOREIGN KEY (id_estabelecimento)
      REFERENCES tb_estabelecimento (id_estabelecimento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TIPO_CONTATO_CONTATO_ESTABELECIMENTO" FOREIGN KEY (id_tipo_contato)
      REFERENCES tb_tipo_contato (id_tipo_contato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_contato_estabelecimento
  OWNER TO postgres;

-- Index: "FKI_TIPO_CONTATO_CONTATO_ESTABELECIMENTO"

-- DROP INDEX "FKI_TIPO_CONTATO_CONTATO_ESTABELECIMENTO";

CREATE INDEX "FKI_TIPO_CONTATO_CONTATO_ESTABELECIMENTO"
  ON tb_contato_estabelecimento
  USING btree
  (id_tipo_contato);


  
-- Table: tb_contato_fabricante

-- DROP TABLE tb_contato_fabricante;

CREATE TABLE tb_contato_fabricante
(
  id_contato serial NOT NULL,
  id_tipo_contato integer NOT NULL,
  ds_contato character varying(100) NOT NULL,
  ds_observacao character varying(100),
  id_fabricante integer NOT NULL,
  CONSTRAINT "PK_TB_CONTATO_FABRICANTE" PRIMARY KEY (id_contato),
  CONSTRAINT "FK_CONTATO_FABRICANTE_FABRICANTE" FOREIGN KEY (id_fabricante)
      REFERENCES tb_fabricante (id_fabricante) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TIPO_CONTATO_CONTATO_FABRICANTE" FOREIGN KEY (id_tipo_contato)
      REFERENCES tb_tipo_contato (id_tipo_contato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_contato_fabricante
  OWNER TO postgres;

-- Index: "FKI_TIPO_CONTATO_CONTATO_FABRICANTE"

-- DROP INDEX "FKI_TIPO_CONTATO_CONTATO_FABRICANTE";

CREATE INDEX "FKI_TIPO_CONTATO_CONTATO_FABRICANTE"
  ON tb_contato_fabricante
  USING btree
  (id_tipo_contato);


  
-- Table: tb_contato_filial

-- DROP TABLE tb_contato_filial;

CREATE TABLE tb_contato_filial
(
  id_contato serial NOT NULL,
  id_tipo_contato integer NOT NULL,
  ds_contato character varying(100) NOT NULL,
  ds_observacao character varying(100),
  id_filial integer NOT NULL,
  CONSTRAINT "PK_TB_CONTATO_FILIAL" PRIMARY KEY (id_contato),
  CONSTRAINT "FK_CONTATO_FILIAL_FILIAL" FOREIGN KEY (id_filial)
      REFERENCES tb_filial (id_filial) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TIPO_CONTATO_CONTATO_FILIAL" FOREIGN KEY (id_tipo_contato)
      REFERENCES tb_tipo_contato (id_tipo_contato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_contato_filial
  OWNER TO postgres;

-- Index: "FKI_TIPO_CONTATO_CONTATO_FILIAL"

-- DROP INDEX "FKI_TIPO_CONTATO_CONTATO_FILIAL";

CREATE INDEX "FKI_TIPO_CONTATO_CONTATO_FILIAL"
  ON tb_contato_filial
  USING btree
  (id_tipo_contato);


  
-- Table: tb_contato_fornecedor

-- DROP TABLE tb_contato_fornecedor;

CREATE TABLE tb_contato_fornecedor
(
  id_contato serial NOT NULL,
  id_tipo_contato integer NOT NULL,
  ds_contato character varying(100) NOT NULL,
  ds_observacao character varying(100),
  id_fornecedor integer NOT NULL,
  CONSTRAINT "PK_TB_CONTATO_FORNECEDOR" PRIMARY KEY (id_contato),
  CONSTRAINT "FK_CONTATO_FORNECDOR_FORNECEDOR" FOREIGN KEY (id_fornecedor)
      REFERENCES tb_fornecedor (id_fornecedor) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TIPO_CONTATO_CONTATO_FORNECEDOR" FOREIGN KEY (id_tipo_contato)
      REFERENCES tb_tipo_contato (id_tipo_contato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_contato_fornecedor
  OWNER TO postgres;

-- Index: "FKI_TIPO_CONTATO_CONTATO_FORNECEDOR"

-- DROP INDEX "FKI_TIPO_CONTATO_CONTATO_FORNECEDOR";

CREATE INDEX "FKI_TIPO_CONTATO_CONTATO_FORNECEDOR"
  ON tb_contato_fornecedor
  USING btree
  (id_tipo_contato);


  
-- Table: tb_acesso_usuario_estabelecimento

-- DROP TABLE tb_acesso_usuario_estabelecimento;

CREATE TABLE tb_acesso_usuario_estabelecimento
(
  id_usuario integer NOT NULL,
  id_estabelecimento integer NOT NULL,
  CONSTRAINT "PK_TB_ACESSO_USUARIO_ESTABELECIMENTO" PRIMARY KEY (id_usuario, id_estabelecimento),
  CONSTRAINT "FK_ESTABELECIMENTO_ACESSO_USUARIO_ESTABELECIMENTO" FOREIGN KEY (id_estabelecimento)
      REFERENCES tb_estabelecimento (id_estabelecimento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_acesso_usuario_estabelecimento
  OWNER TO postgres;

  
  
-- Table: tb_acesso_usuario_filial

-- DROP TABLE tb_acesso_usuario_filial;

CREATE TABLE tb_acesso_usuario_filial
(
  id_usuario integer NOT NULL,
  id_filial integer NOT NULL,
  CONSTRAINT "PK_TB_ACESSO_USUARIO_FILIAL" PRIMARY KEY (id_usuario, id_filial),
  CONSTRAINT "FK_FILIAL_ACESSO_USUARIO_FILIAL" FOREIGN KEY (id_filial)
      REFERENCES tb_filial (id_filial) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_acesso_usuario_filial
  OWNER TO postgres;

  
-- Table: tb_acesso_usuario_fornecedor

-- DROP TABLE tb_acesso_usuario_fornecedor;

CREATE TABLE tb_acesso_usuario_fornecedor
(
  id_usuario integer NOT NULL,
  id_fornecedor integer NOT NULL,
  CONSTRAINT "PK_TB_ACESSO_USUARIO_FORNECEDOR" PRIMARY KEY (id_usuario, id_fornecedor),
  CONSTRAINT "FK_FORNECEDOR_ACESSO_USUARIO_FORNECEDOR" FOREIGN KEY (id_fornecedor)
      REFERENCES tb_fornecedor (id_fornecedor) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_acesso_usuario_fornecedor
  OWNER TO postgres;

  
-- Table: tb_acesso_usuario_regiao

-- DROP TABLE tb_acesso_usuario_regiao;

CREATE TABLE tb_acesso_usuario_regiao
(
  id_usuario integer NOT NULL,
  id_regiao integer NOT NULL,
  CONSTRAINT "PK_TB_ACESSO_USUARIO_REGIAO" PRIMARY KEY (id_usuario, id_regiao),
  CONSTRAINT "FK_REGIAO_ACESSO_USUARIO_REGIAO" FOREIGN KEY (id_regiao)
      REFERENCES tb_regiao (id_regiao) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_acesso_usuario_regiao
  OWNER TO postgres;

  
-- Table: tb_acesso_usuario_terminal

-- DROP TABLE tb_acesso_usuario_terminal;

CREATE TABLE tb_acesso_usuario_terminal
(
  id_usuario integer NOT NULL,
  id_terminal integer NOT NULL,
  CONSTRAINT "PK_TB_ACESSO_USUARIO_TERMINAL" PRIMARY KEY (id_usuario, id_terminal),
  CONSTRAINT "FK_TERMINAL_ACESSO_USUARIO_TERMINAL" FOREIGN KEY (id_terminal)
      REFERENCES tb_terminal (id_terminal) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_acesso_usuario_terminal
  OWNER TO postgres;

  
-- Table: tb_endereco_estabelecimento

-- DROP TABLE tb_endereco_estabelecimento;

CREATE TABLE tb_endereco_estabelecimento
(
  id_estabelecimento integer NOT NULL,
  id_endereco integer NOT NULL,
  tp_endereco integer NOT NULL,
  ds_logradouro character varying(100),
  ds_complemento character varying(50),
  ds_bairro character varying(50),
  ds_cidade character varying(50),
  ds_estado character(2),
  ds_codigo_postal character(8),
  CONSTRAINT "PK_ENDERECO_ESTABELECIMENTO" PRIMARY KEY (id_estabelecimento, id_endereco),
  CONSTRAINT "FK_ESTABELECIMENTO_ENDERECO_ESTABELECIMENTO" FOREIGN KEY (id_estabelecimento)
      REFERENCES tb_estabelecimento (id_estabelecimento) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_endereco_estabelecimento
  OWNER TO postgres;

  
-- Table: tb_usuario_externo

-- DROP TABLE tb_usuario_externo;

CREATE TABLE tb_usuario_externo
(
  id_usuario serial NOT NULL,
  ds_login character varying(20) NOT NULL,
  ds_nome character varying(100),
  id_detalhe character varying(50),
  ic_ativo boolean NOT NULL,
  dt_inclusao timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT "PK_USUARIO_EXTERNO" PRIMARY KEY (id_usuario),
  CONSTRAINT "UX_LOGIN_USUARIO_EXTERNO" UNIQUE (ds_login)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_usuario_externo
  OWNER TO postgres;

  
-- Table: tb_usuario_externo_terminal

-- DROP TABLE tb_usuario_externo_terminal;

CREATE TABLE tb_usuario_externo_terminal
(
  id_usuario integer NOT NULL,
  id_terminal integer NOT NULL,
  CONSTRAINT "PK_USUARIO_EXTERNO_TERMINAL" PRIMARY KEY (id_usuario, id_terminal),
  CONSTRAINT "FK_TERMINAL_USUARIO_EXTERNO_TERMINAL" FOREIGN KEY (id_terminal)
      REFERENCES tb_terminal (id_terminal) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_USUARIO_EXTERNO_USUARIO_EXTERNO_TERMINAL" FOREIGN KEY (id_usuario)
      REFERENCES tb_usuario_externo (id_usuario) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_usuario_externo_terminal
  OWNER TO postgres;

-- Index: "IX_TERMINAL_AUTENTICACAO_USUARIO_EXTERNO"

-- DROP INDEX "IX_TERMINAL_AUTENTICACAO_USUARIO_EXTERNO";

CREATE INDEX "IX_TERMINAL_AUTENTICACAO_USUARIO_EXTERNO"
  ON tb_usuario_externo_terminal
  USING btree
  (id_terminal);


  
-- Table: tb_autenticacao_usuario_externo

-- DROP TABLE tb_autenticacao_usuario_externo;

CREATE TABLE tb_autenticacao_usuario_externo
(
  id_usuario integer NOT NULL,
  id_autenticacao character varying(50) NOT NULL,
  ic_ativo boolean NOT NULL,
  dt_inclusao timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT "FK_USUARIO_EXTERNO_AUTENTICACAO_USUARIO_EXTERNO" FOREIGN KEY (id_usuario)
      REFERENCES tb_usuario_externo (id_usuario) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "UX_AUTENTICACAO_USUARIO_EXTERNO" UNIQUE (id_autenticacao)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_autenticacao_usuario_externo
  OWNER TO postgres;

-- Index: "FKI_USUARIO_EXTERNO_AUTENTICACAO_USUARIO_EXTERNO"

-- DROP INDEX "FKI_USUARIO_EXTERNO_AUTENTICACAO_USUARIO_EXTERNO";

CREATE INDEX "FKI_USUARIO_EXTERNO_AUTENTICACAO_USUARIO_EXTERNO"
  ON tb_autenticacao_usuario_externo
  USING btree
  (id_usuario);


  
-- Table: tb_dispositivo

-- DROP TABLE tb_dispositivo;

CREATE TABLE tb_dispositivo
(
  id_dispositivo serial NOT NULL,
  ds_dispositivo character varying NOT NULL,
  CONSTRAINT "PK_DISPOSITIVO" PRIMARY KEY (id_dispositivo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_dispositivo
  OWNER TO postgres;

  
-- Table: tb_dispositivo_modelo

-- DROP TABLE tb_dispositivo_modelo;

CREATE TABLE tb_dispositivo_modelo
(
  id_dispositivo integer NOT NULL,
  id_modelo integer NOT NULL,
  CONSTRAINT "PK_DISPOSITIVO_MODELO" PRIMARY KEY (id_dispositivo, id_modelo),
  CONSTRAINT "FK_DISPOSITIVO_DISPOSITIVO_MODELO" FOREIGN KEY (id_dispositivo)
      REFERENCES tb_dispositivo (id_dispositivo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_MODELO_DISPOSITIVO_MODELO" FOREIGN KEY (id_modelo)
      REFERENCES tb_modelo (id_modelo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_dispositivo_modelo
  OWNER TO postgres;

-- Index: "FKI_MODELO_DISPOSITIVO_MODELO"

-- DROP INDEX "FKI_MODELO_DISPOSITIVO_MODELO";

CREATE INDEX "FKI_MODELO_DISPOSITIVO_MODELO"
  ON tb_dispositivo_modelo
  USING btree
  (id_modelo);


-- Table: tb_sensor

-- DROP TABLE tb_sensor;

CREATE TABLE tb_sensor
(
  id_dispositivo integer NOT NULL,
  id_sensor integer NOT NULL,
  ds_sensor character varying(50) NOT NULL,
  CONSTRAINT "PK_SENSOR" PRIMARY KEY (id_dispositivo, id_sensor),
  CONSTRAINT "FK_DISPOSITIVO_SENSOR" FOREIGN KEY (id_dispositivo)
      REFERENCES tb_dispositivo (id_dispositivo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_sensor
  OWNER TO postgres;

  
-- Table: tb_status_dispositivo

-- DROP TABLE tb_status_dispositivo;

CREATE TABLE tb_status_dispositivo
(
  id_dispositivo integer NOT NULL,
  id_sensor integer NOT NULL,
  cd_status integer NOT NULL,
  ds_status character varying(50) NOT NULL,
  id_severidade integer NOT NULL,
  CONSTRAINT "PK_STATUS_DISPOSITIVO" PRIMARY KEY (id_dispositivo, id_sensor, cd_status),
  CONSTRAINT "FK_DISPOSITIVO_STATUS_DISPOSITIVO" FOREIGN KEY (id_dispositivo, id_sensor)
      REFERENCES tb_sensor (id_dispositivo, id_sensor) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_status_dispositivo
  OWNER TO postgres;

-- Index: "IX_STATUS_STATUS_DISPOSITIVO"

-- DROP INDEX "IX_STATUS_STATUS_DISPOSITIVO";

CREATE INDEX "IX_STATUS_STATUS_DISPOSITIVO"
  ON tb_status_dispositivo
  USING btree
  (cd_status);

  
-- Table: tb_monitoracao

-- DROP TABLE tb_monitoracao;

CREATE TABLE tb_monitoracao
(
  id_terminal integer NOT NULL,
  dt_envio timestamp with time zone NOT NULL DEFAULT now(),
  ic_status_terminal integer NOT NULL,
  id_monitoracao uuid,
  CONSTRAINT "PK_MONITORACAO" PRIMARY KEY (id_terminal),
  CONSTRAINT "FK_TERMINAL_MONITORACAO" FOREIGN KEY (id_terminal)
      REFERENCES tb_terminal (id_terminal) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "UX_id_monitoracao" UNIQUE (id_monitoracao)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_monitoracao
  OWNER TO postgres;

-- Index: "IX_STATUS_TERMINAL_MONITORACAO"

-- DROP INDEX "IX_STATUS_TERMINAL_MONITORACAO";

CREATE INDEX "IX_STATUS_TERMINAL_MONITORACAO"
  ON tb_monitoracao
  USING btree
  (ic_status_terminal);

  
-- Table: tb_transacao

-- DROP TABLE tb_transacao;

CREATE TABLE tb_transacao
(
  id_transacao serial NOT NULL,
  ds_transacao character varying(100),
  tp_transacao tipo_transacao,
  CONSTRAINT "PK_TRANSACAO" PRIMARY KEY (id_transacao)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_transacao
  OWNER TO postgres;

  
-- Table: tb_moeda

-- DROP TABLE tb_moeda;

CREATE TABLE tb_moeda
(
  cd_moeda integer NOT NULL,
  ds_simbolo character varying(5),
  ds_sigla character varying(10),
  tp_conversao "char",
  dt_exclusao date,
  CONSTRAINT "PK_MOEDA" PRIMARY KEY (cd_moeda)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_moeda
  OWNER TO postgres;

  
-- Table: tb_pais

-- DROP TABLE tb_pais;

CREATE TABLE tb_pais
(
  cd_pais integer NOT NULL,
  ds_pais character varying(100),
  ds_nome character varying(50),
  cd_moeda integer,
  CONSTRAINT "PK_PAIS" PRIMARY KEY (cd_pais),
  CONSTRAINT "FK_MOEDA_PAIS" FOREIGN KEY (cd_moeda)
      REFERENCES tb_moeda (cd_moeda) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_pais
  OWNER TO postgres;
  
  
-- Table: tb_operacao

-- DROP TABLE tb_operacao;

CREATE TABLE tb_operacao
(
  id_operacao uuid NOT NULL,
  dt_operacao timestamp without time zone,
  id_terminal integer,
  id_usuario integer,
  id_transacao integer,
  vl_operacao money,
  cd_moeda integer,
  tp_operacao tipo_operacao_financeira,
  CONSTRAINT "PK_OPERACAO" PRIMARY KEY (id_operacao),
  CONSTRAINT "FK_MOEDA_OPERACAO" FOREIGN KEY (cd_moeda)
      REFERENCES tb_moeda (cd_moeda) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TERMINAL_OPERACAO" FOREIGN KEY (id_terminal)
      REFERENCES tb_terminal (id_terminal) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_TRANSACAO_OPERACAO" FOREIGN KEY (id_transacao)
      REFERENCES tb_transacao (id_transacao) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "FK_USUARIO_OPERACAO" FOREIGN KEY (id_usuario)
      REFERENCES tb_usuario_externo (id_usuario) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE SET NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_operacao
  OWNER TO postgres;

-- Index: "FKI_TERMINAL_OPERACAO"

-- DROP INDEX "FKI_TERMINAL_OPERACAO";

CREATE INDEX "FKI_TERMINAL_OPERACAO"
  ON tb_operacao
  USING btree
  (id_terminal);

-- Index: "FKI_TRANSACAO_OPERACAO"

-- DROP INDEX "FKI_TRANSACAO_OPERACAO";

CREATE INDEX "FKI_TRANSACAO_OPERACAO"
  ON tb_operacao
  USING btree
  (id_transacao);

-- Index: "FKI_USUARIO_OPERACAO"

-- DROP INDEX "FKI_USUARIO_OPERACAO";

CREATE INDEX "FKI_USUARIO_OPERACAO"
  ON tb_operacao
  USING btree
  (id_usuario);

  
  
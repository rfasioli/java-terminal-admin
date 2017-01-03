-- Table: tb_cliente

-- DROP TABLE tb_cliente;

CREATE TABLE tb_cliente
(
  id_cliente serial NOT NULL,
  ds_nome_fantasia character varying(100) NOT NULL,
  ds_razao_social character varying(100) NOT NULL,
  ds_cnpj character varying(20) NOT NULL,
  dt_cadastro timestamp with time zone NOT NULL DEFAULT now(),
  ic_ativo boolean NOT NULL,
  ds_conexao character varying(256),
  ds_sigla character varying(16),
  CONSTRAINT pk_cliente PRIMARY KEY (id_cliente),
  CONSTRAINT ux_cliente_ds_cnpj UNIQUE (ds_cnpj),
  CONSTRAINT ux_cliente_razao_social UNIQUE (ds_razao_social)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_cliente
  OWNER TO postgres;


-- Table: tb_perfil

-- DROP TABLE tb_perfil;

CREATE TABLE tb_perfil
(
  id_perfil serial NOT NULL,
  ds_perfil character varying(100) NOT NULL,
  tp_perfil integer NOT NULL,
  ic_nivel integer NOT NULL,
  CONSTRAINT pk_tb_perfil PRIMARY KEY (id_perfil)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_perfil
  OWNER TO postgres;


-- Table: tb_tipo_endereco

-- DROP TABLE tb_tipo_endereco;

CREATE TABLE tb_tipo_endereco
(
  tp_endereco integer NOT NULL,
  ds_tipo_endereco character varying(256) NOT NULL,
  CONSTRAINT pk_tipo_endereco PRIMARY KEY (tp_endereco)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_tipo_endereco
  OWNER TO postgres;


-- Table: tb_tipo_contato

-- DROP TABLE tb_tipo_contato;

CREATE TABLE tb_tipo_contato
(
  tp_contato integer NOT NULL,
  ds_tipo_contato character varying(256) NOT NULL,
  CONSTRAINT pk_tipo_contato PRIMARY KEY (tp_contato)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_tipo_contato
  OWNER TO postgres;

-- Table: tb_cliente_contato

-- DROP TABLE tb_cliente_contato;

CREATE TABLE tb_cliente_contato
(
  id_cliente serial NOT NULL,
  id_sequencia integer NOT NULL,
  tp_contato integer NOT NULL,
  ds_contato character varying(256) NOT NULL,
  tx_observacao character varying(100),
  CONSTRAINT pk_cliente_contato PRIMARY KEY (id_cliente, id_sequencia),
  CONSTRAINT fk_cliente_contato_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_cliente_contato_tipo_contato FOREIGN KEY (tp_contato)
      REFERENCES tb_tipo_contato (tp_contato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_cliente_contato
  OWNER TO postgres;


-- Table: tb_cliente_endereco

-- DROP TABLE tb_cliente_endereco;

CREATE TABLE tb_cliente_endereco
(
  id_cliente serial NOT NULL,
  id_sequencia integer NOT NULL,
  tp_endereco integer NOT NULL,
  ds_logradouro character varying(256) NOT NULL,
  ds_cidade character varying(100) NOT NULL,
  ds_estado character(2) NOT NULL,
  nr_cep character(8) NOT NULL,
  ds_complemento character varying(32),
  ds_bairro character varying(50),
  CONSTRAINT pk_cliente_endereco PRIMARY KEY (id_cliente, id_sequencia),
  CONSTRAINT fk_cliente_endereco_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_cliente_endereco_tipo_endereco FOREIGN KEY (tp_endereco)
      REFERENCES tb_tipo_endereco (tp_endereco) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_cliente_endereco
  OWNER TO postgres;


-- Table: tb_sistema

-- DROP TABLE tb_sistema;

CREATE TABLE tb_sistema
(
  id_sistema serial NOT NULL,
  ds_sistema character varying(50) NOT NULL,
  CONSTRAINT pk_tb_sistema PRIMARY KEY (id_sistema)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_sistema
  OWNER TO postgres;


-- Table: tb_sistema_cliente

-- DROP TABLE tb_sistema_cliente;

CREATE TABLE tb_sistema_cliente
(
  id_sistema integer NOT NULL,
  id_cliente integer NOT NULL,
  CONSTRAINT pk_tb_sistema_cliente PRIMARY KEY (id_sistema, id_cliente),
  CONSTRAINT fk_sistema_cliente_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_sistema_cliente_sistema FOREIGN KEY (id_sistema)
      REFERENCES tb_sistema (id_sistema) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_sistema_cliente
  OWNER TO postgres;


-- Table: tb_funcionalidade

-- DROP TABLE tb_funcionalidade;

CREATE TABLE tb_funcionalidade
(
  id_funcionalidade serial NOT NULL,
  ds_funcionalidade character varying(100) NOT NULL,
  ds_programa character varying(100) NOT NULL,
  id_funcionalidade_anterior integer,
  id_sequencia integer,
  id_sistema integer NOT NULL,
  ic_ativo boolean NOT NULL,
  ds_path character varying(100),
  ds_icone character varying(100) NOT NULL DEFAULT 'fa-cog'::character varying,
  CONSTRAINT pk_tb_funcionalidade PRIMARY KEY (id_funcionalidade),
  CONSTRAINT fk_funcionalidade_sistema FOREIGN KEY (id_sistema)
      REFERENCES tb_sistema (id_sistema) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_funcionalidade
  OWNER TO postgres;


-- Table: tb_funcionalidade_cliente

-- DROP TABLE tb_funcionalidade_cliente;

CREATE TABLE tb_funcionalidade_cliente
(
  id_funcionalidade integer NOT NULL,
  id_cliente integer NOT NULL,
  CONSTRAINT pk_tb_funcionalidade_cliente PRIMARY KEY (id_funcionalidade, id_cliente),
  CONSTRAINT fk_funcionalidade_cliente_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_funcionalidade_cliente_funcionalidade FOREIGN KEY (id_funcionalidade)
      REFERENCES tb_funcionalidade (id_funcionalidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_funcionalidade_cliente
  OWNER TO postgres;


-- Table: tb_perfil

-- DROP TABLE tb_perfil;

CREATE TABLE tb_perfil
(
  id_perfil serial NOT NULL,
  ds_perfil character varying(100) NOT NULL,
  tp_perfil integer NOT NULL,
  ic_nivel integer NOT NULL,
  CONSTRAINT pk_tb_perfil PRIMARY KEY (id_perfil)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_perfil
  OWNER TO postgres;


-- Table: tb_funcionalidade_perfil

-- DROP TABLE tb_funcionalidade_perfil;

CREATE TABLE tb_funcionalidade_perfil
(
  id_funcionalidade integer NOT NULL,
  id_perfil integer NOT NULL,
  CONSTRAINT pk_funcionalidade_perfil PRIMARY KEY (id_funcionalidade, id_perfil),
  CONSTRAINT fk_funcionalidade_perfil_funcionalidade FOREIGN KEY (id_funcionalidade)
      REFERENCES tb_funcionalidade (id_funcionalidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_funcionalidade_perfil_perfil FOREIGN KEY (id_perfil)
      REFERENCES tb_perfil (id_perfil) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_funcionalidade_perfil
  OWNER TO postgres;

-- Index: fki_funcionalidade_perfil_perfil

-- DROP INDEX fki_funcionalidade_perfil_perfil;

CREATE INDEX fki_funcionalidade_perfil_perfil
  ON tb_funcionalidade_perfil
  USING btree
  (id_perfil);


-- Table: tb_terminal

-- DROP TABLE tb_terminal;

CREATE TABLE tb_terminal
(
  id_terminal serial NOT NULL,
  id_cliente integer NOT NULL,
  nr_terminal character varying(20) NOT NULL,
  CONSTRAINT pk_tb_terminal PRIMARY KEY (id_terminal),
  CONSTRAINT fk_terminal_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT ux_terminal_nr_terminal UNIQUE (nr_terminal)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_terminal
  OWNER TO postgres;


-- Table: tb_usuario

-- DROP TABLE tb_usuario;

CREATE TABLE tb_usuario
(
  id_usuario serial NOT NULL,
  ds_login character varying(20) NOT NULL,
  ds_email character varying(128) NOT NULL,
  ds_senha character varying(128),
  ds_nome_usuario character varying(100) NOT NULL,
  dt_criacao timestamp with time zone NOT NULL DEFAULT now(),
  dt_alteracao timestamp with time zone,
  ds_token character varying(128),
  dt_gera_token timestamp with time zone,
  id_perfil integer NOT NULL,
  ic_ativo boolean NOT NULL,
  CONSTRAINT pk_tb_usuario PRIMARY KEY (id_usuario),
  CONSTRAINT fk_usuario_perfil FOREIGN KEY (id_perfil)
      REFERENCES tb_perfil (id_perfil) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT ux_usuario_login UNIQUE (ds_login)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_usuario
  OWNER TO postgres;

-- Index: fki_usuario_perfil

-- DROP INDEX fki_usuario_perfil;

CREATE INDEX fki_usuario_perfil
  ON tb_usuario
  USING btree
  (id_perfil);



-- Table: tb_usuario_cliente

-- DROP TABLE tb_usuario_cliente;

CREATE TABLE tb_usuario_cliente
(
  id_usuario integer NOT NULL,
  id_cliente integer NOT NULL,
  CONSTRAINT pk_tb_usuario_cliente PRIMARY KEY (id_usuario, id_cliente),
  CONSTRAINT fk_usuario_cliente_cliente FOREIGN KEY (id_cliente)
      REFERENCES tb_cliente (id_cliente) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_usuario_cliente_usuario FOREIGN KEY (id_usuario)
      REFERENCES tb_usuario (id_usuario) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_usuario_cliente
  OWNER TO postgres;


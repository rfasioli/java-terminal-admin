BEGIN TRANSACTION;

DELETE FROM tb_pais;
DELETE FROM tb_moeda;

CREATE TEMP TABLE tmp_moedas
(
  cd_moeda integer NOT NULL,
  ds_nome character varying(50),
  ds_sigla character varying(10),
  cd_pais integer,
  ds_pais character varying(100),
  tp_conversao "char",
  dt_exclusao date
) ON COMMIT DROP;

COPY tmp_moedas (cd_moeda,ds_nome,ds_sigla,cd_pais,ds_pais,tp_conversao,dt_exclusao) 
	FROM '/home/orion/workspace/eSafe/MOEDAS.csv' DELIMITER ';' CSV;

INSERT INTO tb_moeda (cd_moeda,
  ds_sigla,
  tp_conversao,
  dt_exclusao)
SELECT DISTINCT ON (cd_moeda) 
  cd_moeda,
  ds_sigla,
  tp_conversao,
  dt_exclusao
FROM tmp_moedas;

INSERT INTO tb_pais
SELECT DISTINCT ON (cd_pais) 
  cd_pais,
  ds_pais,
  ds_nome,
  cd_moeda
FROM tmp_moedas
WHERE cd_pais IS NOT NULL;

COMMIT TRANSACTION;


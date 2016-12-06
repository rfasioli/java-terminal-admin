package br.inf.orion.eSafe.model;

public class Funcionalidade {
	private Integer id;
	private String descricao;
	private String programa;
	private Integer funcionalidadeAnterior;
	private Integer sequencia;
	private Integer idSistema;
	private Boolean Ativo;
	private String Path;
	private String Icone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public Integer getFuncionalidadeAnterior() {
		return funcionalidadeAnterior;
	}
	public void setFuncionalidadeAnterior(Integer funcionalidadeAnterior) {
		this.funcionalidadeAnterior = funcionalidadeAnterior;
	}
	public Integer getSequencia() {
		return sequencia;
	}
	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}
	public Integer getIdSistema() {
		return idSistema;
	}
	public void setIdSistema(Integer idSistema) {
		this.idSistema = idSistema;
	}
	public Boolean getAtivo() {
		return Ativo;
	}
	public void setAtivo(Boolean ativo) {
		Ativo = ativo;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getIcone() {
		return Icone;
	}
	public void setIcone(String icone) {
		Icone = icone;
	}

	public Funcionalidade() {
		super();
	}
	
	public Funcionalidade(Integer id,
						String descricao,
						String programa,
						Integer funcionalidadeAnterior,
						Integer sequencia,
						Integer idSistema,
						Boolean Ativo,
						String Path,
						String Icone)
	{
		super();
		this.id = id;
		this.descricao = descricao;
		this.programa = programa;
		this.funcionalidadeAnterior = funcionalidadeAnterior;
		this.sequencia= sequencia;
		this.idSistema = idSistema;
		this.Ativo = Ativo;
		this.Path = Path;
		this.Icone = Icone;
	}	

	@Override
	public String toString() 
	{
		return "Funcionalidade: [id=" + this.id + ", descricao=" + this.descricao + ","
				+ " programa=" + this.programa + ", funcionalidadeAnterior=" + this.funcionalidadeAnterior + ","
				+ " sequencia=" + this.sequencia + ", idSistema=" + this.idSistema + ","
				+ " Ativo=" + this.Ativo + ", Path=" + this.Path + ","
				+ " Icone=" + this.Icone + "]";
	}
}

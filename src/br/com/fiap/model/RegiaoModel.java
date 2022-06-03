package br.com.fiap.model;

public class RegiaoModel {

	private int id;
	private String nomeRegiao;
	
	public RegiaoModel() {
		super();
	}
	
	public RegiaoModel(int id, String nomeRegiao) {
		super();
		this.id = id;
		this.nomeRegiao = nomeRegiao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeRegiao() {
		return nomeRegiao;
	}
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}
	
	
}

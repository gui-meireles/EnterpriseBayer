package br.com.fiap.model;

public class DoencaModel {

	private int id;
	private String nomeDoenca;
	
	
	public DoencaModel() {
		super();
	}
	
	public DoencaModel(int id, String nomeDoenca) {
		super();
		this.id = id;
		this.nomeDoenca = nomeDoenca;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDoenca() {
		return nomeDoenca;
	}
	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}
	
	
}

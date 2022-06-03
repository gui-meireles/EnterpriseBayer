package br.com.fiap.model;

public class ClasseModel {

	private int id;
	private String nomeClasse;
	
	
	public ClasseModel() {
		super();
	}
	
	public ClasseModel(int id, String nomeClasse) {
		super();
		this.id = id;
		this.nomeClasse = nomeClasse;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	
}

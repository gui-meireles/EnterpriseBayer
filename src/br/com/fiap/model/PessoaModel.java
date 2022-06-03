package br.com.fiap.model;

import java.util.Date;

public class PessoaModel {
	
	private int id;
	private char sexo;
	private int idade;
	private int idRegiao;
	private int idDoenca;
	private int idClasse;
	
	public PessoaModel(int id, char sexo, int idade, Date data) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public PessoaModel(int id, char sexo, int idade, Date data, int idRegiao, int idDoenca, int idClasse) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.idade = idade;
		this.idRegiao = idRegiao;
		this.idDoenca = idDoenca;
		this.idClasse = idClasse;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdRegiao() {
		return idRegiao;
	}
	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}
	public int getIdDoenca() {
		return idDoenca;
	}
	public void setIdDoenca(int idDoenca) {
		this.idDoenca = idDoenca;
	}
	public int getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	
}

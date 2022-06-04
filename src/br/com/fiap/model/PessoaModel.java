package br.com.fiap.model;

import br.com.fiap.dao.PessoaDAO;

public class PessoaModel {

	private int id;
	private String sexo;
	private int idade;
	private int regiao;
	private int doenca;
	private int renda;

	public PessoaModel() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getRegiao() {
		return regiao;
	}
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	public int getDoenca() {
		return doenca;
	}
	public void setDoenca(int doenca) {
		this.doenca = doenca;
	}
	public int getRenda() {
		return renda;
	}
	public void setRenda(int renda) {
		this.renda = renda;
	}

	public int AdicionaUser(PessoaModel obj) {
		PessoaDAO aDao = new PessoaDAO();
		return aDao.Add(obj);
	}
}

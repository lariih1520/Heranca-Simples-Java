package br.sp.senai.modelos;

public class Pessoa {

	private String cpf;
	private String nome;
	private String dtNasc;
	private String celular;
	private String cidade;
	private String estado;
	private String entereco;
	private String cep;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEntereco() {
		return entereco;
	}

	public void setEntereco(String entereco) {
		this.entereco = entereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String falar(){
		return "Oi, estou falando!";
	}
	
	public String sorrir(){
		return "Ha ha ha ha";
	}
	
}

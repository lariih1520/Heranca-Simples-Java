package br.sp.senai.modelos;

// Herança: extends
public class Funcionario extends Pessoa {

	private String cargo;
	private String salario;
	private String departamento;
	private String dtAdmissao;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String registrarPonto(){
		return "registrei meu ponto!";
		
	}
	
	public String receberSalario(){
		return "Recebi meu pagamento! :D ";
	}
	
	
}

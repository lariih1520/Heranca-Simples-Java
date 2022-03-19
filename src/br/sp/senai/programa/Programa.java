package br.sp.senai.programa;

import br.sp.senai.modelos.Funcionario;
import br.sp.senai.modelos.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCpf("123456789");
		p.setNome("Nome Teste");
		p.setCelular("1235457");
		p.setCep("24667");
		p.setCidade("Itapevi");
		p.setEstado("Sao paulo");
		p.setDtNasc("15-02-2000");
		p.setEntereco("Av. 789");
		
		System.out.println("Meu nome é" + p.getNome());
		
		Funcionario f = new Funcionario();
		f.setNome("Larissa");
		f.setCpf("146567");
		f.setSalario("R$10000,00");
		f.setDtNasc("15-02-2000");
		f.setDtAdmissao("05-04-2015");
		f.setCelular("54678878");
		f.setCep("23545467");
		f.setEstado("ruy7ii");
		f.setDepartamento("Tecnico em informatica");
		f.setCargo("Desenvolvedor JAVA");
		f.setEntereco("Av. Paulista 123");
		f.setCidade("Cidade");
		
		System.out.println("------------------------------");
		System.out.println("O funcionário é " + f.getNome());
		System.out.println("O cargo é " + f.getCargo());
		System.out.println("O Departamento é " + f.getDepartamento());
		System.out.println(f.falar());
	}

}

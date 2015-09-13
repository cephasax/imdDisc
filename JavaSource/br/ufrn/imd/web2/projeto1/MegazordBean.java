package br.ufrn.imd.web2.projeto1;

import java.util.ArrayList;

public class MegazordBean {

	public static Disciplina disciplina;
	public static Pessoa pessoa;
	public static ArrayList<Disciplina> listaDisciplinas;
	public static ArrayList<Pessoa> listaPessoas;

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}
	
	public static void main(String[] args) {
		
			disciplina = new Disciplina();
			
	}
	
}

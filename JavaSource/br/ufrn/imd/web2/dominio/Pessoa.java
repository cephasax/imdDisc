package br.ufrn.imd.web2.dominio;

public class Pessoa {
	
	private String nome;
	private long matricula;
	private String login;
	private String senha;
	
	public Pessoa(){
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}


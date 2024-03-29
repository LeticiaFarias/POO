package br.ufc.quixada.si.poo.model;

public abstract class Usuario {
	private String nome;
	private String email;
	private String senha;

	public Usuario() {

	}

	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario \nnome: " + this.nome + "\nemail: " + this.email + "\nsenha: " + this.senha;
	}

}

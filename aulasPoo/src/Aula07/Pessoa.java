package Aula07;

public class Pessoa {
	private String nome;
	private String corDoCabelo;
	private String biotipo;
	private int idade;
	private Carro carro;
	
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
		this.nome=nome;
		this.corDoCabelo=corDoCabelo;
		this.biotipo=biotipo;
		this.idade=idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorDoCabelo() {
		return corDoCabelo;
	}
	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}
	public String getBiotipo() {
		return biotipo;
	}
	public void setBiotipo(String biotipo) {
		this.biotipo = biotipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	void ligarCarro() {
		carro.ligar();
	}
	void desligarCarro() {
		carro.desligar();
	}
	void acelerarCarro() {
		carro.acelerar();
	}
	void frearCarro() {
		carro.frear();
	}
	@Override
	public String toString() {
		return "\nPessoa --- nome: " + nome + " // corDoCabelo: " + corDoCabelo + " // biotipo: " + biotipo + " // idade: " + idade;
	}
	

}

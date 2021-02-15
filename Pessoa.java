/* Introdução ao uso de objetos e classes
   Objetos do mundo real possuem características e comportamentos, na programação
   orientada a objetos usamos esse conceito do mundo real e aplica aos nossos
   problemas que queremos resolver usando computação. */

public class Pessoa {
	// Atributo nome do tipo String
	// Implemenando o encapsulamento: atributos de um objeto só são visível
	// e modificáveis para a própria classe
	private String nome;
	private String cpf;

	// Construtor
	public Pessoa() {
		this.nome = "Ninguém";
		this.cpf = "00000000000";
	}

	// Construtor com argumento
	public Pessoa(String nome, String cpf ){
	//public Pessoa(String nome) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Método que dá um comportamento
	public void dizNome() {
		System.out.printf("Nome: " + this.nome);
	}

	public String pegaNome() {
		return this.nome;
	}

	public void dáNome(String nome) {
		this.nome = nome;
	}

	public void dizCpf() {
		System.out.printf("Cpf: " + this.nome);
	}

	public String pegaCpf() {
		return this.cpf;
	}

	public void dáCpf(String cpf) {
		this.cpf = cpf;
	}
}

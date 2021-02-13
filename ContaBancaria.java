import java.util.Scanner;


public class ContaBancaria{

	private int conta;
	private float saldo;
	private Pessoa cliente;
	
	public ContaBancaria(int conta, float saldo, Pessoa cliente) {
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	private void modificaSaldo(){
		System.out.println("Digite o novo saldo do cliente:");
		Scanner saldo = new Scanner(System.in); 
	}

	private String retornaSaldo(){
		String retorno = Float.toString(this.saldo);
		return retorno;
	}

	private void imprimeConta(){
		System.out.printf("Conta: " + conta);
		System.out.printf("Cliente: " + cliente.pegaNome());
		System.out.printf("Saldo em conta: " + saldo);

	}

	
}

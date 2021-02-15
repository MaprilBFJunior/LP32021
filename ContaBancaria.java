import java.util.Scanner;


public class ContaBancaria{

	private int conta;
	private float saldo;
	private Pessoa cliente;
	
	public ContaBancaria() {
		this.conta = -1;
		this.saldo = 0.0F;
		this.cliente =  new Pessoa();
	}

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

	public void imprimeConta(){
		System.out.println("Conta: " + conta);
		System.out.println("Cliente: " + cliente.pegaNome());
		System.out.println("CPF: " + cliente.pegaCpf());
		System.out.println("Saldo em conta: " + saldo);

	}

}

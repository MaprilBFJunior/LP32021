public class TestaConta{

	public static void main(String[] args){
		ContaBancaria conta1;
		Pessoa cliente1;

		cliente1 = new Pessoa("Josué", "12312312345");
		conta1 = new ContaBancaria(1, 50.00F, cliente1);

		conta1.imprimeConta();
	}	

}

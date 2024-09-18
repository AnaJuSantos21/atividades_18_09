package curso18_09;

public class ObjetosContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		//saldo inicial
		System.out.println(conta.getSaldo());
		
		//deposito
		conta.depositar(500);
		conta.depositar(1000);
		
		//mostrar saldo após 2 depositos
		System.out.println(conta.getSaldo());
		
		//saque
		conta.sacar(1500);
		
		//mostrar após saque
		System.out.println(conta.getSaldo());

	}

}

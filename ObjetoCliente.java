package curso18_09;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Monica", "74692455442", "123.456.789-10", "SP-12.345.678");
		
		System.out.println("ID do Cliente: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("RG: " + cliente.getRg());
		cliente.setNome("Ana Julya");
		cliente.setTelefone("134647485");
		System.out.println("Nome atualizado: " + cliente.getNome());
		System.out.println("Telefone atualizado: " + cliente.getTelefone());
		}

	}



package curso18_09;

public class ObjetoEndereco {

	public static void main(String[] args) {
		Endereco Endereco1 = new Endereco(55,"Avenida",70,"Casa","bancarios","Itapetininga","622486635","Brasil");
		System.out.println(Endereco1.getId());
		System.out.println(Endereco1.getlogradouro());
		System.out.println(Endereco1.getnumero());
		System.out.println(Endereco1.getcomplemento());
		System.out.println(Endereco1.getbairro());
		System.out.println(Endereco1.getcidade());
		System.out.println(Endereco1.getcep());
		System.out.println(Endereco1.getuf());
		
		//***********Construtor sem argumento*********
		System.out.println ("/////SEGUNDO ENDEREÇO/////");
		Endereco Endereco2 = new Endereco();
		Endereco2.setid(10);
		Endereco2.setlogradouro("Rua");
		Endereco2.setnumero(91);
		Endereco2.setcomplemento("AP");
		Endereco2.setbairro("Serafim");
		Endereco2.setcidade("Itapetininga");
		Endereco2.setcep("89765432");
		Endereco2.setuf("Brasil");
		System.out.println(Endereco2.getId());
		System.out.println(Endereco2.getlogradouro());
		System.out.println(Endereco2.getnumero());
		System.out.println(Endereco2.getcomplemento());
		System.out.println(Endereco2.getbairro());
		System.out.println(Endereco2.getcidade());
		System.out.println(Endereco2.getcep());
		System.out.println(Endereco2.getuf());
		}
		


	}



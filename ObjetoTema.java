package curso18_09;

public class ObjetoTema {

	public static void main(String[] args) {
		Tema tema1 = new Tema();

		tema1.setId(1);
		tema1.setNome("Halloween");
		tema1.setValorAluguel(700);
		tema1.setCorToalha("laranja");

		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		//******************************************************************

		Tema tema2 = new Tema(2, "Natal", 500, "Vermelho");

		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());

	}
}
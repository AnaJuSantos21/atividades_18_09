package curso18_09;

public class ObjetoProduto {

	public static void main(String[] args) {
		Produto prod = new Produto("Queijo prato", 50.00);
		
		//mostra valores iniciais
		System.out.println(prod.getNome()+ " " + prod.getPreco());
		
		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		prod.setNome("Queijo Prato");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());

	}

}

package curso18_09;

public class Tema {
	private int id;
	private String nome;
	private double valorAluguel;
	private String corToalha;
	
	
	public Tema() {}
	
	//Construtor
	public Tema(int id, String nome, double valorAluguel, String corTolha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	
	//Getter para o id
	public int getId() {
		return id;
	}
	
	//Setter para o id
	public void setId(int id) {
		this.id = id;
	}
	
	//Getter para o nome
	public String getNome() {
		return nome;
	}
	
	//Setter para o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Getter para a corTolha
	public String getCorToalha() {
		return corToalha;
	}
	
	//Setter para a corTolha
	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}
	
	//getter para o valorAluguel
	public double getValorAluguel() {
		return valorAluguel;
	}
	
	//setter para o preço com validação
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
		}
	
	
	}






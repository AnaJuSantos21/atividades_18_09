package curso18_09;

public class Endereco {
	private long id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	public Endereco () {}
	public Endereco (long id,String logradouro,int numero,String complemento,String bairro,String cidade,String cep,String uf) {
	this.id = id;
	this.logradouro=logradouro;
	this.numero=numero;
	this.complemento=complemento;
	this.bairro=bairro;
	this.cidade=cidade;
	this.cep=cep;
	this.uf=uf;
	}
	public long getId() {
	return id;
	}
	public void setid(long id) {
	this.id = id;
	}
	public String getlogradouro() {
	return logradouro;
	}
	public void setlogradouro(String logradouro) {
	this.logradouro = logradouro;
	}
	public int getnumero() {
	return numero;
	}
	public void setnumero (int numero) {
	this.numero = numero;
	}
	public String getcomplemento() {
	return complemento;
	}
	public void setcomplemento(String complemento) {
	this.complemento = complemento;
	}
	public String getbairro() {
	return bairro;
	}
	public void setbairro(String bairro) {
	this.bairro = bairro;
	}
	public String getcidade() {
	return cidade;
	}
	public void setcidade(String cidade) {
	this.cidade = cidade;
	}
	public String getcep() {
	return cep;
	}
	public void setcep(String cep) {
	this.cep = cep;
	}
	public String getuf() {
	return cep;
	}
	public void setuf(String uf) {
	this.uf = cep;
	}
	}




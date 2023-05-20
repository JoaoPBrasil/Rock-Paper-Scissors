package PedraPapelTesoura.model;

public class Jogada 
{
	private String nome;
	private int valor;
	
	public Jogada(String nome, int valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	} 
	
	
	
}

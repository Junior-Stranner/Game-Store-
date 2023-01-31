package LojaGames;

public class Games{
	private String nome;
	private String genero;
	private int lancamento;
	private double preco;
	private int estoque;
	private double desconto;
	private double recarga;
	private double valor;




	public Games(String nome, String genero, int lancamento, double preco, int estoque, double desconto,
			double recarga, double valor) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.lancamento = lancamento;
		this.preco = preco;
		this.estoque = estoque;
		this.desconto = desconto;
		this.recarga = recarga;
		this.valor = valor;
	}


	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getLancamento() {
		return lancamento;
	}
	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getRecarga() {
		return recarga;

	}

	public void setRecarga(double recarga) {
		this.recarga = recarga;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
package LojaGames;

public class Games{
	private String nome;
	private int lancamento;
	private double preco;
	private int estoque;
	private double desconto;
	private double carteira;
	
	public void vizualizaCarteira() {
		
		System.out.println("Carteira Atual : "+this.carteira);
	}

	

	public Games(String nome, int lancamento, double preco, int estoque, double desconto,
			double recarga) {
		super();
		this.nome = nome;
		this.lancamento = lancamento;
		this.preco = preco;
		this.estoque = estoque;
		this.desconto = desconto;
		this.carteira = 0;
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

	public double getCarteira() {
		return carteira;

	}

	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

}
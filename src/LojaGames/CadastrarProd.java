package LojaGames;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.Scanner;

public class CadastrarProd {

	static Scanner in = new Scanner(System.in);

	public static void main(String[]args) {

		ArrayList <Games> games = new ArrayList();

		int op = 0;

		do {

			System.out.println("\n=======\n MENU \n=======\n"
					+ " \n 1 - Cadastrar Produto/s "
					+ " \n 2 - Visualizar Produto/s"
					+ " \n 3 - Recaregar Valor"
					+ " \n 4 - Vizualizar Carteira"
					+ " \n 4 - valor com Desconto"
					+ " \n 5 - Jogo no Carrinho"
					+ " \n 6 - comprar Produto"
					+ " \n 7 - baixa no Estoque pos compra"
					+ " \n 9 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());
			switch(op) {

			case 1: cadastrarProd(games);break; 
			case 2: visualizarProd(games);break;
			case 3: recaregarCarteira(games);break;
			case 4: vizualizaCarteira(games);break;
			case 5: valorComDesconto(games);break;
			case 6: jogoCarrinho(games);break;
			case 7: comprarProduto(games);break;
			case 8: baixaEstoque(games);break;
			case 9:

			}

		}while(op != 9);
	}

	private static void baixaEstoque(ArrayList <Games> games) {


		for (Games games1 : games) {

			if(games1.getEstoque()== 1) {
				games1.setEstoque(games1.getEstoque()-1);
			}else if(games1.getEstoque() == 3) {
				games1.setEstoque(games1.getEstoque()-3);
			}else if(games1.getEstoque() == 10) {
				games1.setEstoque(games1.getEstoque()-10);
			}else if(games1.getEstoque() == 20) {
				games1.setEstoque(games1.getEstoque()-20);
			}else
				System.out.println(" Nao tem essa Quantidade no Estoque !");
		}
	}

	private static void comprarProduto(ArrayList <Games> games) {

		for (Games games1 : games) {

			System.out.println("\n nome do Jogo : "+games1.getNome()
			+" \n Genero do : "+games1.getGenero()
			+" \n Data de Lancamento : "+games1.getLancamento()
			+" \n Preco : "+games1.getPreco());

			System.out.println("----------------------");

			System.out.println(" Digite o Jogo para comprar ");
			String jogo = in.nextLine();

			if(games1.getNome().equalsIgnoreCase(jogo)) {
				
				games1.setPreco(games1.getPreco() * games1.getDesconto());
				games1.setCarteira(games1.getCarteira() - games1.getPreco());

				System.out.println(" Valor pago foi de : "+games1.getPreco());
				System.out.println(" Valor atual na Carteira e de : "+games1.getCarteira());
			}
		}
	}

	private static void jogoCarrinho(ArrayList <Games> games) {

         System.out.println("\n=============\n Compras Feitas \n ==============");
         
         for (Games games1 : games) {
			

         System.out.println("\n nome do Jogo : "+games1.getNome()
			+" \n Genero do : "+games1.getGenero()
			+" \n Data de Lancamento : "+games1.getLancamento()
			+" \n Preco : "+games1.getPreco());

         }
	}

	private static void valorComDesconto(ArrayList <Games> games) {
		String nome;
		System.out.print(" Verificar jogo Existente:");
		nome = in.nextLine();

		for (Games games1 : games) {
			if(games1.getNome().equalsIgnoreCase(nome)) {

				System.out.println("\n nome do Jogo : "+games1.getNome()
				+" \n Genero do : "+games1.getGenero()
				+" \n Data de Lancamento : "+games1.getLancamento()
				+" \n Preco : "+games1.getPreco());

				if(games1.getPreco() >=150 && games1.getPreco() < 200) 
					 games1.setDesconto( 0.95);
					games1.setPreco(games1.getPreco() * games1.getDesconto());		
				   
				
				System.out.println(" Preco com o desconto para o jogo "+games1.getNome()+" e "+games1.getPreco());

			}else 
				System.out.println(" Jogo Nao Encontrado");
		}
	}
	
	private static void vizualizaCarteira(ArrayList <Games> games) {
		
		for (Games games1 : games) {
		
		  System.out.println(" Valor na carteitra atual e : "+games1.getCarteira());
		}
	}

	private static void recaregarCarteira(ArrayList <Games> games) {

		System.out.print(" Valor a Depositar : ");
		double valor = Double.parseDouble(in.nextLine());

		for (Games games1 : games) {

			games1.setCarteira(valor);
		}
	}

	private static void cadastrarProd(ArrayList <Games> games  ) {
		double des = 0; 
		double carteira = 0;

		System.out.print("Digite nome do Jogo : ");
		String nome = in.nextLine();
		System.out.print("genero do Jogo : ");
		String genero = in.nextLine();
		System.out.print("ano de lancamento : ");
		int dataLanca = Integer.parseInt(in.nextLine());
		System.out.print(" Preco do Jogo : ");
		double preco = Double.parseDouble(in.nextLine());
		System.out.print(" Quantidade No estoque : ");
		int estoque = Integer.parseInt(in.nextLine());

		Games g = new Games(nome,genero,dataLanca,preco,estoque,des, carteira);
		games.add(g);

	}

	private static void visualizarProd(ArrayList <Games> games) {				

		for (Games games1 : games) {

			System.out.println("\n========================\nDisponiveis para Compra\n========================\n");

			System.out.println("\n nome do Jogo : "+games1.getNome()
			+" \n Genero do : "+games1.getGenero()
			+" \n Data de Lancamento : "+games1.getLancamento()
			+" \n Preco : "+games1.getPreco());

		}

	}

}

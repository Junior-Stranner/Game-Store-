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

			System.out.println(" MENU "
					+ " \n 1 - Cadastrar Produto "
					+ " \n 2 - Visualizar Produto"
					+ " \n 3 - Recaregar Valor"
					+ " \n 4 - vizualizar  Carteira"
					+ " \n 5 - calcular Desconto "
					+ " \n 6 - comprar Produto "
					+ " \n 7 - baixa no Estoque pos compra"
					+ " \n 8 - pesquisar outro produto "
					+ " \n 9 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());
			switch(op) {

			case 1: cadastrarProd(games);break; 
			case 2: visualizarProd(games);break;
			case 3: recaregarCarteira(games);break;
			case 4: vizualizaCarteira(games);break;
			case 5: calcularDesconto(games);break;
			case 6:
			case 7:
			case 8:
			case 9:

			}

		}while(op != 9);
	}

	private static void calcularDesconto(ArrayList <Games> games) {
		
		System.out.print(" Verificar jogo Existente:");
		String nome = in.nextLine();
		
		for (Games games1 : games) {
			if(nome == games1.getNome()) {
				
				System.out.println("\n nome do Jogo : "+games1.getNome()
				+" \n Genero do : "+games1.getGenero()
				+" \n Data de Lancamento : "+games1.getLancamento()
				+" \n Preco : "+games1.getPreco());
			}else {
				System.out.println(" Jogo nao Existe ");
			}		
			
			games1.setNome(nome);
			
			if(games1.getPreco() >=150 && games1.getPreco() < 200) {
				
				games1.setDesconto(0.15);
				
				
			}
		}
		
	}

	private static void vizualizaCarteira(ArrayList <Games> games) {

		for (Games games1 : games) {

			System.out.println(" Carteira atua e : "+games1.getValor());
		}

	}

	private static void recaregarCarteira(ArrayList <Games> games) {



		System.out.print(" Valor a Depositar : ");
		double valor = Double.parseDouble(in.nextLine());

		for (Games games1 : games) {
			games1.setValor(valor);
			games1.setRecarga(games1.getValor());

		}

	}

	private static void cadastrarProd(ArrayList <Games> games  ) {
		double des = 0; 
		double recarga = 0;
		double valor = 0;
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
	//	System.out.print(" Possivel desconto no produto : "+des);
		//	System.out.print("\n  Valor no cofre  : "+recarga);

		Games g = new Games(nome,genero,dataLanca,preco,estoque,des, recarga,valor);
		games.add(g);

	}

	private static void visualizarProd(ArrayList <Games> games) {				

		for (Games games1 : games) {

			/*System.out.println("\n========================\nDisponiveis para Compra\n
						===========================\n");*/

			System.out.println("\n nome do Jogo : "+games1.getNome()
			+" \n Genero do : "+games1.getGenero()
			+" \n Data de Lancamento : "+games1.getLancamento()
			+" \n Preco : "+games1.getPreco());
		
		}

	}

}

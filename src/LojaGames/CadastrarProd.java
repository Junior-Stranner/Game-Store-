package LojaGames;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.Scanner;

public class CadastrarProd {

	static Scanner in = new Scanner(System.in);

	static ArrayList <Usuario> usuarios = new ArrayList();
	static ArrayList <Games> games = new ArrayList();
	public static void main(String[]args) {

        Games game =new Games();

		int op = 0;

		do {

			System.out.println("\n=======\n MENU \n=======\n"
					+ " \n 1 - visulaizar Usúario "
					+ " \n 2 - Cadastrar Produto/s"
					+ " \n 3 - dados do Produto"
					+ " \n 4 - Recaregar Valor na Carteira"
					+ " \n 5 - Visualizar Carteireira"
					+ " \n 6 - resgatar Desconto"
					+ " \n 7 - Jogo no Carrinho/compra"
					+ " \n 8 - baixa no Estoque pos compra"
					+ " \n 9 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());
			switch(op) {

			case 1:	vizualizaUsuario(usuarios);break;
			case 2: cadastrarProd(games);break; 
			case 3: dadosProduto(games);break;
			case 4: recaregarCarteira(games);break;
			case 5: game.vizualizaCarteira();break; 
			case 6: resgatarDesconto(games);break;
			case 7: jogoCarrinho(games);break;
			case 8: baixaEstoque(games);break;
			case 90:System.out.println(" Finalizar Sistema !!");

			}

		}while(op != 90);
	}

	public static void baixaEstoque(ArrayList <Games> games) {


		for (Games games1 : games) {

			if(games1.getEstoque()== 1) {
				games1.setEstoque(games1.getEstoque()-1);
			}else if(games1.getEstoque() == 3) {
				games1.setEstoque(games1.getEstoque()-3);
			}else if(games1.getEstoque() == 10) {
				games1.setEstoque(games1.getEstoque()-10);
			}else if(games1.getEstoque() == 20) {
				games1.setEstoque(games1.getEstoque()-20);
			}else{
				System.out.println(" Nao tem essa Quantidade no Estoque !");
			}

			System.out.println("Estoque Atiualizado  : "+games1.getEstoque());
		}
	}
	public static void jogoCarrinho(ArrayList <Games> games) {

		System.out.println("Jogo a adicionar");
		String nome = in.nextLine();

		System.out.println("\n===============\n Carrinho Compras \n ================");

		for (Games games1 : games) {

			if(games1.getNome().equalsIgnoreCase(nome)){

				System.out.println("\n nome do Jogo : "+games1.getNome()
				+" \n Data de Lancamento : "+games1.getLancamento()
				+" \n Preco com Desconto: "+games1.getPreco()
				+" \n Estoque : "+games1.getEstoque());
			}else{
				System.out.println("Não tem jogo no carrinho");
			}

		}
	}

	public static void resgatarDesconto(ArrayList <Games> games) {
		String nome;
		System.out.print(" Verificar jogo Existente:");
		nome = in.nextLine();

		for (Games games1 : games) {
			if(games1.getNome().equalsIgnoreCase(nome)) {

				System.out.println("\n nome do Jogo : "+games1.getNome()
				+" \n Data de Lancamento : "+games1.getLancamento()
				+" \n Preco : "+games1.getPreco()
				+" \n Estoque : "+games1.getEstoque());


				/* 	if(games1.getPreco() >=50 && games1.getPreco() < 100) {
					games1.setPreco(games1.getPreco());		
				}else if(games1.getPreco() >=100 && games1.getPreco() < 150) { 
						 games1.setDesconto( 0.95);
						games1.setPreco(games1.getPreco() * games1.getDesconto());		
				}else if(games1.getPreco() >=150 && games1.getPreco() < 200) {
				 games1.setDesconto( 0.90);
				games1.setPreco(games1.getPreco() * games1.getDesconto());	

				}
				System.out.println(" Preco com o desconto para o jogo "+games1.getNome()+" e "+games1.getPreco());

			}else 
				System.out.println(" Jogo Nao Encontrado"); */
			}
		}
	}

/*	public static void vizualizaCarteira(ArrayList <Games> games) {
		for (Games games1 : games) {

          
		}
	}*/

	public static void recaregarCarteira(ArrayList <Games> games) {

		System.out.print(" Valor a Depositar : ");
		double valor = Double.parseDouble(in.nextLine());

		for (Games games1 : games) {

			games1.setCarteira(games1.getCarteira() +  valor);
		}

	}

	public static void cadastrarProd(ArrayList <Games> games  ) {
		double des = 0; 

		System.out.print("Digite nome do Jogo : ");
		String nome = in.nextLine();
		System.out.print("ano de lancamento : ");
		int dataLanca = Integer.parseInt(in.nextLine());
		System.out.print(" Preco do Jogo : ");
		double preco = Double.parseDouble(in.nextLine());
		System.out.print(" Quantidade No estoque : ");
		int estoque = Integer.parseInt(in.nextLine());

		Games g = new Games(nome,dataLanca,preco,estoque,des, preco);
		games.add(g);

	}

	public static void dadosProduto(ArrayList <Games> games) {		

		System.out.println("\n========================\nDisponiveis para Compra\n========================\n");


		for (Games games1 : games) {

			System.out.println("\n nome do Jogo : "+games1.getNome()
			+" \n Data de Lancamento : "+games1.getLancamento()
			+" \n Preco : "+games1.getPreco()
			+" \n Estoque : "+games1.getEstoque());

		}

	}
	public static void vizualizaUsuario(ArrayList <Usuario> usuarios){
		String nome = "Junior";
		double carteira = 0.0;

		System.out.print("\n Nome do Usuário : "+nome);

		System.out.print("\n Carteira online : "+carteira);

		Usuario usu =new Usuario(nome,carteira);

		usuarios.add(usu);

	}

}

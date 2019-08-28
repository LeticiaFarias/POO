package br.ufc.quixada.si.poo.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProdutosAVenda implements Repositorio {
	static int opcao = 0;
	static String pesquisa;
	public static Scanner sc = new Scanner(System.in);

	static Video filme = new Filme();
	static Video serie = new Serie();
	static Audio musica = new Musica();
	static Audio podcast = new Podcast();

	Map<String, Produto> mapProdutosAVenda = new HashMap<String, Produto>();

	public void menuCrudProdutos() {

		do {
			System.out.println("MENU PRODUTOS");
			System.out.println("[ 1 ] Filmes\n[ 2 ] Séries\n Músicas\n[ 3 ] Podcasts[ 4 ] Voltar ao menu inicial");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				return;
			default:
				System.out.println("Erro!");
			}
		} while (true);
	}

	public void menuFilmes() {
		do {
			System.out.println("MENU FILMES");
			System.out.println("[ 1 ] Adicionar Filme\n[ 2 ] Remover Filme\n[ 3 ] Pesquisar Filmes\n[ 4 ] Voltar");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				adicionarFilme();
				break;
			case 2:
				removerFilme();
				break;
			case 3:
				listarFilme();
				break;
			case 4:
				menuCrudProdutos();
			default:
				System.out.println("Erro!");
			}
		} while (true);
	}

	@Override
	public void adicionarFilme() {
		System.out.println("CADASTRO DE FILMES");
		System.out.println("Nome do Filme: ");
		filme.setNome(sc.nextLine());
		System.out.println("Código: ");
		filme.setCodigo(sc.nextLine());
		System.out.println("Faixa etária: ");
		filme.setFaixaEtaria(sc.nextInt());
		System.out.println("Preço: ");
		filme.setPreco(sc.nextDouble());
		sc.nextLine();
		System.out.println("Gênero: ");
		filme.setGenero(sc.nextLine());

		String chaveFilme = filme.getCodigo();

		mapProdutosAVenda.put(chaveFilme, filme);

	}

	@Override
	public void removerFilme() {
		System.out.println("REMOVER FILME");
		System.out.println("Nome do filme que deseja remover: ");
		pesquisa = sc.nextLine();

		if (mapProdutosAVenda.containsKey(pesquisa)) {
			mapProdutosAVenda.remove(mapProdutosAVenda);
			System.out.println("Filme removido!");
		} else {
			System.out.println("Filme não existe!");
		}

	}

	@Override
	public void listarFilme() {
		System.out.println("PESQUISAR FILME");
		System.out.println("[ 1 ] Pesquisa por código\n[ 2 ] Mostrar todos");
		opcao = sc.nextInt();
		sc.nextLine();

		if (opcao == 1) {
			System.out.println("Informe o codigo do filme que deseja pesquisar: ");
			pesquisa = sc.nextLine();
			if (mapProdutosAVenda.containsKey(pesquisa)) {
				System.out.println(mapProdutosAVenda);
			} else {
				System.out.println("Erro!");
			}
		} else if (opcao == 2) {
			System.out.println(mapProdutosAVenda);
		} else {
			System.out.println("Erro!");
		}

	}

}

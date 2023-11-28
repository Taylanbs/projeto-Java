package Controller;

import java.util.ArrayList;

import Sports.model.Produto;
import Repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

	private ArrayList <Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0; // inicio do arraylist
	
	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O Produto "+produto.getNome()+" foi adicionado com sucesso");
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}	
	}

	@Override
	public void consultarProdutoPorNome(int numero) {
		try{
			var produto = listaProdutos.get(numero);
			produto.visualizar();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("PRODUTO NÃO CADASTRADO");
		}
	}

	@Override
	public void atualizarProduto(int numero,Produto produto) {
		try {
			var produtoAntigo = listaProdutos.get(numero);
			listaProdutos.set(numero, produto);
			System.out.println(produtoAntigo + " foi atualizado por "+produto);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("PRODUTO NÃO CADASTRADO");
		}
	}

	@Override
	public void deletarProduto(int numero) {
		try {
			listaProdutos.remove(numero);
			System.out.println("Produto removido com sucesso.");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("PRODUTO NÃO CADASTRADO");
		}
		
	}
	public int gerarNumero() {
		return ++ numero;
	}

}

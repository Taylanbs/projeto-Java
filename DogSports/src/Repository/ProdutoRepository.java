package Repository;

import Sports.model.Produto;

public interface ProdutoRepository {
	public void criarProduto(Produto produto);
	public void listarProdutos();
	public void consultarProdutoPorNome(int numero);
	public void atualizarProduto(int numero,Produto produto);
	public void deletarProduto(int numero);
}

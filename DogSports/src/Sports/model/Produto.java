package Sports.model;

public abstract class Produto {
	//atributos
	private int numero,tipo;
	private String nome;
	private float preco;
	
	//Constructor
	public Produto(int numero, int tipo, String nome, float preco) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}
	//Metodos Getter e setter

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	//Metodos especiais
	public void visualizar() {
		String tipo = "";
		switch(this.tipo) {
		case 1:
			tipo = "Modelo";
			break;
		case 2: 
			tipo = "Tamanho";
			break;
		default:
			
		}
		
		System.out.println("Numero do produto: " + this.getNumero());
		System.out.println("Nome do produto: "+this.getNome());
		System.out.println("Tipo do produto: "+tipo);
		System.out.println("Preço do produto: "+this.getPreco());
		
		
	}
	
	
}

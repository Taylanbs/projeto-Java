package Sports.model;

public class Tenis extends Produto {
	private String tenis = "Tenis";
	public Tenis(int numero, int tipo, String nome, float preco,String tenis) {
		super(numero, tipo, nome, preco);
		this.tenis = tenis;
	}
	public String getTenis() {
		return tenis;
	}
	public void setModelo(String tenis) {
		this.tenis = tenis;
	}
	//metodos espciais
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O tipo do " + this.getTipo()+" é " + this.getTenis());
	}
}
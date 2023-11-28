package Sports.model;

public class Modelo extends Produto {
	private String modelo = "Modelo";
	public Modelo(int numero, int tipo, String nome, float preco,String modelo) {
		super(numero, tipo, nome, preco);
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//metodos espciais
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O tipo do " + this.getTipo()+" é " + this.getModelo());
	}
}
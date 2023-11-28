package Sports.model;

public class Camiseta extends Produto {
	
	private String camiseta = "Camiseta";
	
	public Camiseta(int id, int tipo, String nome, float preco,String camiseta) {
		super(id, tipo, nome, preco);
		this.camiseta = camiseta;
	}
	public String getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}
	//metodos
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O tipo do "+this.getTipo()+ " é "+ this.getCamiseta());
	}
}
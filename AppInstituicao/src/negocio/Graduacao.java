package negocio;

public class Graduacao extends Curso{

	private boolean tecnologo;	
	
	public Graduacao(String nome, int cargaHoraria, float valor, boolean tecnologo) {
		super(nome, cargaHoraria, valor);
		this.tecnologo = tecnologo;	
	}
	
	public void show() {
		System.out.println("\n#GRADUACAO");		
		super.show();
		System.out.printf("Tecnólogo: %s\n",
			(tecnologo? "sim" : "nao"));
	}

	public boolean isTecnologo() {
		return tecnologo;
	}

	public void setTecnologo(boolean tecnologo) {
		this.tecnologo = tecnologo;
	}
	
}


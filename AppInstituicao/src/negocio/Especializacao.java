package negocio;

public class Especializacao extends Curso
{
	private int anoTermino;
	
	public Especializacao(String nome, int cargaHoraria, float valor, int anoTermino) {
		super(nome, cargaHoraria, valor);
		this.anoTermino = anoTermino;	
	}

	public void show() {
		System.out.println("#ESPECIALIZAÇÃO");
		super.show();
		System.out.printf("Ano de término: %d\n",
				anoTermino);
	}


	public int getAnoTermino() {
		return anoTermino;
	}

	public void setAnoTermino(int anoTermino) {
		this.anoTermino = anoTermino;
	}
}

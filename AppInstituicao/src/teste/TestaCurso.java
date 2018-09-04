package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
		
		
		Especializacao e = null;
		e = new Especializacao ("Banco de dados", 1990, 3000, 2021);
		e.show();
			
		Graduacao g = null;
		g = new Graduacao ("Análise e desenvolvimento de Sistemas", 1996, 1500, true);
		g.show();		
	}
}

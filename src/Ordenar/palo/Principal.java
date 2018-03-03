package Ordenar.palo;

public class Principal {

	public static void main(String[] args) {
		Principal p = new Principal();
		p.correr();
	}

	private void correr() {
		Palo palo = new Palo();
		System.out.println("Cartas Utilizadas: ");
		palo.mostrar();
		palo.desordenar();
		palo.mostrar();
		palo.ordenar();
		palo.mostrar();

	}
}

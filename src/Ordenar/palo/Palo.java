package Ordenar.palo;

public class Palo {
	private Carta cartas[];

	public Palo() {
		cartas = new Carta[13];
		for (int i = 0; i < cartas.length; i++) {
			cartas[i] = new Carta(i + 1);
		}

	}

	public void desordenar() {
		System.out.println("\n\nDesordenando:");

		for (int x = 0; x < cartas.length ; x++) {
			int desorden = (int) (1 + (Math.random() * 12));
			Carta contenedor = cartas[x];
			cartas[x] = cartas[desorden];
			cartas[desorden] = contenedor;
		}
	}

	public void ordenar() {
		System.out.println("\n\nOrdenando:");

		for (int repetir = 1; repetir < cartas.length; repetir++) {
			for (int c = 0; c < (cartas.length-1); c++) {
				if (cartas[c].getValor() > cartas[c + 1].getValor()) {
					Carta cambio = cartas[c];
					cartas[c] = cartas[c + 1];
					cartas[c + 1] = cambio;
				}
			}
		}
		

	}

	public void mostrar() {

		for (int i = 0; i < cartas.length; i++) {
			cartas[i].mostrar();
		}
	}
}

package Ordenar.palo;

public class Carta {
	private int valor;
    private String simbolo;
    
	public Carta(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}

	private String valor2simbolo() {
		switch (valor) {
		case 1:
			simbolo = "A";
			break;
		case 11:
			simbolo = "J";
			break;
		case 12:
			simbolo = "Q";
			break;
		case 13:
			simbolo = "K";
			break;
		default:
			simbolo = Integer.toString(valor);
			break;
		}
		return simbolo;
	}

	public int simbolo2valor() {
		switch (simbolo) {
		case "A":
			valor = 1;
			break;
		case "J":
			valor = 11;
			break;
		case "Q":
			valor = 12;
			break;
		case "K":
			valor = 13;
			break;
		default: 
			valor = Integer.parseInt(simbolo);
			break;
		}
		return valor;
	}

	public void mostrar() {
		
		System.out.print(valor2simbolo()+", ");
		//System.out.print((simbolo2valor())+", ");
	}
}

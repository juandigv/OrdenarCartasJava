package Ordenar.palo;

public class Carta {
	public int valor;
    public String simbolo;
    
	public Carta(int valor) {
		this.valor = valor;
		valor2simbolo();
	}

	public void valor2simbolo() {
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
	}

	public void simbolo2Valor() {
		switch (simbolo) {
		case "A":
			valor = 1;
			break;
		case "2":
			valor = 2;
			break;
		case "3":
			valor = 3;
			break;
		case "4":
			valor = 4;
			break;
		case "5":
			valor = 5;
			break;
		case "6":
			valor = 6;
			break;
		case "7":
			valor = 7;
			break;
		case "8":
			valor = 8;
			break;
		case "9":
			valor = 9;
			break;
		case "10":
			valor = 10;
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
		}
	}

	public void mostrar() {
		System.out.print(simbolo+", ");
	}
}

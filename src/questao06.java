import java.util.Scanner;

public class questao06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo = 0;
		double massaInicial = 0;
		double massaInicial2 = 0;
		double massaFinal = 0;
		int hora = 0;
		int minuto = 0;
		int segundo = 0;

		System.out.print("Digite a massa inicial em gramas: ");
		massaInicial = ler.nextDouble();
		massaInicial2 = massaInicial;
		while (massaInicial >= 0.5) {
			massaInicial = massaInicial / 2;
			tempo += 50;
		}

		hora = tempo / 3600;
		minuto = (tempo - hora * 3600) / 60;
		segundo = (tempo - minuto * 60 - hora * 3600);
		massaFinal = massaInicial;
		System.out.println("Massa inicial - " + massaInicial2 + " gramas\nMassa final - " + massaFinal
				+ " gramas\nTempo - " + hora + " horas " + minuto + " minutos " + segundo + " segundos");
	}
}

import java.util.Scanner;

public class questao09 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int altura = 0;

		System.out.print("Digite a altura do triângulo: ");
		altura = ler.nextInt();
		desenharTriangulo(altura);

	}

	public static void desenharTriangulo(int alt) {

		String triangulo[][] = new String[alt][(alt * 2) - 1];
		int contadorMais = alt;
		int contadorMenos = alt;
		for (int i = 0; i < alt; i++) {
			for (int j = 0; j < (alt * 2) - 1; j++) {
				if ((j >= contadorMenos - 1) && (j <= contadorMais - 1)) {
					triangulo[i][j] = "*";

				} else {
					triangulo[i][j] = " ";
				}

			}
			contadorMenos--;
			contadorMais++;
		}

		for (int i = 0; i < alt; i++) {
			for (int j = 0; j < (alt * 2) - 1; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println("\n");
		}

	}

}

import java.util.Scanner;

public class questao02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String diaSemana;
		int tipoFerramenta;
		System.out.print("Digite o dia da semana desejado entre {Segunda, Ter�a, Quarta, Quinta, Sexta, S�bado, Domingo}: ");
		diaSemana = ler.next();
		System.out.print(
				"Digite o n�mero do tipo de ferramenta desejado: \n 1 - Ferramentas Novas \n 2 - Ferramentas Comuns \n");
		tipoFerramenta = ler.nextInt();
		if ((diaSemana.equals("Segunda") || diaSemana.equals("Ter�a") || diaSemana.equals("Quinta"))
				&& tipoFerramenta == 1) {
			System.out.println("Desconto de 25%");
		} else if ((diaSemana.equals("Segunda") || diaSemana.equals("Ter�a") || diaSemana.equals("Quinta"))
				&& tipoFerramenta == 2) {
			System.out.println("Desconto de 40%");
		} else if ((diaSemana.equals("Quarta") || diaSemana.equals("Sexta") || diaSemana.equals("S�bado"))
				&& tipoFerramenta == 1) {
			System.out.println("Acr�scimo de 15%");
		} else if ((diaSemana.equals("Quarta") || diaSemana.equals("Sexta") || diaSemana.equals("S�bado"))
				&& tipoFerramenta == 2) {
			System.out.println("Pre�o Normal");
		}

	}
}

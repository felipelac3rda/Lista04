import java.util.Scanner;

public class questao02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String diaSemana;
		int tipoFerramenta;
		System.out.print("Digite o dia da semana desejado entre {Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo}: ");
		diaSemana = ler.next();
		System.out.print(
				"Digite o número do tipo de ferramenta desejado: \n 1 - Ferramentas Novas \n 2 - Ferramentas Comuns \n");
		tipoFerramenta = ler.nextInt();
		if ((diaSemana.equals("Segunda") || diaSemana.equals("Terça") || diaSemana.equals("Quinta"))
				&& tipoFerramenta == 1) {
			System.out.println("Desconto de 25%");
		} else if ((diaSemana.equals("Segunda") || diaSemana.equals("Terça") || diaSemana.equals("Quinta"))
				&& tipoFerramenta == 2) {
			System.out.println("Desconto de 40%");
		} else if ((diaSemana.equals("Quarta") || diaSemana.equals("Sexta") || diaSemana.equals("Sábado"))
				&& tipoFerramenta == 1) {
			System.out.println("Acréscimo de 15%");
		} else if ((diaSemana.equals("Quarta") || diaSemana.equals("Sexta") || diaSemana.equals("Sábado"))
				&& tipoFerramenta == 2) {
			System.out.println("Preço Normal");
		}

	}
}

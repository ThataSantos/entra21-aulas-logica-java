package br.com.entra21.aula10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aprendendo sobre WHILE e DO WHILE

		System.out.println("\t0 -sair\n\t1 - while\n\t2 - Do-while");
		System.out.println("Escolha uma opção");
		// instanciando um objeto da classe Scanner e ja utilizando o metodo next
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "socorro": // um comando pra encerrar o programa mas que só o programador sabe
			System.exit(1);

		case "0", "sair":
			System.out.println("Escolheu sair");
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("opção invalida");
			main(null);
			break;
		}

	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos Aprender DO WHILE Aqui");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Exitiam dois dogs o PITA e o REPITA,PITA morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equalsIgnoreCase("repita"));
		System.out.println("Entendeu né? :D");

		byte dia;
		do {
			System.out.println("Informe o dia do seu aniversario");
			dia = entrada.nextByte();
		} while (dia < 1 || dia > 31);// repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenha errado muito...");

		byte mes;
		byte contador = 0;
		do {
			System.out.println(contador + "erros até o momento");
			System.out.println("Informe o dia do seu aniversario ex(1 até 31)");
			dia = entrada.nextByte();
			System.out.println("Informe o mês do seu aniversario ex(1 até 12)");
			mes = entrada.nextByte();
			contador++;
		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);
		System.out.println("Finalmente vc digitou certo" + dia + "/" + mes + "mas tbm errou" + --contador);
		System.out.println(contador);
		main(null);
	}

	private static void aprenderWhile() {
		System.out.println("Vamos Aprender WHILE Aqui");

		byte contagem = 1;
		while (contagem <= 10) {// condição de permanencia/// enquanto contagem for igual ou menor a 10 execute
			System.out.println("contando " + contagem);
			contagem++;
		}
		// para fazer uma repetição com base em quantidades é gerado muito codigo
		System.out.println("Acabei!");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar um repetição?");
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("sim")) {
			System.out.println("vc respondeu: " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while combase em decisão");

		main(null);

	}

}

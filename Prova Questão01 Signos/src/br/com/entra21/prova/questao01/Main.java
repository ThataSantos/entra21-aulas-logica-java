package br.com.entra21.prova.questao01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA 01
		// Crie um programa que informe o signo do usu�rio
		// Capturar nome , dia e m�s de anivers�rio
		// Criar constante para numero limite do dia do m�s, no caso 31
		// Se
		// o dia for maior que o limite = Informar o valor limite para um dia do m�s
		// Sen�o
		// escolher o m�s correspondente para fazer as valida��es especificas
		// nesse m�s existe esse dia?
		// com base no dia do m�s qual � o signo
		// m�s invalido
		
		System.out.println("Descubra seu Signo");
		int mes;
		int dia;
		nomeusuario();
		mes = opcaomes();
		dia = opcaodia(mes);
		signoverificador(dia, mes);
	}

	public static void signoverificador(int dia, int mes) {

		if ((mes == 3 && (dia >= 21 && dia <= 31)) || (mes == 4 && dia <= 20)) {
			System.out.println("Seu signo � �ries");
		} else if ((mes == 4 && (dia >= 21 && dia <= 30)) || (mes == 5 && dia <= 20)) {
			System.out.println("Seu signo � Touro");
		} else if ((mes == 5 && (dia >= 21 && dia <= 31)) || (mes == 6 && dia <= 20)) {

			System.out.println("Seu signo � GEMEOS");
		} else if ((mes == 6 && (dia >= 21 && dia <= 30)) || (mes == 7 && dia <= 22)) {

			System.out.println("Seu signo � CANCER");
		} else if ((mes == 7 && (dia >= 23 && dia <= 31)) || (mes == 8 && dia <= 22)) {

			System.out.println("Seu signo � LE�O");
		} else if ((mes == 8 && (dia >= 23 && dia <= 31)) || (mes == 9 && dia <= 22)) {

			System.out.println("Seu signo � virgem");
		} else if ((mes == 9 && (dia >= 23 && dia <= 30)) || (mes == 10 && dia <= 22)) {

			System.out.println("Seu signo � LIBRA");
		} else if ((mes == 10 && (dia >= 23 && dia <= 31)) || (mes == 11 && dia <= 21)) {

			System.out.println("Seu signo � ESCORPI�O");
		} else if ((mes == 11 && (dia >= 22 && dia <= 30)) || (mes == 12 && dia <= 21)) {

			System.out.println("Seu signo � SAGIT�RIO");
		} else if ((mes == 12 && (dia >= 22 && dia <= 31)) || (mes == 1 && dia <= 20)) {

			System.out.println("Seu signo � CAPRIC�RNIO");
		} else if ((mes == 1 && (dia >= 21 && dia <= 31)) || (mes == 2 && dia <= 18)) {

			System.out.println("Seu signo � AQU�RIO");
		} else if ((mes == 2 && (dia >= 19 && dia <= 29)) || (mes == 3 && dia <= 20)) {

			System.out.println("Seu signo � PEIXES");
		}

	}

	public static void nomeusuario() {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Infome seu nome");
		nome = entrada.nextLine();
		nome = nome.toLowerCase();
		System.out.println("Voc� informou " + nome);

	}

	public static Integer opcaomes() {
		int mes;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Escolha uma op��o para o m�s do seu aniversario");
		System.out.println("1- Janeiro");
		System.out.println("2- Fevereiro");
		System.out.println("3- Mar�o");
		System.out.println("4- Abril");
		System.out.println("5- Maio");
		System.out.println("6- Junho");
		System.out.println("7- Julho");
		System.out.println("8- Agosto");
		System.out.println("9- Setembro");
		System.out.println("10- Outubro");
		System.out.println("11- Novembro");
		System.out.println("12- Dezembro");
		mes = entrada2.nextByte();
		switch (mes) {
		case 1: {
			mes = 1;
			System.out.println("Voc� escolheu Janeiro");

		}
			break;
		case 2: {
			mes = 2;
			System.out.println("Voc� escolheu Fevereiro");

		}
			break;
		case 3: {
			mes = 3;
			System.out.println("Voc� escolheu Mar�o");

		}
			break;
		case 4: {
			mes = 4;
			System.out.println("Voc� escolheu Abril");

		}
			break;
		case 5: {
			mes = 5;
			System.out.println("Voc� escolheu Maio");

		}
			break;
		case 6: {
			mes = 6;
			System.out.println("Voc� escolheu Junho");

		}
			break;
		case 7: {
			mes = 7;
			System.out.println("Voc� escolheu Julho");

		}
			break;
		case 8: {
			mes = 8;
			System.out.println("Voc� escolheu Agosto");

		}
			break;
		case 9: {
			mes = 9;
			System.out.println("Voc� escolheu Setembro");

		}
			break;
		case 10: {
			mes = 10;
			System.out.println("Voc� escolheu Outubro");

		}
			break;
		case 11: {
			mes = 11;
			System.out.println("Voc� escolheu Novembro");

		}
			break;
		case 12: {
			mes = 12;
			System.out.println("Voc� escolheu Dezembro");

		}
			break;
		default:
			System.out.println("M�s Invalido");
			opcaomes();
		}
		return (mes);
	}

	public static Integer opcaodia(int mes) {
		int dia;
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Informe o dia do seu aniversario");
		dia = entrada3.nextByte();
		if ((dia >= 1) && (dia <= 31)) {
			if (mes == 2 && dia > 28) {
				System.out.println("Dia invalido " + mes + " tem 28 dias, insira um dia valido.");
				opcaodia(mes);
			} else if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && dia > 30) {
				System.out.println("Dia invalido " + mes + " tem 30 dias, insira um dia valido.");
				opcaodia(mes);
			}

		} else {
			System.out.println("Dia invalido");
			opcaodia(mes);
		}
		return (dia);

	}

}
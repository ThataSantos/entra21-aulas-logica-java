package br.com.entra21.aula09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre for");
		// contador 1
		for (int contador1 = 1; contador1 <= 10; contador1 += 1) {

			System.out.println("Repetindo" + contador1);
			System.out.println("-------");
		}
		// contador 2
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo" + contador);
			// System.out.println("contador1");
			// não é possível usar a variavel contador1 pois ela só existe no outro escopo
			// do for
		}
		// contador 3
		for (int contador = 4; contador <= 10; contador += 2) {
			System.out.println("repetindo" + contador);

		}
		// contador 4
		for (int contador = 10; contador > 1; contador -= 1) {
			System.out.println("repetindo" + contador);
		}
		// contador 5 tabuada

		int numero = 3;
		int contador;

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada" + contador + "x" + numero + "=" + (contador * numero));

		}
		System.out.println("olha como o contador ficou:" + contador);

		// contador 6 tabuada
		int numero2 = 5;
		int contador2;

		for (contador2 = 1; contador2 <= 10; contador2++) {
			System.out.println("Tabuada" + contador2 + "x" + numero2 + "=" + (contador2 * numero2));

		}
		System.out.println("olha como o contador ficou:" + contador2);
	}
}

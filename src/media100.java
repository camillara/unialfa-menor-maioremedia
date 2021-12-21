import java.util.Scanner;

public class media100 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int soma = 0;
		double media = 0;
		int[] v = new int[20];
		int contador = 1;
		int pv = 0;

		while (pv < v.length) {
			System.out.printf("Informe o %dº número inteiro: ", contador);
			v[pv] = leia.nextInt();
			contador++;
			pv++; // laço While
		} // fim while

		// média
		for (int i = 0; i < v.length; i++) {
			soma = v[i];
			media = media + soma;
			soma = 0;
		} // fim for

		System.out.println();
		media = media / v.length;
		System.out.printf("A média dos números informados é %.2f", media);

		System.out.println();

		// contar quantos menor que a média
		int tme = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) {
				tme++;
			} // fim if
		} // fim for

		// vetor menor que a média
		int[] menor = new int[tme];
		pv = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) { // vai comparar se o valor do vetor analisado é menor que o valor armazenado na
								// varivável.
				menor[pv] = v[i];
				pv++; // laço for
			} // fim if
			else {
				pv = pv;
			}
		} // fim do for

		// contar quantos maior que a média
		int tma = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] >= media) {
				tma++;
			} // fim if

		} // fim for

		// vetor menor que a média
		int[] maior = new int[tma];
		pv = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= media) { // vai comparar se o valor do vetor analisado é menor que o valor armazenado na
									// varivável.
				maior[pv] = v[i];
				pv++; // laço for
			} // fim if
			else {
				pv = pv;
			}
		} // fim do for

		// imprimir menor
		contador = 1;
		System.out.println();
		System.out.println("===IMPRIMINDO MENOR QUE A MÉDIA===");
		for (int i = 0; i < menor.length; i++) {
			System.out.println(contador + "º número " + " " + menor[i]);
			contador++;
		} // fim for

		// imprimir maior
		contador = 1;
		System.out.println();
		System.out.println("===IMPRIMINDO MAIOR E IGUAL A MÉDIA===");
		for (int i = 0; i < maior.length; i++) {
			System.out.println(contador + "º número " + " " + maior[i]);
			contador++;
		} // fim for

		leia.close();

	}

}
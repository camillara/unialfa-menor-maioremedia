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
			System.out.printf("Informe o %d� n�mero inteiro: ", contador);
			v[pv] = leia.nextInt();
			contador++;
			pv++; // la�o While
		} // fim while

		// m�dia
		for (int i = 0; i < v.length; i++) {
			soma = v[i];
			media = media + soma;
			soma = 0;
		} // fim for

		System.out.println();
		media = media / v.length;
		System.out.printf("A m�dia dos n�meros informados � %.2f", media);

		System.out.println();

		// contar quantos menor que a m�dia
		int tme = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) {
				tme++;
			} // fim if
		} // fim for

		// vetor menor que a m�dia
		int[] menor = new int[tme];
		pv = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) { // vai comparar se o valor do vetor analisado � menor que o valor armazenado na
								// variv�vel.
				menor[pv] = v[i];
				pv++; // la�o for
			} // fim if
			else {
				pv = pv;
			}
		} // fim do for

		// contar quantos maior que a m�dia
		int tma = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] >= media) {
				tma++;
			} // fim if

		} // fim for

		// vetor menor que a m�dia
		int[] maior = new int[tma];
		pv = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= media) { // vai comparar se o valor do vetor analisado � menor que o valor armazenado na
									// variv�vel.
				maior[pv] = v[i];
				pv++; // la�o for
			} // fim if
			else {
				pv = pv;
			}
		} // fim do for

		// imprimir menor
		contador = 1;
		System.out.println();
		System.out.println("===IMPRIMINDO MENOR QUE A M�DIA===");
		for (int i = 0; i < menor.length; i++) {
			System.out.println(contador + "� n�mero " + " " + menor[i]);
			contador++;
		} // fim for

		// imprimir maior
		contador = 1;
		System.out.println();
		System.out.println("===IMPRIMINDO MAIOR E IGUAL A M�DIA===");
		for (int i = 0; i < maior.length; i++) {
			System.out.println(contador + "� n�mero " + " " + maior[i]);
			contador++;
		} // fim for

		leia.close();

	}

}
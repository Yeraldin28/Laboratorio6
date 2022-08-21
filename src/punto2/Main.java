
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL �REA DE UN TRI�NGULO\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declaran las variables y el objeto a usar
		double lado1, lado2, lado3, perimetro, area;
		int repetir = 0;
		Triangulo triangulo = new Triangulo();

		do {
			// Se le pide al usuario los lados del tri�ngulo y compruebo si se cumple la
			// desigualdad triangular
			do {
				if (repetir == 1) {
					System.out.print("\n\n\tIngresa medidas que esten bien\n\n");
				} else {
					System.out.print("\n\n\tIngresa los lados del tri�ngulo\n\n");
				}
				
				System.out.print("\tPrimer lado: ");
				lado1 = triangulo.comprobarLados(Double.parseDouble(in.readLine()));

				System.out.print("\tSegundo lado: ");
				lado2 = triangulo.comprobarLados(Double.parseDouble(in.readLine()));

				System.out.print("\tTercer lado: ");
				lado3 = triangulo.comprobarLados(Double.parseDouble(in.readLine()));

				repetir = 1;
			} while (triangulo.desigualdadTriangular(lado1, lado2, lado3) == false);

			// Se declara el objeto con las medidas
			triangulo = new Triangulo(lado1, lado2, lado3);

			// Se calcula el perimetro y el �rea
			perimetro = triangulo.perimetro(lado1, lado2, lado3);
			area = triangulo.area(lado1, lado2, lado3, perimetro);

			// Se muestran los datos del tri�ngulo
			System.out.print("\n\tEl per�metro y �rea del tri�ngulo con lados: " + triangulo.getLado1() + ", "
					+ triangulo.getLado2() + ", " + triangulo.getLado3() + ", son:\n\tPer�metro: " + perimetro
					+ "\n\t�rea: " + area);

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}


package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL LADO DE UN TRI�NGULO\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declaran las variables y el objeto a usar
		double lado1, lado2, lado3, anguloEnRadianes = 0, anguloEnGrados = 0;
		int repetir;
		Triangulo triangulo = new Triangulo();

		do {

			// Se le pide al usuario los datos del tri�ngulo
			System.out.print("\n\n\tIngresa los datos del tri�ngulo\n\n");

			System.out.print("\tPrimer lado: ");
			lado1 = triangulo.comprobarLados(Double.parseDouble(in.readLine()));

			System.out.print("\tSegundo lado: ");
			lado2 = triangulo.comprobarLados(Double.parseDouble(in.readLine()));

			// Se pregunta en que sistema va a ingresar el �ngulo
			System.out
					.print("\n\tEn qu� medida vas a ingresar el �ngulo? \n\t1. Radianes \n\t2. Grados \n\tDecision: ");
			repetir = Integer.parseInt(in.readLine());

			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}

			System.out.print("\n\t�ngulo: ");
			switch (repetir) {
			case 1:
				anguloEnRadianes = Double.parseDouble(in.readLine());
				anguloEnGrados = Math.toDegrees(anguloEnRadianes);
				anguloEnGrados = triangulo.comprobarAngulo(anguloEnGrados);
				anguloEnRadianes = Math.toRadians(anguloEnGrados);
				break;
			case 2:
				anguloEnGrados = Double.parseDouble(in.readLine());
				anguloEnRadianes = Math.toRadians(anguloEnGrados);
				anguloEnGrados = triangulo.comprobarAngulo(anguloEnGrados);
				anguloEnRadianes = Math.toRadians(anguloEnGrados);
				break;
			}
			

			
			
			// Se declara el objeto con las medidas
			triangulo = new Triangulo(lado1, lado2, anguloEnRadianes);

			// Se calcula el perimetro y el �rea
			lado3 = triangulo.ladoRestante(lado1, lado2, anguloEnRadianes);

			// Se muestran los datos del tri�ngulo
			System.out.print("\n\tEl lado restante del tri�ngulo con lados: " + triangulo.getLado1() + ", "
					+ triangulo.getLado2() + " y �ngulo: " + anguloEnGrados + "� es:\n\tEs: " + lado3);

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

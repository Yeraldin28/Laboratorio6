
package punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LA SUPERFICIE Y VOLUMEN DE UNA ESFERA \n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se declaran las variables y el objeto a usar
		double volumen, superficie, radio;
		int repetir;

		do {
			// Se le pide al usuario el radio de la esfera
			System.out.print("\n\n\tIngresa el radio de la esfera: ");
			radio = Double.parseDouble(in.readLine());

			if (radio < 0) {
				while (radio < 0) {
					System.out.print("\n\tEscribe un n�mero que sea mayor que cero: ");
					radio = Double.parseDouble(in.readLine());
				}
			}

			// Se declara el objeto con las medidas
			Esfera esfera = new Esfera(radio);

			// Se calcula el volumen y la superificie
			superficie = esfera.superficie();
			volumen = esfera.volumen();

			// Se muestran los datos de la esfera
			esfera.imprimir();
			System.out.print("\n\tEl volumen: " + volumen + "\n\tLa superifcie: " + superficie);

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

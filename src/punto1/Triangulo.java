
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// Se declaran los atributos
	private double lado1;
	private double lado2;
	private double angulo;

	// Se declara el m�todo constructor por default
	public Triangulo() {

	}

	// Se declara el m�todo constructor con par�metros
	public Triangulo(double lado1, double lado2, double angulo) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.angulo = angulo;
	}

	// Se definen el m�todo get y set de las variables privadas
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	// M�todo para calcular el lado que falta
	public double ladoRestante(double lado1, double lado2, double angulo) {
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2) - (2 * lado1 * lado2 * Math.cos(angulo)));
	}
	//

	// M�todo para comprobar que los lados no son negativos
	public double comprobarLados(double lado) throws NumberFormatException, IOException {
		if (lado <= 0) {
			while (lado <= 0) {
				System.out.print("\n\n\tEscribe un n�mero que no sea negativo, ni cero: ");
				lado = Double.parseDouble(in.readLine());
			}
		}
		return lado;
	}

	// M�todo para comprobar que el �ngulo no sea mayor que 90�
	public double comprobarAngulo(double angulo) throws NumberFormatException, IOException {
		if (angulo <= 0 || angulo >= 180) {
			while (angulo <= 0  || angulo >= 180 ) {
				System.out.print("\n\n\tEscribe un �ngulo valido en grados: ");
				angulo = Double.parseDouble(in.readLine());
			}
		}
		return angulo;
	}
}
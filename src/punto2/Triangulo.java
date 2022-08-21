
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// Se declaran los atributos
	private double lado1;
	private double lado2;
	private double lado3;

	// Se declara el m�todo constructor por default
	public Triangulo() {

	}

	// Se declara el m�todo constructor con par�metros
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	// M�todo para comprobar que los lados esten bien ingresados
	public boolean desigualdadTriangular(double lado1, double lado2, double lado3) {
		if (lado1 + lado2 > lado3 && lado2 + lado3 >= lado1 && lado3 + lado1 >= lado2) {
			return true;
		} else {
			return false;
		}
	}

	// M�todo para calcular el per�metro
	public double perimetro(double lado1, double lado2, double lado3) {
		return lado1 + lado2 + lado3;
	}

	// M�todo para calcular el �rea
	public double area(double lado1, double lado2, double lado3, double perimetro) {
		double s = perimetro / 2;
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

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
}
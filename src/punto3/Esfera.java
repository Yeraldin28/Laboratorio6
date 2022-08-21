
package punto3;

public class Esfera {

	// Se declaran los atributos
	private double radio;

	// Se declara el m�todo constructor por default
	public Esfera() {
		this.radio = 1;
	}

	// Se declara el m�todo constructor con par�metros
	public Esfera(double radio) {
		this.radio = radio;
	}

	// Se definen el m�todo get y set de las variables privadas
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// M�todo para calcular el volumen
	public double volumen() {
		return (4 * Math.PI * Math.pow(radio, 3)) / 3;
	}

	// M�todo para calcular la superficie
	public double superficie() {
		return (4 * Math.PI * Math.pow(radio, 2));
	}

	// M�todo para imprimir la informacion de la esfera
	public void imprimir() {
		System.out.print("\n\tEl radio de la esfera es: " + radio);
	}
}
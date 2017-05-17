package maximo;

public class Maximo {

	public double maximoElementoArray(double[] array) {
		double maior = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
}

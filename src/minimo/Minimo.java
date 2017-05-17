package minimo;

public class Minimo {

	public double minimoElementoArray(double[] array) {
		double menor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}
}

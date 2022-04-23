package domain;

public class Ordenadora {
	public static void ordenar(Comparable[] array) {
		int i,j;
		Comparable aux;
		for(i=0;i<array.length -1;i++) {
			for (j = 0; j < array.length - i - 1; j++) {                                                              
                if (array[j + 1].compareTo(array[j]) < 0) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
			}
		}
	}
}

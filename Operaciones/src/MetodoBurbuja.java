public class MetodoBurbuja {
/**
 * Método que ordena un arreglo de enteros de menor a mayor
 * @param arreglo Arreglo de enteros a ordenar
 * @return Arreglo de enteros ordenado
 */
    int[] ordenamientoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

/**
 * Método que ordena un arreglo de cadenas de texto de menor a mayor
 * @param arreglo Arreglo de cadenas de texto a ordenar
 * @return Arreglo de cadenas de texto ordenado
 * */

    String[] ordenamientoBurbuja(String[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {
                String elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
        return arreglo;
    }
}


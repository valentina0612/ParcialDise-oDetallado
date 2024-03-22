public class MetodoBurbuja {
/**
 * Método que ordena un arreglo de enteros de menor a mayor
 * @param numeros Arreglo de enteros a ordenar
 * @return Arreglo de enteros ordenado
 */
    int[] ordenamientoBurbuja(int[] numeros) {
        boolean intercambio;
        do {
            intercambio = false;
            for (int indice = 0; indice < numeros.length - 1; indice++) {
                if (numeros[indice] > numeros[indice + 1]) {
                    int numeroTemporal = numeros[indice];
                    numeros[indice] = numeros[indice + 1];
                    numeros[indice + 1] = numeroTemporal;
                    intercambio = true;
                }
            }
        } while (intercambio);
        return numeros;
    }


/**
 * Método que ordena un arreglo de cadenas de texto de menor a mayor
 * @param nombres Arreglo de cadenas de texto a ordenar
 * @return Arreglo de cadenas de texto ordenado
 * */

    String[] ordenamientoBurbuja(String[] nombres) {
        boolean intercambio;
        do {
            intercambio = false;
            for (int indice = 0; indice < nombres.length - 1; indice++) {
                String elementoActual = nombres[indice];
                String elementoSiguiente = nombres[indice + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    nombres[indice] = elementoSiguiente;
                    nombres[indice + 1] = elementoActual;
                    intercambio = true;
                    }
                }
            } while (intercambio);
            return nombres;
        }

}


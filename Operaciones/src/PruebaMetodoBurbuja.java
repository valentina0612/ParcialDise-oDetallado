import java.util.Arrays;

public class PruebaMetodoBurbuja {
    /**
     * Método que prueba el método de la burbuja
     * @return void
     */
    public void pruebaMetodoBurbuja(){
        int x[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(x));

        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        metodoBurbuja.ordenamientoBurbuja(x);

        System.out.println("Después del método de la burbuja: " + Arrays.toString(x));
        String[] nombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(nombres));
        metodoBurbuja.ordenamientoBurbuja(nombres);
        System.out.println("Después del método de la burbuja: " + Arrays.toString(nombres));
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuOpciones();

        System.out.println("Ingresa una opción:");
        Scanner opcion = new Scanner(System.in);
        try {
            int numeroOpcion = opcion.nextInt();
            while (numeroOpcion != 4) {
                switch (numeroOpcion) {
                    case 1:
                        PruebaMetodoBurbuja prueba = new PruebaMetodoBurbuja();
                        prueba.pruebaMetodoBurbuja();
                        break;
                    case 2:
                        System.out.println("Ingrese el número para saber si es primo o no");
                        Scanner numero = new Scanner(System.in);
                        NumerosPrimos numeroPrimo = new NumerosPrimos();
                        System.out.println(numeroPrimo.esPrimo(numero.nextInt()));
                        break;
                    case 3:
                        System.out.println("Ingrese los 4 números double de la operación:");
                        Scanner numeros = new Scanner(System.in);
                        double numero1 = numeros.nextDouble();
                        double numero2 = numeros.nextDouble();
                        double numero3 = numeros.nextDouble();
                        double numero4 = numeros.nextDouble();
    
                        OperacionMatematica operacion = new OperacionMatematica();
                        System.out.println("El resultado de la operación es: " + operacion.calcularResultadoOperacion(numero1, numero2, numero3, numero4));
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            menu.menuOpciones();   
            System.out.println("Ingresa una opción:");
            opcion = new Scanner(System.in);
            numeroOpcion = opcion.nextInt();
            }
            } catch (InputMismatchException e) {
            System.out.println("**Error:** Ingresaste un caracter no válido. Debe ingresar un número entero.");
            }

    System.out.println("La ejecución del sistema ha terminado");
    }
}

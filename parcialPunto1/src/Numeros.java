import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entradaOpcion, entradaNumero;
        int opcion, numero;

        Menu menu = new Menu();
        menu.menuOpciones();

        entradaOpcion = bufer.readLine();
        opcion = Integer.parseInt(entradaOpcion);

        System.out.println("Escriba el número: ");
        entradaNumero = bufer.readLine();
        numero = Integer.parseInt(entradaNumero);
        
        switch (opcion) {
            case 1:{
                NumeroPerfecto numeroPerfecto = new NumeroPerfecto();
                System.out.println(numeroPerfecto.esNumeroPerfecto(numero));
            }
            break;
            case 2:{
                NumeroDefectivo numeroDefectivo = new NumeroDefectivo();
                System.out.println(numeroDefectivo.esNumeroDefectivo(numero));
            }
            break;
            case 3: {
                NumeroAbundante numeroAbundante = new NumeroAbundante();
                System.out.println( numeroAbundante.esNumeroAbundante(numero));
            }
            break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

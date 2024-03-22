public class NumeroPerfecto {
/**
 * Este método determina si un número es perfecto.
 * @param numero El número a evaluar.
 * @return Un mensaje indicando si el número es perfecto o no.
 */
public String esNumeroPerfecto(int numero){
    int suma = 0;
    int contador = 0;
    for (contador= numero-1; contador>=1; contador--){
        if (numero%contador == 0){
            suma += contador;
        }                  
    }
    if (numero==suma){
        return ("El número: " + numero + " es perfecto");
    }
    else{
        return ("El número: " + numero + " NO es perfecto");
    }  
}
}

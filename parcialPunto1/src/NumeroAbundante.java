public class NumeroAbundante {
    /**
     * Este método determina si un número es abundante.
     * @param numero El número a evaluar.
     * @return Un mensaje indicando si el número es abundante o no.
     */
    public String esNumeroAbundante(int numero){
        int suma = 0;
        int contador = 0;
    
        for (contador=numero; contador>1; contador--){
            if (suma < 2 * numero)
                if (numero % contador == 0)
                    suma += contador;
        }
        if (suma > 2 * numero){
            return("El numero: " + numero + " es abundante");
        }     
        else{
            return("El numero: " + numero + " NO es abundante");
        }
    }
}

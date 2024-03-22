public class NumerosPrimos {
    /**
     * Método que determina si un número es primo o no
     * @param numero Número a evaluar
     * @return true si el número es primo, false en caso contrario
     */
    public String esPrimo(int numero){
        if(numero % 2 == 0){
            return "El número " + numero + " no es primo";
        }
        else{
            return "El número " + numero + " es primo";
        }
    }
}

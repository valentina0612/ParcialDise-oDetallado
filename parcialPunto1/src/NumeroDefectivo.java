public class NumeroDefectivo {
    /**
     * Este método determina si un número es defectivo.
     * @param numero El número a evaluar.
     * @return Un mensaje indicando si el número es defectivo o no.
     */
    public String esNumeroDefectivo(int numero){
        int suma = 0;
        int contador = 0;
        for (contador=numero-1; contador>=1; contador--){
            if (numero % contador == 0){
                suma += contador;
            } 
        }
        if (numero > suma){
            return("El numero:" + numero + " es defectivo");
        }
            
        else{
            return("El numero: " + numero + " NO es defectivo");
        }  
    }
}
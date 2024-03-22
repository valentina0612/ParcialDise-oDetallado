public class OperacionMatematica {
/**
 * Método que calcula el resultado de una operación matemática
 * @param numero1 Primer número de la operación
 * @param numero2 Segundo número de la operación
 * @param numero3 Tercer número de la operación
 * @param nuemro4 Cuarto número de la operación
 * @return Resultado de la operación
*/
    public double calcularResultadoOperacion(double numero1, double numero2, double numero3, double nuemro4) {
    double resultado;
    resultado = ((numero1 + numero2) * (numero3 - nuemro4)) / (numero1 * nuemro4);
    return resultado;
}
}

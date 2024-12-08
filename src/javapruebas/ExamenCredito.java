//@author Martin
package javapruebas;
import java.util.Scanner;
 
public class ExamenCredito {
    
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        double saldoFinal, saldoInicial, puntos, equivPuntos;
        final double VALOR_PUNTOS = 0.12;
        //entrada
        System.out.println("Ingrese el saldo inicial: ");
        saldoInicial = sc.nextDouble();

        System.out.println("Ingrese los puntos acumulados: ");
        puntos = sc.nextDouble();
        //proceso
        equivPuntos = puntos * VALOR_PUNTOS;
        saldoFinal = saldoInicial + equivPuntos;
        //salida
        System.out.println("Sus puntos acumulados equivalen a: " + equivPuntos);
        System.out.println("Despues de aplicar los puntos acumulados su saldo es de: " + saldoFinal);
    }
}

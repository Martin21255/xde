/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Examen2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double radio,altura,volumenCono;
        //
        System.out.println("Ingrese el radio del cono: ");
        radio = lector.nextDouble();
        
        System.out.println("Ingrese la altura del cono: ");
        altura = lector.nextDouble();
        //
        
        volumenCono = Math.PI*Math.pow(radio, 2)*altura/3;
        System.out.println("El volumen del cono es: " + volumenCono);
        
        
    }
    
}

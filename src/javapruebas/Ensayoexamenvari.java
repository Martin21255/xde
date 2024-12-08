/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapruebas;

/**
 *
 * @author Martin
 */
public class Ensayoexamenvari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z, a, b;
        x = 3.0 / 2.0 + 10.0 - 3.0;
        y = 7;
        z = 8 * 2 / 8 + Math.pow(2, 8);
        a = x * y + 1 - (z % y * 4);
        b = Math.sqrt((a) + z) * 2 / 25;
        System.out.println("Valor de x: " + x
                + "\n Valor de y: " + y
                + "\n Valor de z: " + z 
                + "\n Valor de a: " + a
                + "\n Valor de b: " + b);

    }

}

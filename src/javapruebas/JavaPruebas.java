/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapruebas;

/**
 *
 * @author Martin
 */
public class JavaPruebas {

    public static int recursiva(int n){
        return recursiva2(1);
    }
    
    public static int recursiva2(int n){
    return recursiva(2);
    }
    
    
       public static void main(String[] args) {
           System.out.println("Hola"+ recursiva(1));
    }
    
}

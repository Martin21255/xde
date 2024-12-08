/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapruebas;
import java.util.Scanner;

public class Constantes {
    
    
    public static char funcionprueba(){
        return '%';
    }
    
    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);

       //aka 
       
        int n;
        
        System.out.println("Ingresa un numero: ");
        n = lector.nextInt();
        
        if(n == 13){
        
            System.out.println("Entre mas me la mamas mas me crece" + funcionprueba());
        
        }
                
        else{
        
            System.out.println("Ojo cuidao" + funcionprueba());
        
        }
        
    }
    
}

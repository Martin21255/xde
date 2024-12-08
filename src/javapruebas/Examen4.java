/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapruebas;
import java.util.Arrays;
/**
 *
 * @author Martin
 */
public class Examen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = {54,26,92,17,77,31,44,55,20,14};
        int auxiliar;
        
        System.out.println("Impresion del arreglo DESORDENADO");
        System.out.println(Arrays.toString(lista));
        
        for(int i=0;i<lista.length;i++){
            for(int j=0;j<lista.length-1;j++){
                if(lista[j]>lista[j+1]){
                    auxiliar = lista [j+1];
                    lista[j+1]=lista[j];
                    lista[j]=auxiliar;
                    
                }
            
            }
        
        }
        
        System.out.println("Impresion del arreglo ordenado de forma ASCENDENTE:");
        System.out.println(Arrays.toString(lista));
        
        
        int[] salarios ={2550,7890,6605,10900,8925,6350,7524};
        for(int salario: salarios){
            System.out.println(salario);
            String [][] matriz = new String [8][12];
           
        }
        
         String [] arreglo={"1","2","3","4","5","6","7"};
                  System.out.println(Arrays.toString(arreglo));
            
    }
    
}

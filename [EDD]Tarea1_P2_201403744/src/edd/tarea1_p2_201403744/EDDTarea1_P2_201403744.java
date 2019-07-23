/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea1_p2_201403744;
import java.util.Scanner;
public class EDDTarea1_P2_201403744 {

    void Metodo(int num){
        
        boolean primo [] = new boolean[num + 1];
        for (int i = 0; i<num ; i++)
            primo[i] = true;
        
        for (int j = 2 ; j *j <= num ; j ++){
            
            if (primo[j] == true){
                
                for (int i = j*2; i <= num ; i+=j){
                    
                    primo[i] = false;
                }
            }
        }
         System.out.println("Numeros primos menores o igual a: " + num);
        for (int i = 2; i <= num ; i++){
            if (primo[i] == true){
               
                System.out.println(i + " ");
            }
        }
        
        
    }
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = teclado.nextInt();
        EDDTarea1_P2_201403744 main = new EDDTarea1_P2_201403744();
        main.Metodo(n);
       
    }
    
  
    
}

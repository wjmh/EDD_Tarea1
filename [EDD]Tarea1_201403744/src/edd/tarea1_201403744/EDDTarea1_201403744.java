/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea1_201403744;
import java.util.Scanner;
public class EDDTarea1_201403744 {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año,  semana, contadorS, contadorM, fecha;
        int  i = 0;
        int j = 0;
        int z = 0;
        int contadorA = 0;
        int añoBi = 0;
        System.out.print("Ingrese el dia: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        año = teclado.nextInt();
        semana = 0;
        
        if ((año /100)%4 == 1 ){
            contadorS = semana +5;
            
        }else if ((año /100)%4 == 2 ){
            contadorS = semana +3;
            
        }else if ((año /100)%4 == 3 ){
            contadorS = semana +1;
            
        }else if ((año /100)%4 == 2 ){
            contadorS = semana + 0;
            
        }else {
            
            contadorS = 0;
            i = 0;
            j = 0;
            añoBi = (año%100) + ((año%100)/4);
            z = 0;
            
        }
        
        if (año % 400 == 0 && año %100 != 0 && año %4 == 0){
            
            if (mes == 1 || mes == 2){
                    
                    i = j - 1;
                    }else {
            
            i = j +0;
        }
        }
        
        if (mes == 8){
            
            contadorM = z +1;
        }else if (mes == 2 || mes == 3 || mes == 11){
            contadorM = z +2;
        }else if (mes == 6){
            contadorM = z +3;
        }else if (mes == 9 || mes == 12 ){
            contadorM = z +4;
        }else if (mes == 4 || mes == 7 ){
            contadorM = z +5;
        }else if (mes == 1 || mes == 10 ){
            contadorM = z +5;
        }else {
            
            contadorM = z + 0;
            
        }
               
        fecha = contadorS + z + j + añoBi + contadorM + dia + i;
        
        if (fecha %7 == 1){
            System.out.println("Lunes");
        }else if (fecha %7 == 2){
            System.out.println("Martes");
        }else if (fecha %7 == 3){
            System.out.println("Miercoles");
        }else if (fecha %7 == 4){
            System.out.println("Jueves");
        }else if (fecha %7 == 5){
            System.out.println("Viernes");
        }else if (fecha %7 == 6){
            System.out.println("Sabado");
        }else {
            System.out.println("Domingo");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_estherhernandez_ingridhernandez;

import java.util.Scanner;

/**
 *
 * @author incah
 */
public class Lab4P2_EstherHernandez_IngridHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        boolean centinela = true;
        
        while(centinela == true){
            System.out.println("==============Menu=================");
            System.out.println("1)Jugar Ajedrez ");
            System.out.println("2)Salir");
            System.out.println("===================================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                
                case 1:{
                    char[][] tablero = new char[9][9];
                    
                    System.out.println("Ingrese en nombre del Jugador1: ");
                    String jug1 = lea.next();
                    System.out.println("Ingrese en nombre del Jugador2: ");
                    String jug2 = lea.next();
                    
                }//fin del case 1
                break;
                
                case 2:
                    centinela = false;
                 break;
           
                default:
           System.out.println("Opcion Incorrecta");
            }//fin del switch
        }//fin while
        
    }
    public static char[][] tablero(char[][]matriz){
        
                matriz[0][0]='8';
                matriz[1][0]='7';
                matriz[2][0]='6';
                matriz[3][0]='5';
                matriz[4][0]='4';
                matriz[5][0]='3';
                matriz[6][0]='2';
                matriz[7][0]='1';
                matriz[8][0]='A';
                matriz[8][1]='B';
                matriz[8][2]='C';
                matriz[8][3]='D';
                matriz[8][4]='E';
                matriz[8][5]='F';
                matriz[8][6]='G';
                matriz[8][7]='H';
         
        
        
        
        return matriz;
    }
    
}

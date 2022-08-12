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
                    
                    System.out.println("");
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
    
}

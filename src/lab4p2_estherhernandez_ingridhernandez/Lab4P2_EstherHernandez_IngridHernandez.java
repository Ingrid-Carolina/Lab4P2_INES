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
                    char[][] tablero1 = new char[9][9];
                    
                    System.out.println("Ingrese en nombre del Jugador1: ");
                    String jug1 = lea.next();
                    System.out.println("Ingrese en nombre del Jugador2: ");
                    String jug2 = lea.next();
                    tablero1 = tablero(tablero1);
                    MatrizRecursiva(tablero1,0,0);
                    System.out.println();
                    System.out.println("Ingrese  coordenadas del jugador 1");
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
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              matriz [i][j] = ' ';  
            }
            
        }
                matriz[0][0]='8';
                matriz[1][0]='7';
                matriz[2][0]='6';
                matriz[3][0]='5';
                matriz[4][0]='4';
                matriz[5][0]='3';
                matriz[6][0]='2';
                matriz[7][0]='1';
                matriz[8][1]='A';
                matriz[8][2]='B';
                matriz[8][3]='C';
                matriz[8][4]='D';
                matriz[8][5]='E';
                matriz[8][6]='F';
                matriz[8][7]='G';
                matriz[8][8]='H';
                
                //Piezas blancas
                matriz[0][1]='r';
                matriz[0][2]='n';
                matriz[0][3]='b';
                matriz[0][4]='q';
                matriz[0][5]='k';
                matriz[0][6]='b';
                matriz[0][7]='n';
                matriz[0][8]='r';
                matriz[1][1]='p';
                matriz[1][2]='p';
                matriz[1][3]='p';
                matriz[1][4]='p';
                matriz[1][5]='p';
                matriz[1][6]='p';
                matriz[1][7]='p';
                matriz[1][8]='p';
                
                //piezas negras
                matriz[7][8]='R';
                matriz[7][7]='N';
                matriz[7][6]='B';
                matriz[7][5]='Q';
                matriz[7][4]='K';
                matriz[7][3]='B';
                matriz[7][2]='N';
                matriz[7][1]='R';
                matriz[6][1]='P';
                matriz[6][2]='P';
                matriz[6][3]='P';
                matriz[6][4]='P';
                matriz[6][5]='P';
                matriz[6][6]='P';
                matriz[6][7]='P';
                matriz[6][8]='P';
                
                

        return matriz;
    }
    
        public static void MatrizRecursiva(char[][] tablero, int fil, int col) {
     if (fil == tablero .length - 1 && col == tablero[0].length - 1) {
            System.out.print("[" + tablero[fil][col] + "]" + "   ");
        } else {
            if (col == tablero[0].length - 1) {
                System.out.println("[" + tablero[fil][col] + "]");
                MatrizRecursiva(tablero, fil + 1, 0);
            } else {
                System.out.print("[" + tablero[fil][col] + "]" + "        ");
                MatrizRecursiva(tablero, fil, col + 1);
            }
            
        }
    }
    
}

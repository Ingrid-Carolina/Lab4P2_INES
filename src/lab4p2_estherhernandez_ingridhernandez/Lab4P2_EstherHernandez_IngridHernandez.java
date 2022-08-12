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
 static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
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
                    String color;
                    System.out.println("Ingrese en nombre del Jugador1: ");
                    String jug1 = lea.next();
                    System.out.println("Ingrese en nombre del Jugador2: ");
                    String jug2 = lea.next();
                    tablero1 = tablero(tablero1);
                    MatrizRecursiva(tablero1,0,0);
                    System.out.println();
                    System.out.println("Piezas");
                    System.out.println("Peon = p\nCaballo = n\nAlfil = b\nTorre = r\nDama = q\nRey = k");
                    System.out.println("Ingrese  coordenadas del jugador 1(Piezas blancas parte inferior del tablero)");
                    color = "blanco";
                    System.out.println("Ingrese la pieza que desea mover(ejemplo: R): ");
                    char pieza = lea.next().charAt(0);
                    boolean v = blancas(pieza);
                    while(v == false){
                        System.out.println("pieza no le pertence, ingrese de nuevo: ");
                        pieza = lea.next().charAt(0);
                        v = blancas(pieza);
                    }
                    //----------------------------------------------------------------
                    System.out.println("Ingrese La letra de la fila donde esta la pieza:");
                    char letrap = lea.next().charAt(0);
                    fila(letrap);
                    int p2 = fila(letrap);
                    System.out.println("Ingrese el numero de la columna donde esta la pieza:");
                    int p1 = lea.nextInt();
                    while(p1<1||p1>8){
                        System.out.println("Numero invalido, intente de nuevo:");
                        p1 = lea.nextInt();
                    }
                    //----------------------------------------------------------------
                    System.out.println("Ingrese La letra de la fila a donde desea mover la pieza:");
                    char letra = lea.next().charAt(0);
                    fila(letra);
                    int y = fila(letra);
                    System.out.println("Ingrese el numero de la columnaa donde desea mover la pieza:");
                    int x = lea.nextInt();
                    while(x<1||x>8){
                        System.out.println("Numero invalido, intente de nuevo:");
                        x = lea.nextInt();
                    }
                    tablero1 = movimiento(p1,p2,pieza,x,y,tablero1,color);
                    MatrizRecursiva(tablero1,0,0);
                    //Jugador 2
                    
                    System.out.println("Ingrese  coordenadas del jugador 2(Piezas negras parte superior del tablero)");
                    color = "negro";
                    System.out.println("Ingrese la pieza que desea mover(ejemplo: r): ");
                    char pieza1= lea.next().charAt(0);
                    boolean v1 = negras(pieza1);
                    while(v1 == false){
                        System.out.println("pieza no le pertence, ingrese de nuevo: ");
                        pieza1 = lea.next().charAt(0);
                        v = negras(pieza1);
                    }
                    System.out.println("Ingrese La letra de la fila:");
                    char letra1 = lea.next().charAt(0);
                    fila(letra1);
                    int y1 = fila(letra1);
                    System.out.println("Ingrese el numero de la columna:");
                    int x1 = lea.nextInt();
                    while(x1<1||x1>8){
                        System.out.println("Numero invalido, intente de nuevo:");
                        x1 = lea.nextInt();
                    }
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
            System.out.print("[" + tablero[fil][col] + "]" + "  ");
        } else {
            if (col == tablero[0].length - 1) {
                System.out.println("[" + tablero[fil][col] + "]");
                MatrizRecursiva(tablero, fil + 1, 0);
            } else {
                System.out.print("[" + tablero[fil][col] + "]" + "  ");
                MatrizRecursiva(tablero, fil, col + 1);
            }
            
        }
    }
    public static boolean blancas( char pieza){
        boolean blanca;
        if (pieza=='P'||pieza=='N'||pieza=='B'||pieza=='R'||pieza=='Q'||pieza=='K') {
            return true;
        }
        else{
            
            return false;
        }

    }
    public static boolean negras( char pieza){
        boolean negra;
        if (pieza=='p'||pieza=='n'||pieza=='b'||pieza=='r'||pieza=='q'||pieza=='k') {
            return true;
        }
        else{
            
            return false;
        }

    }
    public static int fila( char letra){
        int y= 0;
        if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f' || letra == 'g' || letra == 'h') {
            if (letra == 'a') {
                y = 1;
            }
            if (letra == 'b') {
                y = 2;
            }
            if (letra == 'c') {
                y = 3;
            }
            if (letra == 'd') {
                y = 4;
            }
            if (letra == 'e') {
                y = 5;
            }
            if (letra == 'f') {
                y = 6;
            }
            if (letra == 'g') {
                y = 7;
            }
            if (letra == 'h') {
                y = 8;
            }
        } else {
            while(y==0){
            System.out.println("fila no existe intente de nuevo: ");
            letra = lea.next().charAt(0);
            }
        }
        return y;
    }
    //public
    public static char [][] movimiento(int p1, int p2,char tipo,int x,int y, char [][]tablero, String color){
        boolean validar;
      
            if(tipo == 'p' || tipo =='P'){
                peon p = new peon(x,y,p1,p2,color,tipo,tablero);System.out.println("000000000000000000000000");
               
                validar = p.ValidarMovimiento(); System.out.println(validar);
                if (validar == true) {
                    tablero[x][y]= tipo;
                    tablero[p1][p2]= ' ';
                }
                else{
                    System.out.println("Movimiento no valido. ");
                }
            }
            return tablero;
        }
    }
        


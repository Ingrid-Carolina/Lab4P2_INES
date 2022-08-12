
package lab4p2_estherhernandez_ingridhernandez;

import java.awt.Color;

/**
 *
 * @author incah
 */
public abstract class Pieza implements  ValidarM {
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Pieza() {
    }
    
    public char [][]tablero = new char[9][9];
    public void MatrizRecursiva(char[][] tablero, int fil, int col) {
     if (fil == tablero .length - 1 && col == tablero[0].length - 1) {
            System.out.print("[" + tablero[fil][col] + "]" + "        ");
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

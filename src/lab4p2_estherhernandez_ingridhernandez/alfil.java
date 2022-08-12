/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_estherhernandez_ingridhernandez;

/**
 *
 * @author incah
 */
public class alfil extends Pieza{

   
    public alfil() {
        super();
        
    }

    public alfil(int x1, int y1, int p1, int p2, String color, char tipo, char[][] tablero) {
        super(x1, y1, p1, p2, color, tipo, tablero);
    }
    

    @Override
    public void ValidarMovimiento() {
        if (color == "negro") {
            if (tablero[x1][y1]==' '&& ((p1+1==x1)&& (p2+1==y1))) {
           
            tablero[x1][y1]= tipo;
            tablero[p1][p2]= ' ';
        }
    }
        }
        

        
}
    


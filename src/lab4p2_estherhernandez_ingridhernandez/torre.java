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
public class torre extends Pieza{

    public torre() {
        super();
    }

    public torre(int x1, int y1, int p1, int p2, String color, char tipo, char[][] tablero) {
        super(x1, y1, p1, p2, color, tipo, tablero);
    }

    @Override
    public boolean ValidarMovimiento() {
            if (p1==x1||p2==y1) {
                return true;
            }
            else{
                return false;
            }
    }
    
}

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
public class peon extends Pieza {

    public peon() {
        super();
        
    }

    public peon(int x1, int y1, int p1, int p2, String color, char tipo, char[][] tablero) {
        super(x1, y1, p1, p2, color, tipo, tablero);
    }

    

    @Override
    public boolean ValidarMovimiento() {
        boolean mov = false;
        if (color == "negro") {
            if (tablero[x1][y1]==' '&& ((p1+1==x1)&& (p2+1==y1))) { 
                mov =  true;
            }
            else{
                System.out.println("La pieza no puede moverse");
                mov= false;
               
            }
           
        }
        if (color == "blanco") {
            if (tablero[x1][y1]==' '&& ((p1-1==x1)&& (p2-1==y1))) {
            mov = true;
            }
            else{
                mov = false;
            }
        }
        return mov;
        }
    
}


package lab4p2_estherhernandez_ingridhernandez;

import java.awt.Color;

/**
 *
 * @author incah
 */
public abstract class Pieza implements  ValidarM {
    public int x1;
    public int y1;
    public int p1;
    public int p2;
    public String color;
    public char tipo;
    public char [][] tablero;

    public Pieza() {
    }

    public Pieza(int x1, int y1, int p1, int p2, String color, char tipo, char[][] tablero) {
        this.x1 = x1;
        this.y1 = y1;
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
        this.tipo = tipo;
        this.tablero = tablero;
    }

   

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Pieza{" + "x1=" + x1 + ", y1=" + y1 + ", p1=" + p1 + ", p2=" + p2 + ", color=" + color + ", tipo=" + tipo + ", tablero=" + tablero + '}';
    }

   
    
    
    
}

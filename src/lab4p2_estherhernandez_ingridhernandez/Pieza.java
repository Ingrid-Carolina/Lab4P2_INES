
package lab4p2_estherhernandez_ingridhernandez;

import java.awt.Color;

/**
 *
 * @author incah
 */
public abstract class Pieza implements  ValidarM {
    public int x1;
    public int y1;
    public String color;
    public char tipo;
    

    public Pieza() {
    }

    public Pieza(int x1, int y1, String color, char tipo) {
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
        this.tipo = tipo;
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

   

    @Override
    public String toString() {
        return "Pieza{" + "x1=" + x1 + ", y1=" + y1 + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}

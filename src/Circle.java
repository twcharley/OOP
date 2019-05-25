import java.awt.*;
import java.awt.font.GraphicAttribute;

public class Circle {
    private int x;
    private int y;
    public Circle(int x, int y){
        this.x=x ;
        this.y=y;

    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(x,y,10,10);
    }
}

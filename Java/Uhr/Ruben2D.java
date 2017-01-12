
/**
 * Write a description of class Ruben2D here.
 * 
 * @author Ruben 
 * @version 0
 */
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class Ruben2D extends Frame
{
    //definition der Wichtigen Variablen
    public int uhrX = 150, uhrY = 150, uhrSize = 100;
    public int zeigerX1 = uhrX + uhrSize*(1/2), zeigerY1 = uhrX + uhrSize*(1/2);
    public int zeigerX2 = uhrX + uhrSize, zeigerY2 = uhrY + uhrSize;
    public int zeigerRot = 0;//ZeigerRotation
    


    
    public Ruben2D()
    {
        // initialise instance variables
        this.addWindowListener(new MyFinishWindow());
    }
    
    
    public void paint(Graphics g){
        //Graphics 2d objekt wird aus g erschaffen
        Graphics2D g2d = (Graphics2D) g;


        AffineTransform transRect = new AffineTransform();
        AffineTransform transLine = new AffineTransform();
        //AffineTransform transCircle = new AffineTransform();

        Rectangle2D.Double rect = new Rectangle.Double(uhrX, uhrY, uhrSize, uhrSize);
        g2d.draw(rect);
        Shape transShape1 = transRect.createTransformedShape(rect);


        Line2D.Double line = new Line2D.Double(zeigerX1, zeigerY1, zeigerX2, zeigerY2);
        g2d.draw(line);
        Shape transShape2 = transLine.createTransformedShape(line);

        for(int i = 0; i <= 4000; i++){
            g2d.clearRect(0,0, 1300, 1300);
            transRect.translate(1, 0);
            transShape1 = transRect.createTransformedShape(rect);
            

            
            
            g2d.draw(transShape2);
            g2d.draw(transShape1);
        }
    }
    
    public void main()
    {
        Ruben2D f = new Ruben2D();
        f.setTitle("Übungen in Java 2D Grafik - Grundlegende Begriffe und Objekte");
        f.setSize(1000,1000);
        f.setVisible(true);
    }
}
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.lang.*;
import java.awt.event.*;
import java.awt.color.*;
/**
 * Class JPaint - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class JPaint extends JApplet
{
    int x, y;
    
    
    BorderLayout bl = new BorderLayout();
    
    JPanel back     = new JPanel(bl);
    Jpanel color    = new Jpanel();
    
    Random rand     = new Random();
    Canvas can      = new Canvas();
    
    TextField thik  = new TextField("Thikness");
    
    MouseAdapter ma = new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint();
        }
        
    };
    MouseMotionAdapter mm = new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent e){
            x = e.getX();
            y = e.getY();
            col = color.getText();
            repaint();
        }
        
    };
    
    
    public void init()
    {
       this.setLayout(bl);
       
       this.add(color, bl.NORTH);

       back.add(can);
       this.add(back, bl.CENTER);
       //this.add(thik,  bl.NORTH);
       this.addMouseListener(ma);
       this.addMouseMotionListener(mm);
    }

    
    public void paint(Graphics g)
    {
        col.toLowerCase();
        
        
        g.fillOval(x,y,2,2);
    }
        
}

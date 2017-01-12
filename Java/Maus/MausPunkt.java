
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

/**
 * Class MausPunkt - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class MausPunkt extends JApplet implements MouseListener, MouseMotionListener
{
    
    BorderLayout bl = new BorderLayout();
    JPanel back = new JPanel(bl);
    Canvas malfläche = new Canvas();

    int x = 0;
    int y = 0;
    
    
    public void init()
    {
       this.setLayout(bl);
       this.add(back);
       back.add(malfläche);
       addMouseListener(this);
    }
    
    public void paint(Graphics g){
        g.fillRect(x, y, 30, 30);
    }
    
    public void mouseDragged(MouseEvent e){
        
        repaint();
    }
    
    public void mouseMoved(MouseEvent e){
        
    }
    
    public void mouseClicked(MouseEvent e){
        x = e.getX();
        y = e.getY();
        repaint();
        }
        
    public void mousePressed(MouseEvent e){
    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    

}

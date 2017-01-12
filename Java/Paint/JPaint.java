
import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.lang.*;
/**
 * Class JPaint - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class JPaint extends JApplet
{
    // instance variables - replace the example below with your own
    int randint;
    int x, y;
    int z;
    int px, py;
    int u = 0;
    
    BorderLayout bl = new BorderLayout();
    JPanel back = new JPanel(bl);
    Random rand = new Random();
 
    
    
    int ax = rand.nextInt(500);
    int ay = rand.nextInt(500);
    
    int bx= rand.nextInt(500);
    int by = rand.nextInt(500);
    
    int cx = rand.nextInt(500);
    int cy = rand.nextInt(500);
    
    
    public void init()
    {
       this.setLayout(bl);
    }

    public void paint(Graphics g)
    {
        
        
        g.fillOval(cx, cy, 4, 4);
        g.fillOval(ax, ay, 4, 4);
        g.fillOval(bx, by, 4, 4);

        
        px = rand.nextInt(500);
        py = rand.nextInt(500);
        
       for (int o = 0; o <= 1000; o++){
           ax++;
           ay--;
    
           //bx++;
           //by++;
    
           cx++;
           cy--;
           
           g.clearRect(0,0, 2000, 1000);
           for (int i = 0; i <= 5000; i++){
                
                u  = rand.nextInt(3);
            
                switch(u){
                    case 0:
                        x = (px + ax)/2;
                        y = (py + ay)/2;
                        break;
                   
                        case 1:
                        x = (px + bx)/2;
                        y = (py + by)/2;
                        break;
                    
                        case 2:
                        x = (px + cx)/2;
                        y = (py + cy)/2;
                        break;
                }       
                
                g.fillOval(px, py, 2, 2);
                g.fillOval(x, y, 2, 2);
                px = x;
                py = y;
            }
        }        
    }
}

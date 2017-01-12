
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.TextArea;
import java.lang.Math.*;

/**
 * Class Rechner - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Rechner extends JApplet
{
    // instance variables - replace the example below with your own
    BorderLayout bl = new BorderLayout();
    GridLayout gl = new GridLayout(1,4, 10, 10);
    
    Button ok = new Button("ok");
    
    //Choice op = new Choice();
    
    TextField op1 = new TextField("");
    TextField op2 = new TextField("");
    
    public double x;
    public double y;
    char op;

    TextArea Ergebnis = new TextArea("", 5, 10, TextArea.SCROLLBARS_VERTICAL_ONLY);
    
    Panel rechner = new Panel();
    
    public double wurzel(){
        double z = 0;
        if(x == 2){
            z = Math.sqrt(y);
        }
        if(x==3){
            z = Math.cbrt(y);
        }
        return z;
    }
    
    public double berr(){
        String eingabe = op1.getText();
        int opIndex = 0;
        double z = 0;

        if(eingabe.contains("+")){
            opIndex = eingabe.indexOf("+");
            op = +;
            x = Double.parseDouble(eingabe.substring(0, opIndex-1));
            y = Double.parseDouble(eingabe.substring(opIndex + 1, lenght()));
            z = x + y;
        }
        if(eingabe.contains("-")){
            opIndex = eingabe.indexOf("-");
            op = -;
            x = Double.parseDouble((eingabe.substring(0, opIndex)));
            y = Double.parseDouble(eingabe.substring(opIndex + 1, lenght()));
            z = y - y;
        }
        if(eingabe.contains("*")){
            opIndex = eingabe.indexOf("*");
            op = *;
            x = Double.parseDouble((eingabe.substring(0, opIndex)));
            y = Double.parseDouble(eingabe.substring(opIndex + 1, lenght()));
            z = x * y;
        }
        if(eingabe.contains("/")){
            opIndex = eingabe.indexOf("/");
            op = /;
            x = Double.parseDouble((eingabe.substring(0, opIndex)));
            y = Double.parseDouble(eingabe.substring(opIndex + 1, lenght()));
            z = x / y;
        }
        int runden = z*1000;
        z = runden/10000;
        return z;
    }

    /*public double berechnung(){
        String a = op1.getText();
        String b = op2.getText();
        
        x = Double.parseDouble(a);
        y = Double.parseDouble(b);
        
        double z = 0;
        
        
        
        switch(op.getSelectedIndex()){
            case 0: z = x+y;
            break;
            case 1: z = x-y;
            break;
            case 2: z = x*y;
            break;
            case 3: z = x/y;
            break;
            case 4: z = wurzel();
            break;
        }
        return z;
        
    }
    */
    ActionListener act = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Ergebnis.append("\n--------------------------------------------------------");
            Ergebnis.append("\n\t= " + berr());
            Ergebnis.append("\n--------------------------------------------------------");
        }
        
    };
    
    
    public void init()
    {
        this.setLayout(bl);
        
        op.add("+");
        op.add("-");
        op.add("*");
        op.add("/");
        op.add("√");
        
        rechner.setLayout(gl);
        rechner.add(op1);
        rechner.add(op);
        rechner.add(op2);
        rechner.add(ok);
        
        ok.addActionListener(act);
        
        this.add(rechner, bl.NORTH);
        this.add(Ergebnis);
    }
        
}

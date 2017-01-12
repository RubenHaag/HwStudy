
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Icafe extends JApplet{
    double kaffee = 1.20;
    int kaffeeZähler = 0;
    double kaffeeGesamtpreis = 0.0;
    
    double coke = 1.20;
    int cokeZähler = 0;
    double cokeGesamtpreis = 0.0;
    
    double sprite = 1.20;
    int spriteZähler = 0;
    double spriteGesamtpreis = 0.0;
    
    double preis = 0.0;

    GridLayout gl = new GridLayout(4, 2, 30, 10);//gl für GridLayout
    
    Color cor = new Color(255, 0, 0);
    
    JButton kaffeeBut = new JButton("Kaffee");
    Label kaffeeLabel = new Label(""+kaffeeZähler+" Tasse\n Kaffe kosten "+kaffee+"€");
    ActionListener kaffeeListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            kaffeeZähler++;
            kaffeeGesamtpreis = kaffee * kaffeeZähler;
            kaffeeLabel.setText(kaffeeZähler+" Tassen kaffee "+ kaffeeGesamtpreis + "€");
        }
    };
    
    JButton cokeBut = new JButton("Coke");        
    Label cokeLabel = new Label(""+cokeZähler+" Gläser kosten "+coke+"€");
    ActionListener cokeListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            cokeZähler++;
            cokeGesamtpreis = coke * cokeZähler;
            cokeLabel.setText(cokeZähler+" Gläser coke "+ cokeGesamtpreis + "€");
        }
    };

    JButton spriteBut = new JButton("sprite");
    Label spriteLabel = new Label(""+spriteZähler+" Gläser sprit kosten "+sprite+"€");
    ActionListener spriteListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            spriteZähler++;
            spriteGesamtpreis = sprite * spriteZähler;
            spriteLabel.setText(spriteZähler+" Gläser sprite "+ spriteGesamtpreis + "€");
        }
    };
    
    JButton preisBut = new JButton("Rechnung");
    Label preisLabel = new Label(" Die Zeche Kostet "+preis+"€");
    
    
    public void init(){
        this.setLayout(gl);
        this.setBackground(cor);
        
        this.add(kaffeeBut);//kaffeBut wir 
        this.add(kaffeeLabel);
        kaffeeBut.addActionListener(kaffeeListener);

        this.add(cokeBut);//kaffeBut wir 
        this.add(cokeLabel);
        cokeBut.addActionListener(cokeListener);
        
        this.add(spriteBut);//kaffeBut wir 
        this.add(spriteLabel);
        spriteBut.addActionListener(spriteListener);
        
        this.add(preisBut);//kaffeBut wir 
        this.add(preisLabel);
    }
}


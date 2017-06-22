import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.TextArea;

public class View extends JApplet implements ActionListener{ 
	//Registerelemente
	Register r = new Register(100);
	
	//UI Elemente:
    BorderLayout bl = new BorderLayout(); 
    FlowLayout fl = new FlowLayout();
    TextField suche = new TextField("Suche");
    Panel nord = new Panel();
    TextArea anzeige = new TextArea("", 10, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
    Button ok = new Button("Ok");
    Button aus = new Button("Alles ausgeben");
    Choice ch = new Choice();
    
    ActionListener actSuch = new ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e){
        	anzeige.append("\n---------------------------------------------------------\n");
        	String ein = suche.getText();
        	switch(ch.getSelectedIndex()){
        	case 0:
        		Verkehrssuendiger ergeb = (Verkehrssuendiger) r.suchen(ein);
        		if(ergeb != null){
        			String name = ergeb.getName();
        			String addresse = ergeb.getAdresse();
        			int punkte = ergeb.getPunkte();
        			anzeige.append("Name: " + name + "\nAdresse: " + addresse + "\nPunkte: "+ punkte + "\n");
        		}
        		break;
        	case 1: 
        		anzeige.append(r.loeschen(ein) + "\n");
        		break;
        		
        	case 2:
        		anzeige.append(r.einfügen(ein));
        		break;
        	}
        }
    };
    ActionListener ausListener = new ActionListener(){
    	public void actionPerformed(java.awt.event.ActionEvent e){
        	anzeige.append("\n---------------------------------------------------------\n");    		
    		anzeige.append(r.ausgabe());
    	}
    };
    public void init()
    {
    	ch.add("Suchen");
    	ch.add("Löschen");
    	ch.add("Einfügen");
    	
        this.setLayout(bl);
        nord.setLayout(fl);
        nord.add(suche);
        nord.add(ch);
        nord.add(ok);
        ok.addActionListener(actSuch);
        aus.addActionListener(ausListener);
        
        
        this.add(nord, bl.NORTH);
        this.add(anzeige);
        this.add(aus, bl.SOUTH);
    }
}

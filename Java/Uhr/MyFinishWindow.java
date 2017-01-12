import java.awt.event.*;
// Diese Klasse wird zum Fensterschliessen verwendet.

public class MyFinishWindow extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
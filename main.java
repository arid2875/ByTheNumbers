import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class main {
	 public static void main(String args[])
     {
         MainMenuGUI a = new MainMenuGUI();
         a.setVisible(true);
         a.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) { System.exit(0); }
           });
         
     }

}

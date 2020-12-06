import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
	    JFrame fenetre = new JFrame();
	    fenetre.setLocation(100, 100);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	Formes f = new Formes();
		fenetre.add(f);
		fenetre.pack();
	    fenetre.setVisible(true);
  }
}
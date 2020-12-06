import javax.swing.*;
import java.awt.*;
import java.awt.Font;     // pour mettre en gras le texte
 
public class Formes extends JComponent {
  Image cercles;
  public Formes(){
  	super();
  	this.setPreferredSize(new Dimension(400,200));
  	cercles = Toolkit.getDefaultToolkit().getImage("cercles.png");
  }
  @Override
  public void paintComponent(Graphics pinceau){
    Graphics secondPinceau = pinceau.create();
    secondPinceau.setColor(Color.BLUE);
    secondPinceau.drawRect(0,0,50,50);

    secondPinceau.setColor(Color.GREEN);
    secondPinceau.fillOval(100,0,25,25);

    secondPinceau.setColor(new Color(255,0,255));
    //secondPinceau.setFont(Font.BOLD);
    //contentArea.setFont(contentArea.getFont().deriveFont(Font.BOLD)); 
    Font police = new Font("Tahoma", Font.BOLD, 24);
    secondPinceau.setFont(police);
    secondPinceau.drawString(">0<",170,16);

    secondPinceau.drawImage(cercles, 250, 0, this);
  }
}

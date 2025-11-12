package testingFont;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Serif 20 bold",20,30);
        g.setFont(new Font("Moonspaced",Font.ITALIC,24));
        g.drawString("Moonspaced 24 point italic",20,50);
        g.setFont(new Font("SansSerif",Font.PLAIN,14));
        g.drawString("SansSerif 14 point italic",20,70);
        g.setColor(Color.RED);
        g.drawString("point bold italic",20,90);
    }
}

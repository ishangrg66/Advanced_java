package Lab_3_JSlider;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel{
    private int diameter = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(10,10,diameter,diameter);
    } // end method paintComponent

    public void setDiameter(int newDiameter)
    {
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint(); // repaint panel
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(200,200);
    }
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}

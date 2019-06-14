/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fill(new Rectangle(0,0, 1000, 1205));
        g2.setColor(Color.black);
        g2.draw(new Rectangle(150,175, 100, 125));
        g2.setColor(new Color(244,212,135));
        g2.fill(new Rectangle(150,175, 100, 125));
        int y = 10;
        g2.setColor(Color.black);
        for (int x = 0; x < 15; x++)
        {
            g2.drawLine(150,150+y,250,180+y);
            y += 10;

        }
        int r = 10;
        for (int t = 0; t < 15; t++)
        {
            g2.drawLine(150,180+r,250,150+r);
            r += 10;
        }
        g2.setColor(Color.white);
        g2.fill(new Rectangle(145,100, 110, 75));
        g2.fill(new Rectangle(145,300, 110, 75));
        g2.setColor(Color.pink);
        g2.fill(new Ellipse2D.Double(137,70,120,130));
        g2.setColor(new Color(244,212,135));
        g2.fill(new Rectangle(129,150, 140, 50));
        g2.setColor(Color.black);
        g2.draw(new Rectangle(129,150, 140, 50));
    }

    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));

        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(150,300,250,300);
            g2.drawString("" + x, x, 10);
        }

        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
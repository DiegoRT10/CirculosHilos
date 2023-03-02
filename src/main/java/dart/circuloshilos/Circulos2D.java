/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dart.circuloshilos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Diego Ramos
 */
public class Circulos2D extends JPanel implements Runnable{

    private int x1 = 100;
    private int y1 = 100;
    private int x2 = 200;
    private int y2 = 200;
    private int y1Direction = 1;
    private int y2Direction = -1;

    public Circulos2D() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x1, y1, 50, 50);
        g.setColor(Color.BLUE);
        g.fillOval(x2, y2, 50, 50);
        
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            y1 += y1Direction;
            y2 += y2Direction;

            if (y1 <= 0 || y1 >= getHeight() - 50) {
                y1Direction *= -1;
            }

            if (y2 <= 0 || y2 >= getHeight() - 50) {
                y2Direction *= -1;
            }

            repaint();
    }
    }
    
    }
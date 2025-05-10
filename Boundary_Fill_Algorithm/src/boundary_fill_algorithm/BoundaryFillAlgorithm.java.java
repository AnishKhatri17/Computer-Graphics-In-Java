/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundary_fill_algorithm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
class Anish {
public static class BoundaryFillAlgorithm extends JPanel 
{
    final int boundaryColor = Color.red.getRGB();
    final int fillColor = Color.green.getRGB();
    BufferedImage image;
    Graphics2D g2d;

    BoundaryFillAlgorithm() {
        image = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
        setPreferredSize(new Dimension(220, 220));
        setMinimumSize(getPreferredSize());
        g2d = image.createGraphics();
        g2d.setColor(Color.red);
        g2d.clearRect(0, 0, 250, 250);
        g2d.drawOval(50, 50, 90, 90);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
                boundaryFill(e.getX(), e.getY(), image.getRGB(e.getX(), e.getY()));
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public void boundaryFill(int seedX, int seedY, int targetColor) {
        int currentColor = image.getRGB(seedX, seedY);
        if (currentColor != boundaryColor && currentColor != fillColor && currentColor == targetColor) {
            image.setRGB(seedX, seedY, fillColor);
            repaint();
            boundaryFill(seedX, seedY - 1, targetColor);
            boundaryFill(seedX, seedY + 1, targetColor);
            boundaryFill(seedX - 1, seedY, targetColor);
            boundaryFill(seedX + 1, seedY, targetColor);
        }
    }
}
    public static void main(String args[]) {
        System.out.print("\n\nJava Program by Anidh Khatri - Boundary_fill_algorithm\n\n");
        JFrame frame = new JFrame("Boundary fill algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoundaryFillAlgorithm b = new BoundaryFillAlgorithm();
        frame.add(b);
        frame.pack();
        frame.setVisible(true);
    }
}


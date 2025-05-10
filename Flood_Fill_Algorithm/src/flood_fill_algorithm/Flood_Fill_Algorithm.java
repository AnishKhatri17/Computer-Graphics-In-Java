/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flood_fill_algorithm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flood_Fill_Algorithm {

    public static class FloodFill extends JPanel implements MouseListener {
        final int targetColor = Color.blue.getRGB();
        BufferedImage image;
        Graphics2D g2d;

        FloodFill() {
            image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
            setPreferredSize(new Dimension(200, 200));
            setMinimumSize(getPreferredSize());
            g2d = image.createGraphics();
            g2d.setBackground(Color.BLACK);
            g2d.setColor(Color.red);
            g2d.clearRect(0, 0, 450, 450);
            g2d.setColor(Color.blue);
            g2d.fillOval(40, 40, 60, 60);
            addMouseListener(this);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        }

        public void floodFill(int seedX, int seedY, int rgb) {
            if (image.getRGB(seedX, seedY) == targetColor) {
                image.setRGB(seedX, seedY, Color.red.getRGB());
                repaint();

                floodFill(seedX, seedY - 1, rgb);
                floodFill(seedX, seedY + 1, rgb);
                floodFill(seedX - 1, seedY, rgb);
                floodFill(seedX + 1, seedY, rgb);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            floodFill(e.getX(), e.getY(), image.getRGB(e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static void main(String args[]) {
        
        System.out.println("\n\nJava Program by Anish Khatri : Line Drawing Algorithm. ");
        JFrame frame = new JFrame("Flood fill algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FloodFill fill = new FloodFill();
        frame.add(fill);
        frame.pack();
        frame.setVisible(true);
    }
}



 


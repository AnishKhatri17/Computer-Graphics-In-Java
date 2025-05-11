/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bresenham_line_drawing_algorithm;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.util.Scanner;
public class Bresenham_Line_Drawing_Algorithm {
    
    public static class Bresenham extends Frame {
        Scanner sc = new Scanner(System.in);
        int x, y, k;
        double dx, dy, p;
        int x1, y1, x2, y2;

        public Bresenham() {
            setTitle("Bresenham line drawing algorithm");
            setSize(600, 600);

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });

            System.out.println("\n\n\tJava Program by Anish Khatri - Bresenham line drawing algorithm");
            System.out.print("Enter the coordinate of line : ");
            System.out.print("Enter the x1 coordinate of line : ");
            x1 = sc.nextInt();
            System.out.println("Enter the y1 coordinate of line : ");
            y1 = sc.nextInt();
            System.out.println("Enter the x2 coordinate of line : ");
            x2 = sc.nextInt();
            System.out.println("Enter the y2 coordinate of line : ");
            y2 = sc.nextInt();

            dx = Math.abs(x2 - x1);
            dy = Math.abs(y2 - y1);
            x = x1;
            y = y1;
            p = 2 * dy - dx;
            setVisible(true);
            repaint();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.fillOval((int) x, (int) y, 7, 8);
            for (k = 0; k < dx; k++) {
                if (p < 0) {
                    g.fillOval(x++, y, 7, 8);
                    p = p + (2 * dy);
                } else {
                    g.fillOval(x++, y++, 7, 8);
                    p = p + (2 * (dy - dx));
                }
            }
        }
    }

    public static void main(String args[]) {
        new Bresenham().setVisible(true);
    }
}

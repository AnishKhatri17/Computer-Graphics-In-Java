/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scaling_practical;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Scaling_Practical extends Frame {
    int a, b, c, d;
    int sx, sy;
    int w, x, y, z;

    public Scaling_Practical() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nJava Program by Anish Khatri : Scaling\n");
        System.out.println("Enter the coordinates of rectangle:");
        System.out.print("Enter the x1 coordinate: ");
        a = sc.nextInt();
        System.out.print("Enter the y1 coordinate: ");
        b = sc.nextInt();
        System.out.print("Enter the x2 coordinate: ");
        c = sc.nextInt();
        System.out.print("Enter the y2 coordinate: ");
        d = sc.nextInt();
        System.out.print("Enter the scale value of x: ");
        sx = sc.nextInt();
        System.out.print("Enter the scale value of y: ");
        sy = sc.nextInt();

        w = a * sx;
        x = b * sy;
        y = c * sx;
        z = d * sy;

        setVisible(true);
        setSize(600, 600);
        setTitle("Scaling");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Before Scaling", a + 10, b + 10);
        g.drawRect(a, b, c - a, d - b); // Use the width and height to draw rectangle
        g.drawRect(w, x, y - w, z - x); // Use the width and height to draw rectangle
        g.drawString("After Scaling", w + 10, x + 10);
    }

    public static void main(String args[]) {
        new Scaling_Practical();
    }
}

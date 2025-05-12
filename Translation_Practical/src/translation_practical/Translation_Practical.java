/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package translation_practical;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Translation_Practical extends Frame {
    int a, b, c, d;
    int tx, ty;
    int w, x, y, z;

    public Translation_Practical() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Java Program by Anish Khatri : Translation.\n");
        System.out.println("Enter the coordinates of line :");
        System.out.print("Enter the x1 coordinate : ");
        a = sc.nextInt();
        System.out.print("Enter the y1 coordinate : ");
        b = sc.nextInt();

        System.out.print("Enter the x2 coordinate : ");
        c = sc.nextInt();
        System.out.print("Enter the y2 coordinate : ");
        d = sc.nextInt();
        System.out.print("Enter the translation value of x : ");
        tx = sc.nextInt();
        System.out.print("Enter the translation value of y : ");
        ty = sc.nextInt();
        w = a + tx;
        x = b + ty;
        y = c + tx;
        z = d + ty;
        setVisible(true);
        setSize(400, 400);
        setTitle("Line drawing");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Before Translation", a + 10, b + 10);
        g2d.drawRect(a, b, c - a, d - b); // Use the width and height to draw rectangle
        g2d.drawRect(w, x, y - w, z - x); // Use the width and height to draw rectangle
        g2d.drawString("After Translation", w + 10, x + 10);
    }

    public static void main(String args[]) {
        new Translation_Practical();
    }
}

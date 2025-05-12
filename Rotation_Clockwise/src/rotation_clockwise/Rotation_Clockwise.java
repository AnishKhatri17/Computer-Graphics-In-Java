/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotation_clockwise;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Rotation_Clockwise extends Frame {
    int px1, px2, py1, py2;
    int x1, y1, x2, y2;

    public Rotation_Clockwise() {
        setTitle("Rotation clockwise");
        setSize(600, 600);
        
        // Scanner input for coordinates and angle ....
        try (Scanner sc = new Scanner(System.in)) { 
            // Using try-with-resources to automatically close Scanner .....
            System.out.println("\nJava Program by Anish Khatri - Rotation clockwise\n");
            System.out.println("Enter the coordinates of line:");
            System.out.print("Enter the x1 coordinate: ");
            x1 = sc.nextInt();
            System.out.print("Enter the y1 coordinate: ");
            y1 = sc.nextInt();
            System.out.print("Enter the x2 coordinate: ");
            x2 = sc.nextInt();
            System.out.print("Enter the y2 coordinate: ");
            y2 = sc.nextInt();
            System.out.print("Enter the angle (in degrees): ");
            int angle = sc.nextInt();

            // Convert angle to radians !!
            double m = Math.toRadians(angle);

            // Perform clockwise rotation for the points ...
            px1 = (int) (x1 * Math.cos(m) + y1 * Math.sin(m));
            py1 = (int) (-x1 * Math.sin(m) + y1 * Math.cos(m)); // Fixed the y calculation for clockwise
            px2 = (int) (x2 * Math.cos(m) + y2 * Math.sin(m));
            py2 = (int) (-x2 * Math.sin(m) + y2 * Math.cos(m)); // Fixed the y calculation for clockwise
        }

        // This is closing logic
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        // Displaying the results before and after rotation
        g.drawString("Before Rotation", x1 + 10, y1 + 10);
        g.drawLine(x1, y1, x2, y2);
        g.drawString("After Rotation", px1 + 10, py1 + 10);
        g.drawLine(px1, py1, px2, py2);
    }

    public static void main(String args[]) {
        new Rotation_Clockwise().setVisible(true);
    }
}


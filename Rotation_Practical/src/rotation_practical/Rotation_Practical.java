/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotation_practical;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Scanner;
import java.math.*;
import javax.swing.*;

public class Rotation_Practical {

    public static class Rotation extends Frame{
	int x1,y1,x2,y2;
	int w,x,y,z;
	double angle;
 public Rotation()
{
	Scanner sc=new Scanner(System.in);
        System.out.println("Java Program by Anish Khatri - Anti-clockwise");
	System.out.println("Enter the coordinates of line");
	System.out.println("Enter the x1 coordinate");
	 x1=sc.nextInt();
 	System.out.println("Enter the y1 coordinate");
	 y1=sc.nextInt();
	System.out.println("Enter the x2 coordinate");
	 x2=sc.nextInt();
	System.out.println("Enter the y2 coordinate");
	 y2=sc.nextInt();
	 System.out.println("Enter the angle");
	 int angle=sc.nextInt();
	 double m = ((angle * Math.PI )/ 180);
	    w = (int)(x1 *Math.cos(m) - y1 *Math.sin(m));
	    x = (int)(y1 *Math.cos(m) + x1 *Math.sin(m));
	    y = (int)(x2*Math.cos(m) - y2 *Math.sin(m));
	    z = (int)(y2*Math.cos(m) + x2 *Math.sin(m));
	setSize(400,400);
	setTitle("Rotation");
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	setVisible(true);
}
public void paint(Graphics g) {
	g.drawLine(x1,y1,x2,y2);
	g.drawString("Before Rotation", x1+10, y1+10);
	g.drawLine(w,x,y,z);
	g.drawString("After Rotation", w+10, x+10);
}

}
    public static void main(String args[]) 
    {
	new Rotation();
    }
}


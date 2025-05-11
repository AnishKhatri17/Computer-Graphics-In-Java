/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection_through_y;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Scanner;

public class Reflection_Through_Y {
    public static class ReFlection_Yaxis extends Frame{
	int x1, y1, x2, y2;
	int w,x,y,z;
public ReFlection_Yaxis ()
{
    System.out.println(" ishan khanal ReFlection_Yaxis");
	Scanner sc=new Scanner(System.in);
        
	System.out.println("Enter the coordinates of line");
	System.out.println("Enter the x1 coordinate");
	 x1=sc.nextInt();
	System.out.println("Enter the y1 coordinate");
	 y1=sc.nextInt();
	System.out.println("Enter the x2 coordinate");
	 x2=sc.nextInt();
	System.out.println("Enter the y2 coordinate");
	 y2=sc.nextInt();
	 
	setSize(350,350);
	setTitle("Reflection on Y-axis");
    	w=300+x1*(-1);
    	x=y1;
    	y=300+x2*(-1);
    	z=y2;
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	setVisible(true);
}
public void paint(Graphics g) {
	g.drawLine((((w-x1)+(x1*2))/2),0,(((w-x1)+(x1*2))/2),350);
	g.drawLine(x1,y1,x2,y2);
	g.drawString("After reflection",y,z+20);
	g.drawString("Before reflection",x1-20,y1);
	g.drawLine(w,x,y,z);
}

}
    public static void main(String args[]) {
	new ReFlection_Yaxis ();
}}


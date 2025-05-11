/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection_practical;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Scanner;

public class Reflection_Practical {
public static class Reflection extends Frame{
	int x1, y1, x2, y2;
	int w,x,y,z;
public Reflection()
{
	Scanner sc=new Scanner(System.in);
        System.out.println("\nJAva Program by Anish Khatri - Reflection ");
	System.out.println("Enter the coordinates of line");
	System.out.println("Enter the x1 coordinate");
	 x1=sc.nextInt();
	System.out.println("Enter the y1 coordinate");
	 y1=sc.nextInt();
	System.out.println("Enter the x2 coordinate");
	 x2=sc.nextInt();
	System.out.println("Enter the y2 coordinate");
	 y2=sc.nextInt();
	 setSize(450,450);
	setTitle("Reflection on X-axis");
	w=x1*1+y1*0;
	x=300+y1*(-1);
	y=x2*1+y2*0;
	z=300+y2*(-1);
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	setVisible(true);
}
public void paint(Graphics g) {
	g.drawLine(0,(((x-y1)+(y1*2))/2),300,(((x-y1)+(y1*2))/2));
	g.drawString("After reflection",w,x+20);
	g.drawLine(x1,y1,x2,y2);
	g.drawString("Before reflection",x1+20,y1);
	g.drawLine(w,x,y,z);
}

}
    public static void main(String args[]) {
	new Reflection();
}}


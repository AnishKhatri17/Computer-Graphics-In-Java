/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shearing_practical;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Shearing_Practical {
public static class Shearing extends Frame{
	int x1, y1, x2, y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8;
	int w,ww,x,xx,y,yy,z,zz;
public Shearing()
{
	Scanner sc=new Scanner(System.in);
        System.out.println("\n\nJava Program by Anish Khatri - Shearing\n ");
	System.out.print("Enter your choice : "+ "\n" + "1. Shearing in x-axis"+"\n"+
	"2. Shearing in y-axis");
	int value=sc.nextInt();
	System.out.print("Enter the coordinates of Rectangle : \n");
	System.out.print("Enter the x1 coordinate : ");
	 x1=sc.nextInt();
	System.out.print("Enter the y1 coordinate : ");
	 y1=sc.nextInt();
	System.out.print("Enter the x2 coordinate : ");
	 x2=sc.nextInt();
	System.out.print("Enter the y2 coordinate : ");
	 y2=sc.nextInt();
	 System.out.print("Enter the x3 coordinate : ");
	 x3=sc.nextInt();
	 System.out.print("Enter the y3 coordinate : ");
	 y3=sc.nextInt();
	 System.out.print("Enter the x4 coordinate : ");
	 x4=sc.nextInt();
	 System.out.print("Enter the y4 coordinate : ");
	 y4=sc.nextInt();

	setSize(300,300);
	setTitle("Shearing");
	if(value==1) {
		System.out.println("Enter shx :");
		 int shx=sc.nextInt();
		w=x1+y1*shx;
		ww=y1;
		x=x2+y2*shx;
		xx=y2;
		y=x3+y3*shx;
		yy=y3;
		z=x4+y4*shx;
		zz=y4;
		}
	if (value==2) {
		System.out.println("Enter shy : ");
		 int shy=sc.nextInt();
		w=x1;	 
  	  	ww=y1+shy*x1;
	    	x=x2;
	    	xx=x2*shy+y2;
	    	y=x3;
	   	yy=x3*shy+y3;
 	   	z=x4;
   	 	zz=x4*shy+y4;
}
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	setVisible(true);
}
public void paint(Graphics g) {
   	g.drawLine(x1,y1,x2,y2);
	g.drawLine(x2,y2,x3,y3);
	g.drawLine(x3,y3,x4,y4);
	g.drawLine(x4,y4,x1,y1);
    	g.drawString("Before Shearing ",x1+20,y1+20);
	g.drawLine(w,ww,x,xx);
	g.drawLine(x,xx,y,yy);
	g.drawLine(y,yy,z,zz);
	g.drawLine(z,zz,w,ww);
	g.drawString("After Shearing ",w+20,ww+20);
}

}
    public static void main(String args[]) {
	new Shearing();
}}

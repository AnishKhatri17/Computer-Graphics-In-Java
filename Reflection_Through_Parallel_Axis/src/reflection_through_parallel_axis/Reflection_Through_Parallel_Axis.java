/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection_through_parallel_axis;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Reflection_Through_Parallel_Axis {
    public static class ReflectionThroughParallelAxis extends Frame{
	int x1,y1,x2,y2,x,y;
	int value;
 public ReflectionThroughParallelAxis() {
	 Scanner sc=new Scanner(System.in);
	 setSize(350,350);
		setTitle("Reflection through parallel axis");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
                System.out.println("\nJava Program by Anish Khatri - ReflectionThroughParallelAxis");
		  System.out.println("Enter 1 for parallel to x axis"+"\n"+"Enter 2 for parallel to y axis");
			value=sc.nextInt();
			 if(value==1) {
		System.out.println("Enter the y position in arbitary point : ");
			 y=sc.nextInt();
			 }
			 else {
				 System.out.println("Enter the x position in arbitary point : ");
				 x=sc.nextInt();
			 }
		 setVisible(true);
}
 public void paint(Graphics g) {
	 if(value==1) {
		 g.drawLine(0, 60, 90,60);//y=50
		 x1=0;
		 y1=2*y-60;
		 x2=90;
		 y2=2*y-60;
		 g.drawLine(0, y, 600, y);
		 
		 g.drawLine(x1, y1, x2, y2);
		 g.drawString("Before Reflection",10,60);
		 g.drawString("After Reflection", x1+10, y1+10);
	 }
	 if(value==2) {
		  g.drawLine(60,0,70,90);//x=50
		 x1=(2*x)-60;
		 y1=0;
		 x2=(2*x)-70;
		 y2=90;
		 g.drawLine(x,0,x,600);
		 g.drawLine(x1, y1, x2, y2);
		 g.drawString("Before Reflection",60,100);
		 g.drawString("After Reflection", x2+10, y2+10);
	 }
 }

}
    public static void main(String[] args) {
		new ReflectionThroughParallelAxis();
}}


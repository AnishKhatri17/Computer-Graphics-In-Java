/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_dimention_transformation;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Main {
public static class Create3D_Object extends Frame{
	public Create3D_Object() {
		setSize(650,650);
		setTitle("3D-Transformation");
		addWindowListener(new WindowAdapter(){
	        public void windowClosing(WindowEvent  e) {
	           System.exit(0);
	        }
	  }); 
	}
	public void paint(Graphics g) {
		
	 g.setColor(Color.blue);
     g.fillRect(200, 200, 100, 100);
     
     g.setColor(Color.red);
     g.drawLine(200, 200, 200,200);
     g.drawLine(200,250,200,250);
     g.drawLine(250, 175, 250,200);
     g.drawLine(250,250,250,250);
     g.setColor(Color.green);
     g.fillRect(200, 200, 75, 75);
     transformation(g); 
     }
	public void transformation(Graphics g) {
		Scanner sc=new Scanner(System.in);
                System.out.println("Anish Khatri - Create3D_Object");
		
		System.out.println("Enter the number:"+"\n"+"1. Translation"+"\n"+"2. Rotation"+
	    "\n"+"3. Scaling");
		int value=sc.nextInt();
		if(value==1) {
			System.out.println("Enter the tx");
			int tx=sc.nextInt();
			System.out.println("Enter the ty");
			int ty=sc.nextInt();
			int x1=tx+150;
			int y1=ty+150;
			int x2=tx+175;
			int y2=ty+175;
			
			g.setColor(Color.red);
			g.fillRect(x1, y1, 75, 75);
			g.setColor(Color.green);
			g.drawString("Before Translation", x1-10, y1-10);
			
			g.setColor(Color.red);
		     g.drawLine(x1, y1, x2,y2);
		     g.drawLine(x1,y1+50,x2,y2+50);
		     g.drawLine(x1+50,y1,x2+50,y2);
		     g.drawLine(x1+50,y1+50,x2+50,y2+50);
		     g.setColor(Color.green);
			 g.fillRect(x2, y2, 75, 75);
			 g.setColor(Color.BLACK);
			 g.drawString("After Translation : ", x2+10, y2+10);
			
		}
		if(value==2) {
			System.out.println("Enter 1 for clockwise and 2 for anticlockwise rotation : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
			System.out.println("Enter the angle : ");
			int angle=sc.nextInt();
			double m = ((angle * Math.PI )/ 180);
			  int px1,px2,py1,py2;
			    px1 = (int)(150 * Math.cos(m) + 150 * Math.sin(m));
			    py1 = (int)(150*Math.cos(m) - 150*Math.sin(m));
			    px2 = (int)(175*Math.cos(m) + 175 * Math.sin(m));
			    py2 = (int)(175*Math.cos(m) - 175*Math.sin(m));
			    g.setColor(Color.GREEN);
				g.fillRect(px1, py1, 50, 50);
				g.setColor(Color.BLACK);
				g.drawString("Before Rotation : ", 160, 160);
				 g.setColor(Color.BLACK);
			     g.drawLine(px1, py1, px2,py2);
			     g.drawLine(px1,py1+50,px2,py2+50);
			     g.drawLine(px1+50,py1,px2+50,py2);
			     g.drawLine(px1+50,py1+50,px2+50,py2+50);
			     g.setColor(Color.CYAN);
				 g.fillRect(px2, py2, 50, 50);
				 g.setColor(Color.BLACK);
				 g.drawString("After Rotation : ", px2+10, py2+10);
				 
				 break;
			}
			case 2:{
				System.out.print("Enter the angle : ");
				int angle=sc.nextInt();
				double m = ((angle * Math.PI )/ 180);
				int w,x,y,z;
				w = (int)(150 *Math.cos(m) - 150 *Math.sin(m));
			    x = (int)(150 *Math.cos(m) + 150 *Math.sin(m));
			    y = (int)(175*Math.cos(m) - 175 *Math.sin(m));
			    z = (int)(175*Math.cos(m) + 175 *Math.sin(m));
			     
			    g.setColor(Color.GREEN);
				g.fillRect(w, x, 50, 50);
				g.setColor(Color.BLACK);
				g.drawString("Before Rotaion : ", 160, 160);
				 g.setColor(Color.BLACK);
			     g.drawLine(w, x, y,z);
			     g.drawLine(w,x+50,y,z+50);
			     g.drawLine(w+50,x,y+50,z);
			     g.drawLine(w+50,x+50,y+50,z+50);
			     g.setColor(Color.CYAN);
				 g.fillRect(y, z, 50, 50);
				 g.setColor(Color.BLACK);
				 g.drawString("After Rotation : ", y+10, z+10);
				 break;
			}
			default :{
				System.out.println("Invalid!!!!");
			}
			
			}
		}
		if(value==3) {
			System.out.print("Enter the scale value of x : ");
			 int sx=sc.nextInt();
			 System.out.print("Enter the scale value of y : ");
			 int sy=sc.nextInt();
			int w=50*sx;
			 int x=50*sy;
			 int y=50*sx;
			 int z=50*sy;
			 
			 g.setColor(Color.GREEN);
				g.fillRect(250, 250,w, x);
				g.setColor(Color.BLACK);
				g.drawString("Before Scaling : ", 160, 160);
				 g.setColor(Color.BLACK);
			     g.drawLine(250, 250, 300,300);
			     g.drawLine(250,250+y,300,z+300);
			     g.drawLine(w+250,250,y+300,300);
			     g.drawLine(w+250,x+250,y+300,z+300);
			     g.setColor(Color.CYAN);
				 g.fillRect(300,300, y, z);
				 g.setColor(Color.BLACK);
				 g.drawString("After Scaling : ", 260, 260);
			 
		}
	}
}	
 public static void main(String args[]) 
 {
	 new Create3D_Object().setVisible(true);;
 }
}





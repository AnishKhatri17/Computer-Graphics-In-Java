/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scaling_through_arbitary;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.*;


public class Scaling_Through_Arbitary {

 public static class ScalingThroughArbitary extends JFrame{
	int x1=55,y1=60,x2=100,y2=100,sx,sy;
	int w,xx,yy,z;
  public ScalingThroughArbitary() {
	  setSize(550,550);
	  setTitle("Scaling through the arbitary point");
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	  scalingarbi();
	  setVisible(true);
  }
  public void scalingarbi() {
       System.out.println("\n\nJava Program by Anish Khatri - ScalingThroughArbitary \n");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the x position in arbitary point ");
	  int x=sc.nextInt();
	  System.out.println("Enter the y position in arbitary point ");
	  int y=sc.nextInt();
	  System.out.println("Enter the scale value of x");
	  sx=sc.nextInt();
	  System.out.println("Enter the scale value of y");
	  sy=sc.nextInt();
	  
	  w=150+(x1*sx)+(x- (x*sx));
	  xx=150+(y1*sy)+(y-(y*sy));
	  yy=(x2*sx)+(x- (x*sx));
	  z=(y2*sy) +(y-(y*sy));
	  
  }
  public void paint(Graphics g) {
	  g.drawRect(x1,y1,x2,y2);
	  g.drawString("Before Scaling",x1+20,y1+20);
	  g.drawRect(w,xx,yy,z);
	  g.drawString("After Scaling",w+20,xx+20);
  }
    
}
public static void main(String[] args) {
		new ScalingThroughArbitary();
}}

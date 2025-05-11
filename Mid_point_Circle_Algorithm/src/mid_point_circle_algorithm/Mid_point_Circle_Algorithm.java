/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mid_point_circle_algorithm;

import java.awt.*;
import javax.swing.*;
public class Mid_point_Circle_Algorithm 
{
public static class MidPointCircle extends JFrame

{
 		public MidPointCircle() 
        {
		setSize(500,500);
		setTitle("Mid-Point circle drawing algorithm - Anish Khatri");
		setVisible(true);
	}
    public void  paint(Graphics g)
     {
       int xc=150;//xc,yc=center(x,y)
       int yc=150;
       int rad=100;
      int X=0;
      int Y=rad;
      int p = 5/4-rad;
      g.drawLine(0, 200, 400,200);
      g.drawLine(200,0,200,400);
       while(X<Y)
      {
         if(p<0)
          {
            X++;
            p=p+2*X+3;
          }
        else
          {
            X++;
            Y--;
            p = p+(2*X)-(2*Y)+5;
          }
           g.fillOval(xc+X,yc+Y,2,2);
           g.fillOval(xc+Y,yc-X,2,2);
           g.fillOval(xc-Y,yc+X,2,2);
           g.fillOval(xc-X,yc+Y,2,2);
           g.fillOval(xc+X,yc-Y,2,2);
           g.fillOval(xc+Y,yc+X,2,2);
           g.fillOval(xc-Y,yc-X,2,2);
           g.fillOval(xc-X,yc-Y,2,2);
       } }

}
    public static void main(String args[]) {
    	new MidPointCircle();
        System.out.println("Java Program by Anish Khatri : MidPointCircle Drawing Algorithm.");
}}


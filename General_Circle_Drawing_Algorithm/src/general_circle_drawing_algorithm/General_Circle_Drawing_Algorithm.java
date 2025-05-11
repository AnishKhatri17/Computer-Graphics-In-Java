/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package general_circle_drawing_algorithm;
import java.awt.*;
import java.lang.Math;
import java.awt.event.*;

public class General_Circle_Drawing_Algorithm 
{
public static class GeneralCircleDrawing extends Frame{
	public GeneralCircleDrawing(){
		setSize(500,500);
		setTitle("\n\nGeneral circle drawing algorithm");
		
		
		addWindowListener( new WindowAdapter() {
	           @Override
	           public void windowClosing(WindowEvent we) {
	               System.exit(0);
	           }
	       } );
		setVisible(true);
	 }
	public void  paint(Graphics g)
    {
		int xc=250;
		int yc=250;
      int rad=100;
     int X=0;
     int Y=rad;
     g.drawLine(0,200,600,200);
     g.drawLine(200,0,200,600);
     g.setColor(Color.blue);
     g.drawString("350,350",180,200);
     while(X<Y) {
    	g.setColor(Color.red);
    	Y--;
    	double a= Math.pow(rad,2)-Math.pow(Y, 2);
    	 
    	 X=(int)Math.ceil(Math.sqrt(a));
    	 g.fillOval(xc+X,yc+Y,1,1);
         g.fillOval(xc-X,yc+Y,1,1);
         g.fillOval(xc+X,yc-Y,1,1);
         g.fillOval(xc-X,yc-Y,1,1);
        g.fillOval(xc+Y,yc+X,1,1);
         g.fillOval(xc-Y,yc+X,1,1);
         g.fillOval(xc+Y,yc-X,1,1);
         g.fillOval(xc-Y,yc-X,1,1);
   } }
}
	public static void main(String[] args) {
		 new GeneralCircleDrawing();
                 System.out.println("Java program by Anish Khatri : GeneralCircleDrawing");
}}




   


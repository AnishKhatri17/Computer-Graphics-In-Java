/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection_through_arbitary;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;

public class Reflection_Through_Arbitary {
public static class ReflectionThroughArbitary extends Frame {
	 protected int x1 = 150;
	    protected int x2 = 200;
	    protected int y1 = 150;
	    protected int y2 = 200;
	    protected int x = x1;
	    protected int y = y1;
	    protected double m, c; 
	    int angle;
	    int a=10;
	    int b=20;
	public ReflectionThroughArbitary() {
		setSize(550,550);
		setTitle("Reflection Through Arbitary Point");
		 m = (double) (y2 - y1) / (x2 - x1);
	     c = (double) (x2 * y1 - x1 * y2) / (x2 - x1); 
	     
	     addWindowListener(new WindowAdapter(){
		        public void windowClosing(WindowEvent  e) {
		           System.exit(0);
		        }
		  }); 
	     
	   angle =(int)Math.atan(m);
	     
		setVisible(true);
	}
	public void paint(Graphics g) {
		int yy1,xx1,xx2,yy2;
		Graphics2D g2 = (Graphics2D)g;        
	      g2.setStroke(new BasicStroke());
		y = (int) Math.ceil(m * x + c);
	    
		Line2D line=new Line2D.Float();
		line.setLine(a, b, x,y);
	      g2.draw(line);
	      g.drawString("Before Reflection",x+10, y+10);
        
	      xx1 =300+(int)((a*((Math.cos(angle)*Math.cos(angle))-(Math.sin(angle)*(Math.sin(angle)))))
	    		+ (b*((Math.sin(angle)*Math.cos(angle))+(Math.sin(angle)*(Math.cos(angle)))))-(2*Math.sin(angle)*Math.cos(angle)*c));
 yy1 = 300+(int)((a*((Math.sin(angle)*Math.cos(angle))+((Math.sin(angle))*Math.cos(angle))))
+(b*((Math.sin(angle)*Math.sin(angle))-(Math.cos(angle)*(Math.cos(angle)))))
-((Math.sin(angle)*Math.sin(angle)*c) +(Math.cos(angle)*(Math.cos(angle))*c)+c ));
xx2 =300+ (int)((x*((Math.cos(angle)*Math.cos(angle))-(Math.sin(angle)*(Math.sin(angle)))))
+ (y*((Math.sin(angle)*Math.cos(angle))+(Math.sin(angle)*(Math.cos(angle)))))-(2*Math.sin(angle)*Math.cos(angle)*c));
yy2= 300+(int)((x*((Math.sin(angle)*Math.cos(angle))+((Math.sin(angle))*Math.cos(angle))))
+(y*((Math.sin(angle)*Math.sin(angle))-(Math.cos(angle)*(Math.cos(angle)))))
-((Math.sin(angle)*Math.sin(angle)*c) +(Math.cos(angle)*(Math.cos(angle))*c)+c )  );
			System.out.println("\nJava Program by Anish Khatri - Reflection ThroughArbitary.\n\n");		
		    System.out.println(xx1);
		    System.out.println(yy1);
		    System.out.println(xx2);
		    System.out.println(yy2);
			g.drawLine(xx1, yy1, xx2, yy2);
			g.drawString("After Reflection",xx1+10,yy1+10);
}
}
        public static void main(String args[]) {
    	new ReflectionThroughArbitary();
    }}

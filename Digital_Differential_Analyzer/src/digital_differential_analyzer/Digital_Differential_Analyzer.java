/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digital_differential_analyzer;

import java.io.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Digital_Differential_Analyzer 
{

public static class DDA extends Frame
{
	public DDA() {
		setTitle("Digital Differntial Analyzer");
		setSize(350,350);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	    
		setVisible(true);
	}
        public void paint (Graphics g)
        {       
double dx,dy,steps,x,y,k;
double xc,yc;
double x1=20,y1=40,x2=130,y2=126;
dx=x2-x1;
dy=y2-y1;
if(Math.abs(dx)>Math.abs(dy))
steps=Math.abs(dx);
else
steps=Math.abs(dy);
xc=(dx/steps);
yc=(dy/steps);
x=x1;
y=y1;
g.fillOval(250,550,6,6);
for(k=1;k<=steps;k++)
{
x=x+xc;
y=y+yc;
g.fillOval((int)x,(int)y,6,6);
}}
        
}
public static void main(String args[])
{
	//new Digital_Differential_Analyzer();
    new DDA();
        System.out.println("Java Program by Anish Khatri : DDA ");	
}}


    
   
    


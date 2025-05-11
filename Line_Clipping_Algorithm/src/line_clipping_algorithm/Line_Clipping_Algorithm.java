/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package line_clipping_algorithm;
import java.io.*;
import java.util.Scanner;
public class Line_Clipping_Algorithm 
{
public static class LineClipping{
	int x_max,x_min,y_max,y_min;
 Scanner sc=new Scanner(System.in);
    static final int INSIDE = 0; // 0000
    static final int LEFT = 1; // 0001
    static final int RIGHT = 2; // 0010
    static final int BOTTOM = 4; // 0100
    static final int TOP = 8; // 1000
  public LineClipping() {
      System.out.println("\nJava Program by Anish Khatri - LineClipping Algorithm");
      System.out.println("Enter the Size of the window..\n ");
      System.out.print("Enter the x_min : ");
       x_max = sc.nextInt();
      System.out.print("Enter the y_min : ");
      y_min = sc.nextInt();
      System.out.print("Enter the x_max : ");
    
       x_min = sc.nextInt();
       System.out.print("Enter the y_max : ");
       y_max = sc.nextInt();
  }
     int computeCode(int x, int y)
    {
        int code = INSIDE;
 
        if (x < x_min) 
        	code |= LEFT;
        else if (x > x_max)
            code |= RIGHT;
        if (y < y_min)  
            code |= BOTTOM;
        else if (y > y_max)
            code |= TOP;
 
        return code;
    }
 
   
     void cohenSutherlandClip(int x1, int y1,int x2, int y2)
    {
        
        int code1 = computeCode(x1, y1);
        int code2 = computeCode(x2, y2);
        boolean accept = false;
 
        while (true) {
            if ((code1 == 0) && (code2 == 0)) {
                accept = true;
                break;
            }
            else if ((code1 & code2) != 0) {
                break;
            }
            else {
                int code_out;
                int x = 0, y = 0;
                
                if (code1 != 0)
                    code_out = code1;
                else
                    code_out = code2;
 
                if ((code_out & TOP) != 0) {
                    x = x1
                        + (x2 - x1) * (y_max - y1)
                              / (y2 - y1);
                    y = y_max;
                }
                else if ((code_out & BOTTOM) != 0) {
                    x = x1
                        + (x2 - x1) * (y_min - y1)
                              / (y2 - y1);
                    y = y_min;
                }
                else if ((code_out & RIGHT) != 0) {
                    
                    y = y1
                        + (y2 - y1) * (x_max - x1)
                              / (x2 - x1);
                    x = x_max;
                }
                else if ((code_out & LEFT) != 0) {
                    y = y1
                        + (y2 - y1) * (x_min - x1)
                              / (x2 - x1);
                    x = x_min;
                }
 
                if (code_out == code1) {
                    x1 = x;
                    y1 = y;
                    code1 = computeCode(x1, y1);
                }
                else {
                    x2 = x;
                    y2 = y;
                    code2 = computeCode(x2, y2);
                }
            }
        }
        if (accept) {
            System.out.println("Line accepted from : " + x1+ ", " + y1 + " to " + x2+ ", " + y2);
           
        }
        else
            System.out.println("Line rejected ..........");
    }   
}
        public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	LineClipping line=new LineClipping();
        System.out.println("Enter the line to be clipped : ");
        System.out.println("\n");
        System.out.print("Enter the coordinate x1 : ");
         int ww=sc.nextInt();
         System.out.print("Enter the coordinate y1 : ");
         int xx=sc.nextInt();
         System.out.print("Enter the coordinate x2 : ");
         int yy=sc.nextInt();
         System.out.print("Enter the coordinate y2 : ");
         int zz=sc.nextInt();
         
         line.cohenSutherlandClip(ww,xx,yy,zz);
}}


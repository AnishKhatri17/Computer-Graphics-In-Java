/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflection_through_origin;

import java.awt.Graphics;
import javax.swing.JFrame;
//import java.util.Scanner;

public class Reflection_Through_Origin {

   public static class Reflection_Origin extends JFrame{
  int x1 = 55;
  int y1 = 55;
  int x2 = 155;
  int y2 = 155;
  int px1,px2,py1,py2;
  public Reflection_Origin()
  {
    setTitle("Reflection of line about origin");
    setSize(550,550);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    px1 = -x1+400;
    px2 = -x2+400;
    py1 = -y1+400;
    py2 = -y2+400;
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.drawLine(x1, y1, x2, y2);
    g.drawString("Before Reflection", x2+10,y2+10);
    g.drawLine(px1, py1, px2, py2);
    g.drawString("After Reflection", px1+10,py1+10);
  }

}
      public static void main(String args[])
  {
    new Reflection_Origin();
  
}}


package Lesson5;


import java.awt.Color;
import java.awt.Graphics;


public class TestFace {
    
    private int xloc, yloc, diameter;
    private Color head;
    private Color eyes;
    private Graphics g;
    private boolean ishappy;
  
    
    public TestFace(Graphics g, int x, int y, int d){
        xloc = x;
        yloc = y;
        this.g = g; 
        diameter=100;        
        head=Color.red;
        eyes=Color.yellow;
        ishappy = true;
    }
    
    public void setColor(Color headcolor, Color eyecolor){ 
        head = headcolor; 
        eyes = eyecolor;
    }
    
    public void draw(){
       drawHead();  
       drawEyes(); 
   
        if(ishappy) drawMouth();
        else if (!ishappy) drawFrown();   
    }
    
    public void erase(){
        g.setColor(Color.white);
         g.fillRect(xloc - 10, yloc - 10, diameter + 20, diameter + 20);
    }
    
    private void drawHead(){
        g.setColor(head);
        g.fillOval(xloc, yloc, diameter, diameter);
        
        g.setColor(Color.black);
        g.drawOval(xloc, yloc, diameter, diameter);     
    }
    
    private void drawEyes(){
        g.setColor(eyes);
        g.fillOval(xloc + (int)(0.2 * diameter), yloc + (int)(0.15 * diameter), (int)(0.25 * diameter), (int)(0.25 * diameter)); 
        g.fillOval(xloc + (int)(0.55 * diameter), yloc + (int)(0.15 * diameter), (int)(0.25 * diameter), (int)(0.25 * diameter));
        g.setColor(Color.black);
        g.drawOval(xloc + (int)(0.2 * diameter), yloc + (int)(0.15 * diameter), (int)(0.25 * diameter), (int)(0.25 * diameter)); 
        g.drawOval(xloc + (int)(0.55 * diameter), yloc+ (int)(0.15 * diameter), (int)(0.25 * diameter), (int)(0.25 * diameter));
    }
    
    private void drawMouth(){
        g.setColor(Color.black);
        g.drawLine(xloc + (int)(0.2 * diameter), yloc + (int)(0.55 * diameter), xloc + (int)(0.3 * diameter), yloc + (int)(0.7 * diameter)); 
        g.drawLine(xloc + (int)(0.3 * diameter), yloc + (int)(0.7 * diameter), xloc + (int)(0.7 * diameter), yloc + (int)(0.7 * diameter));
        g.drawLine(xloc + (int)(0.7 * diameter), yloc + (int)(0.7 * diameter), xloc + (int)(0.8 * diameter), yloc + (int)(0.55 * diameter));
        
    }
     public void move(int newx, int newy){
        xloc = newx;
        yloc = newy;    
    }
    
    private void drawFrown(){
        g.setColor(Color.black);
        g.drawLine(xloc + (int)(0.2 * diameter), yloc + (int)(0.85 * diameter), xloc + (int)(0.3 * diameter), yloc + (int)(0.7 * diameter)); 
        g.drawLine(xloc + (int)(0.3 * diameter), yloc + (int)(0.7 * diameter), xloc + (int)(0.7 * diameter), yloc + (int)(0.7 * diameter));
        g.drawLine(xloc + (int)(0.7 * diameter), yloc + (int)(0.7 * diameter), xloc + (int)(0.8 * diameter), yloc + (int)(0.85 * diameter));
    }
    
      public void setWidth(int d){
        diameter = d;
    }
    
    public void togglemood(){
       if(ishappy) ishappy = false;
         else ishappy = true;         
    }   

    
    public int getWidth(){
        return diameter;
    }
}

    

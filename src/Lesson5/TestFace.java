package Lesson5;

import java.awt.Color;
import java.awt.Graphics;


public class TestFace {
    
    private int xPos, yPos, diameter;
    private Color color;
    private Graphics g;
    
    public TestFace (Graphics g, int x, int y){
        xPos = x;
        yPos=y;
        //let the "g" property = the "g" param
        this.g = g;
        //default size and color
        diameter = 100;
        color=Color.red;
    }
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    private void drawHead(){
        g.fillOval(xPos, yPos, xPos, yPos);
       
    }
    private void drawEyes (){
       g.fillOval(xPos, yPos, xPos, yPos);
}
    private void drawMouth(){
        g.drawLine(xPos, yPos, xPos, yPos);
    }
    
    public void erase(){
        g.setColor(Color.white);
        
    }
    
}

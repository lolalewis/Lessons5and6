package Lesson5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class TestFace{
    
    private int xlocation, ylocation, diameter;
    private Color colorhead;
    private Color coloreyes;
    private Graphics g;
    private boolean ishappy;
    
    public TestFace(Graphics g, int x, int y, int d){
        xlocation = x;
        ylocation = y;
        this.g = g;
        diameter = 100;
        colorhead = Color.red;
        coloreyes = Color.yellow;
        ishappy = true;
    }
    
    public void setColor(Color h, Color e){
        colorhead = h;
        coloreyes = e;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        if(ishappy) drawMouth();
        else if (!ishappy) drawSadMouth();
    }
}
 
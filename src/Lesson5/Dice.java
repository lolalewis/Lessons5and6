package Lesson5;

import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    private int value;
    private Graphics g;
    private Color c;

    public Dice() {
        value = (int) (Math.random() * 6 + 1);
        g = null; //null = nothing
        c = null;
    }

    public Dice(Graphics pg) {
        value = (int) (Math.random() * 6 + 1);
        g = pg;
        c = Color.white;
    }

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        return value;
    }

    public void draw() {
        if (g == null) {
            return;
        }
        g.setColor(c);
        g.fillRoundRect(25, 25, 100, 100, 20, 20);

        //draw 7 dots
        g.setColor(Color.black);
        if(value ==1){
            draw4();
        }
        else if(value==2){
            draw1();
            draw7();
        }
        else if(value==3){
            draw1();
            draw4();
            draw7();
        }
        else if (value==4){
            draw1();
            draw2();
            draw6();
            draw7();
        }
         else if (value==5){
            draw1();
            draw2();
            draw4();
            draw6();
            draw7();
        }
         else if (value==6){
            draw1();
            draw2();
            draw3();
            draw5();            
            draw6();
            draw7();
        }
    }
    
    private void draw1(){
        g.fillOval(30, 30, 25, 25); //dot 1 , r1
    }
    
    private void draw2(){
        g.fillOval(90, 30, 25, 25);//dot 2, r1
    }
    private void draw3(){
         g.fillOval(30, 60, 25, 25); // dot 3, r2
    }
    private void draw4(){
         g.fillOval(60, 60, 25, 25); // dot 4, r2
    }
    private void draw5(){
        g.fillOval(90, 60, 25, 25); // dot 5, r2
    }
    private void draw6(){
         g.fillOval(30, 90, 25, 25); // dot 6, r3
    }
    private void draw7(){
          g.fillOval(90, 90, 25, 25); // dot 7, r3
    }
}

package Lesson5;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int money =0;
        int maxmoney=money;
        int bestroll=1;
        
    /*    
        int tries = 0;
        while (true) {
            d1.roll();
            d2.roll();
            tries++;
            int total = d1.getValue() + d2.getValue();
            System.out.print("Try: " + tries + "\t");
            System.out.format("You rolled a %d and a %d for a total of %d\n", d1.getValue(), d2.getValue(), total);
            if (total == 2) {
                break;
            }
        }

        System.out.println("It took " + tries + " tries to get snake-eyes.");

    }
   */
    
        int roll = 0;
        
        while (true) {
            System.out.print("How many dollars do you have? " );                
            money=s.nextInt();           
            d1.roll();
            d2.roll();
            roll++;          
            int rolls = d1.getValue() + d2.getValue();         
            if(roll==7){
              money+=4;
            }
            else if(roll!=7){
                money-=1;
            }
            else if (money==0){
                money=maxmoney;
                roll=bestroll;
               break;
            } 
                       
                System.out.println("How many dollars do you have?" + money); 
                System.out.println("You are broke after " + roll+ " rolls.");
                System.out.format("You should have quit after %d rolls when you had $%d \n", bestroll, maxmoney);
           
}
    }   

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fastfood;
import java.util.Scanner;
import java.text.*;
/**
 *
 * @author lewhi7273
 */
public class Fastfood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat currency = new DecimalFormat("$#,###,###.00");
       double b = 2.49;
       double f = 1.89;
       double d = 0.99;
       double cost;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of burgers ");
       int bs = input.nextInt();
       System.out.println("Enter the number of fries ");
       int fs = input.nextInt();
       System.out.println("Enter the number of soft drinks" );
       int ds = input.nextInt();
       
       
       double bc = bs * b;
       double fc = fs * f;
       double dc = ds * d;
       cost = bc + fc + dc;
       
       System.out.println("Your total before taxes is " + (currency.format(cost)));
       
       double tax;
       tax = cost * 0.13;
       System.out.println("Tax is " + tax);
       double paid;
       double change;
       System.out.println("Enter ammount paid");
       paid = input.nextDouble();
       
       change = paid - cost;
       System.out.println("Change: " +(currency.format(change)));
       
       input.close();
       
       
       
    }
    
}

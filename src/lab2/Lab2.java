/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 * This program is very commonly used in our everyday lives and its interesting to see how the programs actually works.
 * @author Niaz Morshed and Devya Gurung
 * @version 03/2/2015
 */
public class Lab2 {

    public static void main(String[] args) {

        int total, leftover1, leftover2, leftover3;
        
        
        int D = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your amount: "));

        
        int quarter = 0;
        quarter = D / 25;
        System.out.println("Quarter " + quarter);

        
        int dime = 0;
        leftover1 = D % 25;
        dime = leftover1 / 10;
        System.out.println("dime " + dime);

        
        int nickle = 0;
        leftover2 = leftover1 % 10;
        nickle = leftover2 / 5;
        System.out.println(" nickle " + nickle);

        
        int penny = 0;
        leftover3 = leftover2 % 5;
        penny = leftover3 / 1;
        System.out.println(" penny " + penny);
        total = quarter+ dime+ nickle + penny;
        JOptionPane.showMessageDialog(null, "quarter: "+ quarter +"\n" + "dime: " + 
                dime+ "\n" + "nickle: " + nickle + "\n" + "penny: " + penny
                +"\n"+ "Total number of coins: " + total);
        
        
        
        
        

    }

}

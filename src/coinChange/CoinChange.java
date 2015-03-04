package coinChange;

import javax.swing.JOptionPane;

/**
 * // This program allows user to get remaining change from a vending machine.
 *
 * @author Niaz Morshed and Devya Gurung
 */
public class CoinChange {

    public static void main(String[] args) {
        // create constant variable
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKLE_VALUE = 5;
        final int PENNY_VALUE = 1;

        // receive the amount
        String input = JOptionPane.showInputDialog("Enter the amount of change: ");
        int d = Integer.parseInt(input);
        System.out.println(" The user entered: " + d);

        //Calculate the numbers of quarters
        int quarterCount = d / QUARTER_VALUE;
        System.out.println("Quarters: " + quarterCount);

        //calculate the remaining amount
        d %= QUARTER_VALUE;

        //Calculate the number of dimes
        int dimeCount = d / DIME_VALUE;
        System.out.println("Dimes: " + dimeCount);

        //calculate the remaining amount
        d %= DIME_VALUE;

        //Calculate the number of nickels
        int nickleCount = d / NICKLE_VALUE;
        System.out.println("Nickles: " + nickleCount);

        //calculate the remaining amount
        d %= NICKLE_VALUE;

        //Calculate the number of pennies
        int pennyCount = d / PENNY_VALUE;
        System.out.println("Pennies: " + pennyCount);

        // calculate the total number of coins used
        int total = quarterCount + dimeCount + nickleCount + pennyCount;
        System.out.println("The total number of coins: " + total);
        JOptionPane.showMessageDialog(null, " Please take your change : \n " + "Quarters: " + quarterCount + "\n"
                + "Dimes: " + dimeCount + "\n" + "Nickles: " + nickleCount + "\n"
                + "Pennies: " + pennyCount + "\n" + "The total number of coins: " + total);

    }

}

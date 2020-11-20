//Author: Julian Santiago Rangel Manrique
//Date: 2020-oct-20
//Description:determines the total saved per person is N months. Yes A person saves X amount of money each month

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description:This proggram determinates
	 */
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        int N = f_total_months();
        int total_saved = 0, average_saved = 0, money_saved;
        for (int i = 1; i <= 6; i = i + 1) {
            do {
                System.out.println("input the money the " + i + " month");
                money_saved = keyboard.nextInt();
            } while (money_saved < 0);
            total_saved = total_saved + money_saved;
            System.out.println("input the money the " + i + " month");
            total_saved = total_saved + keyboard.nextInt();
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftLess100          ║");
        System.out.println("║    Version 1.0 2020-oct-20   ║");
        System.out.println("║  Created by: Santiago Rangel ║");
        System.out.println("╚══════════════════════════════╝"); 
 
    }

    public static int f_total_months() {
        //Description: this method return the total months.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total months:");
        int n_months = keyboard.nextInt();
        while (n_months < 1) {
            System.err.println("EER: The value should be grater than zero ");
            System.out.println("Input the total months:");
            n_months = keyboard.nextInt();
        }
        return n_months;
    }

}

    

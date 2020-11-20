//Author: Julian Santiago Rangel Manrique
//Date: 2020-oct-23
//Description:This software calculate one number upper to 100 y calculate the average

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int total_number = 0;
        double sumatory = 0, average = 0, number;
        System.out.println("Input a number:");
        number = keyboard.nextDouble();
        while (number > 100) {
            sumatory += number;
            total_number += 1;
            System.out.println("Input a other number:");
            number = keyboard.nextDouble();
        }
        if (total_number != 0) {
            average = sumatory / total_number;
        }
        System.out.println("the sumatory of " + total_number + " is = " + sumatory + " and average= " + average);
    }

    public static void f_menu(){
        //This method show the menu of this software
       System.out.println("╔══════════════════════════════╗");
       System.out.println("║         SoftLess100          ║");
       System.out.println("║    Version 1.0 2020-oct-23   ║");
       System.out.println("║  Created by: Santiago Rangel ║");
       System.out.println("╚══════════════════════════════╝"); 

    }
}

//Author: Julian Santiago Rangel Manrique
//Date: 21-10-2020
// Description: program that calculates the average height of N children.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
	    f_menu();
	    double sumatory=f_sum_height();
        System.out.println("The sumatory is:"+sumatory+ "(MTS)");
	    f_average(sumatory);
    }
        public static void f_menu(){
        //This method show the menu of this software
    
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftLess100          ║");
        System.out.println("║    Version 1.0 2020-oct-21   ║");
        System.out.println("║  Created by: Santiago Rangel ║");
        System.out.println("╚══════════════════════════════╝"); 

        public static double f_sum_height(){
        //Description: This method calculate the sumatory of 5 height
        
        Scanner keyboard = new Scanner(System.in);
        double sumatory, height1, height2, height3, height4, height5;
        System.out.println("Input the first height (MTS)");
        height1=keyboard.nextDouble();
        System.out.println("Input the second height (MTS)");
        height2=keyboard.nextDouble();
        System.out.println("Input the third height (MTS)");
        height3=keyboard.nextDouble();
        System.out.println("Input the four height (MTS)");
        height4=keyboard.nextDouble();
        System.out.println("Input the five height (MTS)");
        height5=keyboard.nextDouble();
        sumatory=height1+height2+height3+height4+height5;
        return sumatory;
    }
        public static void  f_average(double sumatory){
        //Description: This method calculate average
        //Esta funcion si le ingresan parametros y no me retorna
        double average= sumatory/5;
        System.out.println("Average is:"+average+"(MTS)");
    }

}

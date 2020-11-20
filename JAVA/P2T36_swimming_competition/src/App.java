//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-13
//Description: This software Allow to simulate the data of a swimming competition where the six times are stored for each competitor and also determine based on all the times of the competitors who is the winner.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int total_competitors = f_menu_total_competitors();
        double[][] matrix_competition = f_fill_matrix_total_competitors(total_competitors);
        String texto = "";
        System.out.println("-----------The times of competition------------");
        System.out.println("  Player|  T1  |  T2  |  T3  |  T4  |  T5  |  T6  |");
        for (int i = 0; i < total_competitors; i++) {
            texto += "\n" + (i + 1);
            for (int j = 0; j < 10; j++) {
                texto += "  |  " + matrix_competition[i][j] + " | ";
            }
        }
        System.out.println(texto);
    }

    public static int f_menu_total_competitors() {
        //This method show the menu of this software
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             Soft             ║");
        System.out.println("║    Version 1.0 2020-nov-13   ║");
        System.out.println("║  Created by: Santiago Rangel ║");
        System.out.println("╚══════════════════════════════╝"); 
        System.out.println("Input the total competitors");
        int total_competitors = keyboard.nextInt();
        while (total_competitors <= 0) {
            System.err.println("ERR: THE VALUE MUST GREATER THAN ZERO");
            System.out.println("Input the total competitors again");
            total_competitors = keyboard.nextInt();
        }
        return total_competitors;
    }

    public static double[][] f_fill_matrix_total_competitors(int total_competitors) {
        //Description: This method return a fill matrix of time the competition.
        double[][] matrix_competitor = new double[total_competitors][10];
        for (int i = 0; i < total_competitors; i++) {
            for (int j = 0; j < 10; j++) {
                matrix_competitor[i][j] = Math.floor(Math.random() * (15 - 8) + 8);
            }
        }
        return matrix_competitor;
    }
}

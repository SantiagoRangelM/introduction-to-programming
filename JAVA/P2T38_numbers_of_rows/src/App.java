//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-19
//Description: a two-dimensional array of N x M (values that the user must enter by keyboard), with random numbers between 1 and 1000.

import java.util.Scanner;

public class App {
  
    public static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        int rows=f_menu_total_rows();
        int columns=f_total_columns();
        int[][] matrix_numbers=new int[rows][columns]; 
        matrix_numbers=f_fill_matrix(matrix_numbers);  

        System.out.println("Input the number of the row:");
        int number_row=keyboard.nextInt();
        int summatory=0;
        double average=0;
        while (number_row>=0 && number_row<matrix_numbers.length-1){
            System.out.println();
            for (int j=0; j<matrix_numbers[0].length;j++){   
                System.out.print(" | "+matrix_numbers[number_row][j]);
                summatory+=matrix_numbers[number_row][j];
            }
            average=summatory/matrix_numbers[0].length;
            System.out.println("\nby number row "+number_row+", the sum is "+summatory+ " and the average is "+average);
            System.out.println("Input other number of the row:");
            number_row=keyboard.nextInt();
        }
        System.out.println("--finish--");


    }
    public static int f_menu_total_rows() {
        //DESCRIPTION: This method show the initial menu and returns the total rows of a matrix
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║             Soft             ║");
        System.out.println("║    Version 1.0 2020-nov-19   ║");
        System.out.println("║  Created by: Santiago Rangel ║");
        System.out.println("╚══════════════════════════════╝"); 
        System.out.println("input who many rows do you want in the matrix?");
        int total_rows= keyboard.nextInt();
        while (total_rows<=0){
            System.err.println("ERR: the  value must greater than zero");
            System.out.println("input Again who many total rows do you want?");
            total_rows= keyboard.nextInt();
        }
        return total_rows;
    }
    public static int f_total_columns() {
        //DESCRIPTION: This method returns the total columns of a matrix

        System.out.println("input who many columns do you want in the matrix?");
        int total_columns= keyboard.nextInt();
        while (total_columns<=0){
            System.err.println("ERR: the  value must greater than zero");
            System.out.println("input Again who many total columns do you want?");
            total_columns= keyboard.nextInt();
        }
        return total_columns;
    }
    public  static int[][] f_fill_matrix(int[][] matrix_numbers){  
        //description: this methods fill the matrix
        for (int i=0;i<matrix_numbers.length;i++){ 
            for(int j=0; j<matrix_numbers[0].length;j++){ 
                matrix_numbers[i][j]= (int) Math.floor((Math.random()*1000)+1); 
            }
        }
        return matrix_numbers;   
    }

}
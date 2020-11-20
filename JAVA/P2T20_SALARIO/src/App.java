//AUTOR: Andres Felipe Torres, Julian Santiago RAngel 
//DATE: 2020-oct-20
//DESCRIPTION: Este programa calcula el promedio de ahorros de u empleado que trabaja minimo 2 meses y maximo 12 meses

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static void f_menu(){
        //description: show inicial menu/information of programm
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("--------------SoftAverageHeight--------------------");
        System.out.println("----------Version 1.0 2020-oct-20------------------");
        System.out.println("-------Make by Andres Torres Santiago Rangel-------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
    }

    public static int f_months(){
        //description:this metoth return the total months
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput your months that you work: ");

       int months = keyboard.nextInt();
       while(months <2 || months >12){
           System.out.println("ERR: This value between 2 and 12, imput again the total months");
           months = keyboard.nextInt(); 
       }
      return months

    }

    public static int f_Salary(){
        int (>= 2000 and <= 2000000);
        System.out.println("imput the salary: ");
     }

    
}

//Author: Julian Santiago Rangel Manrique
//Date: 29/oct/2020
//DSCRIPTION: program in java that allows storing the salaries of the employes groued by shift (8 employees)

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();

      int[] v_salary_day = f_turn_day();
      int[] v_salary_night = f_turn_night();
      int v_total_salary_day = 0, v_total_salary_night = 0, v_total_salary= 0;

      System.out.println("----Turn Day----");
      for (int i=0; i<8; i++){
          v_total_salary_day += v_salary_day[i];
          System.out.println("Employee ["+i+"]$"+v_salary_day[i]);
      }
      
      System.out.println("----Turn Night----");
      for (int i=0; i<8; i++){
          v_total_salary_night += v_salary_night[i];
          System.out.println("Employee ["+i+"]$"+v_salary_night[i]);
      }

      System.out.println("----Totals Salary----");
      System.out.println("Total salary day $"+v_total_salary_day);
      System.out.println("Total salary night $"+v_total_salary_night);
      System.out.println("Total salary (day+night) $"+(v_total_salary_day+v_total_salary_night));




    }
    public static void f_menu() {
        //This method show menu
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║  SoftVectorSalaryAndTwoTurns ║");
        System.out.println("║    Version 1.0 2020-oct-27   ║");
        System.out.println("║  Created by: Santiago Rangel ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int[] f_turn_day(){
        //description: This method returns a vector whith 8 salary
        int[] v_salary = new int [8];
        
        for(int i=0; i<8; i++){
            v_salary[i] = (int) ((Math.random()*8)*29760);

        }
        return v_salary;
    }
    
    public static int[] f_turn_night(){
        //description: this method returns a vector with 8 salary more + 35%
        int[] v_salary_night = new int[8];
        
        for(int i=0; i<8; i++){
            v_salary_night[i] = (int) ((Math.random()*8)*38151);
        }
        return v_salary_night;
    }
}

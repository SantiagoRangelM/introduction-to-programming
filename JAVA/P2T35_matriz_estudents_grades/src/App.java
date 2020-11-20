//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-12
//Description: 

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();
       double[][] v_matriz_grades = f_fill_matriz();
       double v_final_grade = 0;
       System.out.println("-----Students Grades-----");
       for(int i=0; i<10; i++){
           v_final_grade = v_matriz_grades[i][0]*0.3+v_matriz_grades[i][1]*0.3+v_matriz_grades[i][2]*0.4;
           v_final_grade = Math.round(v_final_grade*100)/100;
           System.out.println(v_matriz_grades[i][0]+"|"+v_matriz_grades[i][1]+"|"+v_matriz_grades[i][2]);
       }
    }
    public static void f_menu(){
        //This method show the menu of this software
       System.out.println("╔══════════════════════════════╗");
       System.out.println("║             Soft             ║");
       System.out.println("║    Version 1.0 2020-nov-12   ║");
       System.out.println("║  Created by: Santiago Rangel ║");
       System.out.println("╚══════════════════════════════╝");
    }

    public static double[][] f_fill_matriz(){
        //description: this method retunrd the fill matriz (10x3) whit double number between 0.0 5.0
        double[][] v_matriz = new double[10][3];
        for(int i=0; i<10; i++){
            v_matriz[i][0] = Math.random()*5.1;
            v_matriz[i][1] = Math.random()*5.1;
            v_matriz[i][2] = Math.random()*5.1;
        }
        return v_matriz;

    }
}

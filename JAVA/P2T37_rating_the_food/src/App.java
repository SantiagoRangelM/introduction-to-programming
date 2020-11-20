//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-17
//Description: this software simulate the rate food in the cafeteria. for this, a scale of 1 to 10 was difined (1 denotes horrible and 10 denotes exellent)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int v_user_people = f_total_surveyed();
        int [][]v_matriz_survey = f_fill_matriz_survey(v_user_people);
        int v_bad_foot=0;
        int v_regular_food=0;
        int v_exellent_food=0;
        int v_total_surveyed = 0;
        for(int i=0; i<v_user_people; i++){
            for(int k=0; k<6; k++){
                if(v_matriz_survey[i][k]<=3){
                    v_bad_foot+=1;
                }else if(v_matriz_survey[i][k]<=6){
                    v_regular_food+=1;
                }else{
                    v_exellent_food+=1;
                }
                v_total_surveyed+=1;
            }
        }
        f_show_matriz_value; 
        System.out.println("----totals----");
        System.out.println("total survey: "+v_total_surveyed);
        System.out.println("total bad foot: "+v_bad_foot+"("+(v_bad_foot*100)/v_total_surveyed)+"%)");
        System.out.println("total regular food: "+v_regular_food+"("+(v_regular_food*100)/v_total_surveyed)+"%)");
        System.out.println("total exellent food: "+v_exellent_food+"("+(v_exellent_food*100)/v_total_surveyed)+"%)");

    }
    public static void f_menu(){
           //This method show the menu of this software
       System.out.println("╔══════════════════════════════╗");
       System.out.println("║             Soft             ║");
       System.out.println("║    Version 1.0 2020-nov-17   ║");
       System.out.println("║  Created by: Santiago Rangel ║");
       System.out.println("╚══════════════════════════════╝"); 
    }

    public static int f_total_surveyed(){
        //description: this method returns the toal people than surveyed
        Scanner keyboard = new Scanner (System.in);
        System.out.println("how many people do you want?");
        int v_total_people = keyboard.nextInt();
        while (v_total_people < 1 || v_total_people > 1000){
            System.out.println("ERR: your ");

        }
    }

    public static int[][] f_fill_matriz_survey(int v_user_people){
        //description this method returns the matriz Nx5 with values beetween 1 to 10
    int[][]v_matriz_survey = new int[v_user_people][5];
    for(int i=0; i<v_user_people; i++){
        for(int j=0; j<5; j++){
            v_matriz_survey[i][j] = (int) (Math.random()*9)+1;
        }
    }
    return v_matriz_survey;

    }
    public static void f_show_matriz_value(int[][]v_matriz_survey){
        for(int i=0; i<v_matriz_survey.length; i++){
            System.out.println("\n["+i+"]; ");
            for(int k=0; k<5; k++){
                System.out.println(v_matriz_survey[i][k]+"|");
            }
        }
    }
}    

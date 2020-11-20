//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-09
//Description: 

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int[] v_men = f_fill_vector_age();
        int[] v_women = f_fill_vector_age();
        int[] v_totales = {0,0,0,0,0,0};
        //int v_tot_men_17 = 0, v_woman_17 = 0;
        //int v_tot_men_18_59 = 0, v_tot_women_18_59 = 0;
        //int v_tot_men_60 = 0, v_tot_women_60 = 0;
        for(int i=0; i<v_men.length; i++){
            if(v_women[i]<18){
                v_totales[1]=v_totales[1]+1;
            }else if (v_women[i]<60){
                v_totales[3]=v_totales[3]+1;
            }else{
                v_totales[5]=v_totales[5]+1;
            }
            v_totales[7]=v_totales[7]+v_women[i];

            if(v_men[i]<18){
                v_totales[0]=v_totales[0]+1;
            }else if (v_men[i]<60){
                v_totales[2]=v_totales[2]+1;
            }else{
                v_totales[4]=v_totales[4]+1;
            }
            v_totales[6]=v_totales[6]+v_men[i];
        }
        System.out.println("men"+v_totales[0]+"and women"+v_totales[1]+"are under the age of 18");
        System.out.println("men"+v_totales[2]+"and women"+v_totales[3]+"are under the age of 18");
        System.out.println("men"+v_totales[4]+"and women"+v_totales[5]+"are under the age of 18");
        System.out.println("average age of women"+(v_totales[7]/v_women.length)+" and men"+(v_totales[6]/v_men.length));
        
        System.out.println("----Ages of women----");
        for(int i=0;i<v_women.length;i++){
            System.out.println("["+i+"]="+v_women[i]);
        }    
        System.out.println("----Ages of men----");
        for(int i=0;i<v_men.length;i++){
            System.out.println("["+i+"]="+v_men[i]);
        } 
    }
    public static void f_menu(){
        //This method show the menu of this software
       System.out.println("╔══════════════════════════════╗");
       System.out.println("║             Soft             ║");
       System.out.println("║    Version 1.0 2020-nov-23   ║");
       System.out.println("║  Created by: Santiago Rangel ║");
       System.out.println("╚══════════════════════════════╝"); 

    }
    public static int[] f_fill_vector_age(){
        //description: this method returns 100 randoms numbers 
        int[] v_vector = new int[10];
        for (int i=0; i<10; i++){
            v_vector[i]=(int) (Math.random()*99)+i;
        }
        return v_vector;
    }
}

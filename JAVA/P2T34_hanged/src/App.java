//Author: Julian Santiago Rangel Manrique
//Date: 2020-nov-09
//Description: this software is about hangman game.

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        
        String palabra_secreta = f_palabra_secreta();
        
        char [] palabra_guiones = f_palabra_guiones(palabra_secreta);
        
        boolean juego_terminado = false;
        
        Scanner keyboard = new Scanner(System.in);
        
        int intentos = 3;

        do{
            System.out.println("you have "+intentos+" attempts");
            System.out.println(palabra_guiones);
            System.out.println("imput a letter: ");
            char letra = keyboard.next().charAt(0);
            boolean alguna_letra_acertada = false;
            
            for (int i = 0; i<palabra_secreta.length(); i++){
                
                if(palabra_secreta.charAt(i) == letra){
                    palabra_guiones[i] = letra;
                    alguna_letra_acertada = true;
                }

            }
           
            if(!alguna_letra_acertada){
                System.out.println("you have not accepted any letter."); 
                --intentos;
                
                if(intentos==0){
                    System.out.println("the number of attempts has been exceeded, you have lost");
                    System.out.println("the word is"+palabra_secreta);
                    juego_terminado = true;
                }
                
            }   
            else{
                boolean juego_ganado = !hay_guiones(palabra_guiones);
                if(juego_ganado){
                    System.out.println(palabra_guiones);
                    System.out.println("you winner.");
                    juego_terminado = true;
                }
            }

        }while(!juego_terminado);
        

    }    
    public static void f_menu(){
        //This method show the menu of this software
       System.out.println("╔══════════════════════════════╗");
       System.out.println("║             Soft             ║");
       System.out.println("║    Version 1.0 2020-nov-09   ║");
       System.out.println("║  Created by: Santiago Rangel ║");
       System.out.println("╚══════════════════════════════╝"); 

       System.out.println("----------------------------------------");
       System.out.println("----------------------------------------");
       System.out.println("--------------HANGMAN GAME--------------");
       System.out.println("----------------------------------------");
       System.out.println("----------------------------------------");

    }
    public static String f_palabra_secreta(){

        String [] palabras = {"casa", "perro", "software", "linux", "windows", "manzana", "color", "usta", "teclado", "programacion"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);
        return  palabras[n];
          
    }
    public static char[] f_palabra_guiones(String palabra){
        
        int n_letras_palabra_secreta = palabra.length();
        char [] palabra_guiones = new char[n_letras_palabra_secreta];

        for( int i=0; i<palabra_guiones.length; i++){
            palabra_guiones[i] = '_';
        }
        return palabra_guiones;
    }
    public static boolean hay_guiones(char[] array){
        for(char l:array){
            if(l=='_')return true;
        }
        return false;
    }
  
      
}

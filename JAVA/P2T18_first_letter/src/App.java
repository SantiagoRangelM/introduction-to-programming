import java.util.Scanner;

//AUTHOR: Julian Santiago Rangel
//DATE: 2020-oct-19
//DESCRIPTION: Create a method that returns the first letter of a word entered as a paremeter

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard new Scanner(System.in);
       
        f_menu();
        System.out.println("Imput word: ");
       String WORD = keyboard.nextLine();
       while(WORD.length()<5){
           System.out.println("ERR: your word should have at least five (5) letters, imput again you word: ");
           WORD = keyboard.nextLine();
       }
    }
    public static void f_menu(){
        
        public static String f_first_letter(WORD){

            String first_lettter = WORD.substring(0,1);
            System.out.println("The first letter is "+first_lettter);
        }
        public static void f_final_letter (String WORD){

            String final_letter = WORD.substring(WORD.length()-1);
            System.out.println("the final letter is: "+final_letter);
        }
    }
    public static void f_replace_letter(String WORD, String letter){

        String NEW_WORD = WORD.replace("a", letter);
        System.out.println("old word is: "+WORD+"New word is: "+NEW_WORD);
    }
}

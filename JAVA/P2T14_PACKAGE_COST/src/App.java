import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t14: package cost, by Santiago Rangel");
        f_menu();
        int option= f_address();
        double weight = f_weight();
        double price =0;

        if(option==1){  price = weight=11;

        }else if(option==2){ price = weight=10;

        }else if(option==3){ price = weight=12;

        }else if(option==4){ price = weight=24;

        }else{ price = weight=27;

        }
        System.out.println("the price of your pacel is"+price);
    }
    public static void f_menu(){
    //decription: show inicial menu
    System.out.println("╔══════════════════════════════╗");
    System.out.println("║         SoftLess100          ║");
    System.out.println("║    Version 1.0 2020-oct-23   ║");
    System.out.println("║  Created by: Santiago Rangel ║");
    System.out.println("╚══════════════════════════════╝"); 

    }
    public static int f_address(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the option address");
        System.out.println("1-North America");
        System.out.println("2-Central America");
        System.out.println("3-South America");
        System.out.println("4-Europe");
        System.out.println("5-Asia");

        int option= keyboard.nextInt();
        while(option<1 || option>5){
            System.out.println("Err, your option address do not exist, input again");
        System.out.println("1-North America");
        System.out.println("2-Central America");
        System.out.println("3-South America");
        System.out.println("4-Europe");
        System.out.println("5-Asia");

        option= keyboard.nextInt();

        }
        return option;

    }
    public static double f_weight(){
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("input the weight (KG) of parcel");
        double weight = keyboard1.nextDouble();
        while (weight<=0){
            System.out.println("Err, this weight (KG) should begreater than 0");
            weight = keyboard1.nextDouble();
        }
        return weight;
    }
}

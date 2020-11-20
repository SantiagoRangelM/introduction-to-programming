import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T8. volumen of a cylinder. By Santiago rangel");
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Imput the radius in (cm): ");
        double R1 = keyboard.nextDouble();

        System.out.println("Imput the heigth in (cm): ");
        double H1 = keyboard.nextDouble();

        if (R1<=0 || H1<=0){
            System.err.println("ERR: this radius or height can't less than or equal to zero.");
        }else{

           double VOL = 3.141592*(R1*R1)*H1;

           System.out.println("Volumen is "+VOL+"cm3");
        }


    }
}

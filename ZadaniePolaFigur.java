import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PolaFigur {

    private static void obliczpolekwadrat(){
        Scanner kosc = new Scanner(System.in);
        System.out.print("Podaj dlugosc boku: ");
        int kobokkwadrat = kosc.nextInt();
        int kopolekwadrat = kobokkwadrat * kobokkwadrat;
        System.out.print("Pole kwadratu wynioslo: " + kopolekwadrat);
    }

   
    private static void zamknij(){
        Scanner kosc = new Scanner(System.in);
        System.out.println("Wpisz exit: ");
        String koexit = kosc.nextLine();;
        while(!koexit.equals("exit")){
            System.exit(0);
        }

    }

    public static void main(String[]args){
        Scanner kosc = new Scanner(System.in);
        System.out.println("OBLICZ POLA FIGUR P");
        System.out.println("1 - KWADRAT");
        System.out.print("Wybierz cyfre oznaczającą dana figure: ");
        int kowybor = kosc.nextInt();

        if (kowybor == 1){
            System.out.println("Wybrales kwadrat");
            obliczpolekwadratu();

   

        }
     


    }
}
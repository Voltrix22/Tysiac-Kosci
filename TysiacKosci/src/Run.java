import Gra.Przebieg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean koniec = true;
        int wybor = 0;

        while(koniec) {
            System.out.println("=======================");
            System.out.println("   | TYSIĄC KOŚCI |");
            System.out.println("=======================");
            System.out.println("1) Zasady gry          |");
            System.out.println("2) Rozpoczęcie gry     |");
            System.out.println("3) Zakończenie programu|");
            System.out.println("=======================");
            try {
                wybor = input.nextInt();

            }
            catch(InputMismatchException ie){
                System.out.println("ZOSTAŁ PODANY NIEPOPRAWNY ZNAK");
            }
            input.nextLine();

            switch (wybor) {
                case 1:
                    Zasady przepis = new Zasady();
                    przepis.zasady();
                    break;
                case 2:
                    Przebieg przebieg = new Przebieg();
                    przebieg.gra();
                    break;
                case 3:
                    koniec = false;
                    break;
            }
        }
    }
}

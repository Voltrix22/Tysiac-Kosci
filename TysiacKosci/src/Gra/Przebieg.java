package Gra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Przebieg {

    public Przebieg(){

    }

    public void gra(){

        Scanner ing = new Scanner(System.in);
        Components komponenty = new Components();

        //PODAWANIE ILOŚCI GRACZY
        while(komponenty.getIloscGraczy() == 0) {
            System.out.println("Podaj ilość graczy");
            int iloscGraczy = 0;
            try {
                iloscGraczy = ing.nextInt();

            } catch (InputMismatchException ie) {
                System.out.println("ZOSTAŁ PODANY NIEWŁAŚCIWY ZNAK");
            }
            ing.nextLine();
            if(iloscGraczy > 0 && iloscGraczy < 7) {
                komponenty.setIloscGraczy(iloscGraczy);
            }
        }

        //PODAWANIE IMION GRACZY
        for (int i = 0; i<komponenty.getIloscGraczy();i++) {
            System.out.println("Podaj imie gracza nr "+ (i+1));
            komponenty.setImie(ing.nextLine());
            komponenty.setNrGracza(komponenty.getNrGracza()+1);
        }
        System.out.println("ROZPOCZĘCIE GRY");
        System.out.println();
        komponenty.setNrGracza(1);

        //ROZGRYWKA
         while(komponenty.isEndGame()){
             System.out.println("***********************************");
             System.out.println("Tura gracza "+komponenty.imieGraczaT());
             System.out.println("CO CHCESZ ZROBIĆ?");
             System.out.println("1) podaj ilość punktów");
             System.out.println("2) pokaż tabelę wyników");
             System.out.println("3) pokaż wszystkie wyniki");
             System.out.println("4) wymuś zakończenie gry");
             System.out.println("***********************************");
            int wyborG = 0;
            try {
                wyborG = ing.nextInt();
            }
            catch(InputMismatchException ie){
                System.out.println("ZOSTAŁ PODANY NIEWŁAŚCIWY ZNAK");
            }
            ing.nextLine();

            if(wyborG == 1){
                boolean blad = true;
                while(blad) {
                    blad = false;
                    System.out.println();
                    System.out.print("Ilość punktów z kości = ");
                    try {
                        komponenty.setPunkty(ing.nextInt());
                    } catch (InputMismatchException ie) {
                        System.out.println("ZOSTAŁ PODANY NIEWŁAŚCIWY ZNAK");
                        blad = true;
                    }
                    ing.nextLine();
                }
                komponenty.choosePlayer();
                komponenty.checkWin();
                komponenty.setNrGracza(komponenty.getNrGracza()+1);
                if(komponenty.getNrGracza()>komponenty.getIloscGraczy()){
                    komponenty.setNrGracza(1);
                }
            }
            else if(wyborG == 2){
                komponenty.showPoints();
            }
            else if(wyborG == 3){
                komponenty.showAllPoints();
            }
            else if(wyborG == 4){
                komponenty.setEndGame(false);
            }
        }
    }
}
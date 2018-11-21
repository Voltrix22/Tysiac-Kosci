package Gra;

import java.util.ArrayList;

public class Components {

    int iloscGraczy = 0;
    int nrGracza = 1;
    int punkty = 0;
    boolean endGame = true;

    String imie1;
    String imie2;
    String imie3;
    String imie4;
    String imie5;
    String imie6;

    ArrayList graczL1 = new ArrayList();
    ArrayList graczL2 = new ArrayList();
    ArrayList graczL3 = new ArrayList();
    ArrayList graczL4 = new ArrayList();
    ArrayList graczL5 = new ArrayList();
    ArrayList graczL6 = new ArrayList();

    //METODY

    public void checkWin(){
        if(getNrGracza() == 1) {
            if ((int) graczL1.get(graczL1.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie1().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
        if(getNrGracza() == 2) {
            if ((int) graczL2.get(graczL2.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie2().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
        if(getNrGracza() == 3) {
            if ((int) graczL3.get(graczL3.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie3().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
        if(getNrGracza() == 4) {
            if ((int) graczL4.get(graczL4.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie4().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
        if(getNrGracza() == 5) {
            if ((int) graczL5.get(graczL5.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie5().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
        if(getNrGracza() == 6) {
            if ((int) graczL6.get(graczL6.size() - 1) == 1000) {
                System.out.println("WYGRYWA GRACZ " + getImie6().toUpperCase()+"!!!!!!!");
                System.out.println();
                setEndGame(false);
            }
        }
    }

    public void choosePlayer(){
        if(nrGracza == 1){
            if(graczL1.size()>0) {
                int ostatnia1 = (int) graczL1.get(graczL1.size()-1);
                if((ostatnia1 + punkty) <= 1000) {
                    graczL1.add(ostatnia1 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL1.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
        else if(nrGracza == 2){
            if(graczL2.size()>0) {
                int ostatnia2 = (int) graczL2.get(graczL2.size()-1);
                if((ostatnia2 + punkty) <= 1000) {
                    graczL2.add(ostatnia2 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL2.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
        else if(nrGracza == 3){
            if(graczL3.size()>0) {
                int ostatnia3 = (int) graczL3.get(graczL3.size()-1);
                if((ostatnia3 + punkty) <= 1000) {
                    graczL3.add(ostatnia3 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL3.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
        else if(nrGracza == 4){
            if(graczL4.size()>0) {
                int ostatnia4 = (int) graczL4.get(graczL4.size()-1);
                if((ostatnia4 + punkty) <= 1000) {
                    graczL4.add(ostatnia4 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL4.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
        else if(nrGracza == 5){
            if(graczL5.size()>0) {
                int ostatnia5 = (int) graczL5.get(graczL5.size()-1);
                if((ostatnia5 + punkty) <= 1000) {
                    graczL5.add(ostatnia5 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL5.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
        else if(nrGracza == 6){
            if(graczL6.size()>0) {
                int ostatnia6 = (int) graczL6.get(graczL6.size()-1);
                if((ostatnia6 + punkty) <= 1000) {
                    graczL6.add(ostatnia6 + punkty);
                    System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                    System.out.println();
                }
                else{
                    System.out.println("ZA DUŻA ILOŚĆ PUNKTÓW");
                    System.out.println();
                }
            }
            else{
                graczL6.add(punkty);
                System.out.println("Gracz "+imieGraczaT()+" otrzymał "+punkty+" pkt");
                System.out.println();
            }
        }
    }

    public void showPoints(){
        if (nrGracza == 1){
            int I = 1;
            for (Object tmp : graczL1) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
        if (nrGracza == 2){
            int I = 1;
            for (Object tmp : graczL2) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
        if (nrGracza == 3){
            int I = 1;
            for (Object tmp : graczL3) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
        if (nrGracza == 4){
            int I = 1;
            for (Object tmp : graczL4) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
        if (nrGracza == 5){
            int I = 1;
            for (Object tmp : graczL5) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
        if (nrGracza == 6){
            int I = 1;
            for (Object tmp : graczL6) {
                System.out.println(I + ". " + tmp);
                I++;
            }
        }
    }

    public void showAllPoints(){
        int ktoraLista = 1;
        while(iloscGraczy >= ktoraLista) {
            if (ktoraLista == 1) {
                if(graczL1.size() > 0) {
                    int ostatnia = (int) graczL1.get(graczL1.size() - 1);
                    System.out.println("1) " + imie1 + " - " + ostatnia+" pkt");
                    System.out.println("---------------");
                }
                else
                    System.out.println("1) " + imie1 + " - " + "BRAK PUNKTÓW");
            }
            else if (ktoraLista == 2) {
                if(graczL2.size() > 0) {
                    int ostatnia = (int) graczL2.get(graczL2.size() - 1);
                    System.out.println("2) " + imie2 + " - " + ostatnia+" pkt");
                }
                else
                    System.out.println("2) " + imie2 + " - " + "BRAK PUNKTÓW");
            }
            else if (ktoraLista == 3) {
                if(graczL3.size() > 0) {
                    int ostatnia = (int) graczL3.get(graczL3.size() - 1);
                    System.out.println("3) " + imie3 + " - " + ostatnia+" pkt");
                }
                else
                    System.out.println("3) " + imie3 + " - " + "BRAK PUNKTÓW");
            }
            else if (ktoraLista == 4) {
                if(graczL4.size() > 0) {
                    int ostatnia = (int) graczL4.get(graczL4.size() - 1);
                    System.out.println("4) " + imie4 + " - " + ostatnia+" pkt");
                }
                else
                    System.out.println("4) " + imie4 + " - " + "BRAK PUNKTÓW");
            }
            else if (ktoraLista == 5) {
                if(graczL5.size() > 0) {
                    int ostatnia = (int) graczL5.get(graczL5.size() - 1);
                    System.out.println("5) " + imie5 + " - " + ostatnia+" pkt");
                }
                else
                    System.out.println("5) " + imie5 + " - " + "BRAK PUNKTÓW");
            }
            else if (ktoraLista == 6) {
                if(graczL6.size() > 0) {
                    int ostatnia = (int) graczL6.get(graczL6.size() - 1);
                    System.out.println("6) " + imie6 + " - " + ostatnia+" pkt");
                }
                else
                    System.out.println("6) " + imie6 + " - " + "BRAK PUNKTÓW");
            }
            ktoraLista++;
        }
    }

    public String imieGraczaT(){

        String gracz = null;

        if (nrGracza == 1) {
            gracz = imie1;
        }
        else if (nrGracza == 2) {
            gracz = imie2;
        }
        else if (nrGracza == 3) {
            gracz = imie3;
        }
        else if (nrGracza == 4) {
            gracz = imie4;
        }
        else if (nrGracza == 5) {
            gracz = imie5;
        }
        else if (nrGracza == 6) {
            gracz = imie6;
        }
        return gracz;
    }


    //GETTERY I SETTERY

    public boolean isEndGame() {
        return endGame;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public void setNrGracza(int nrGracza) {
        this.nrGracza = nrGracza;
    }

    public int getNrGracza() {
        return nrGracza;
    }

    public void setImie(String imieGracza){

        if(nrGracza == 1){
            setImie1(imieGracza);
        }
        if(nrGracza == 2){
            setImie2(imieGracza);
        }
        if(nrGracza == 3){
            setImie3(imieGracza);
        }
        if(nrGracza == 4){
            setImie4(imieGracza);
        }
        if(nrGracza == 5){
            setImie5(imieGracza);
        }
        if(nrGracza == 6){
            setImie6(imieGracza);
        }
    }

    public int getIloscGraczy() {
        return iloscGraczy;
    }

    public void setIloscGraczy(int iloscGraczy) {
        this.iloscGraczy = iloscGraczy;
    }

    public String getImie1() {
        return imie1;
    }

    public void setImie1(String imie1) {
        this.imie1 = imie1;
    }

    public String getImie2() {
        return imie2;
    }

    public void setImie2(String imie2) {
        this.imie2 = imie2;
    }

    public String getImie3() {
        return imie3;
    }

    public void setImie3(String imie3) {
        this.imie3 = imie3;
    }

    public String getImie4() {
        return imie4;
    }

    public void setImie4(String imie4) {
        this.imie4 = imie4;
    }

    public String getImie5() {
        return imie5;
    }

    public void setImie5(String imie5) {
        this.imie5 = imie5;
    }

    public String getImie6() {
        return imie6;
    }

    public void setImie6(String imie6) {
        this.imie6 = imie6;
    }
}
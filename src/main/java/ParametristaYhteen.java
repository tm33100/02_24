
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(5);
    }

    public static void tulostaLuvustaYhteen(int annettuLuku) {
        int lkm = 0;
        int alku = annettuLuku;
        while (lkm < annettuLuku) {
            System.out.println(alku - lkm);
            lkm++;
        }
    }

}

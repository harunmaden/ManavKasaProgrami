import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5, tutar;
        int Armutk, Elmak, Domatesk, Muzk, Patlicank;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?:");
        Armutk= inp.nextInt();
        System.out.print("Elma Kaç Kilo ?:");
        Elmak= inp.nextInt();
        System.out.print("Domates Kaç Kilo ?:");
        Domatesk= inp.nextInt();
        System.out.print("Muz Kaç Kilo ?:");
        Muzk= inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ?:");
        Patlicank= inp.nextInt();

        tutar = (Armut*Armutk) + (Elma * Elmak) + (Domates * Domatesk) + (Muz * Muzk) + (Patlican * Patlicank);
        System.out.print("Toplam Tutar :" + tutar);

    }
}
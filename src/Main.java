import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    double tutar, kdvOran = 0.18, kdvOran2 = 0.08 , kdvliTutar , gecerliKdv;

    Scanner input = new Scanner(System.in);

        System.out.print("ürünün fiyatını giriniz : ");
        tutar = input.nextInt();
        if (tutar < 1000){
            gecerliKdv = kdvOran;
        }
        else {
            gecerliKdv = kdvOran2;
        }
        kdvliTutar = tutar+(gecerliKdv*tutar);

        System.out.println("Ürününüzün kdvli tutarı : " + kdvliTutar);
        System.out.println("Kdv Oranınız : " + gecerliKdv);
    }
}
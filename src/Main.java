import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age, distance, flightType;
        double totalPrice, kidsPrice, elderPrice, youngPrice, returnBackKids, returnBackElder, returnBackYoung;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (Tek yön=>1 Gidiş-dönüş=>2): ");
        flightType = input.nextInt();

        totalPrice = distance * 0.10;
        kidsPrice = totalPrice-(totalPrice * 0.50);
        elderPrice = totalPrice-(totalPrice * 0.30);
        youngPrice = totalPrice-(totalPrice * 0.10);
        returnBackKids = kidsPrice-(kidsPrice * 0.20);
        returnBackElder = elderPrice-(elderPrice * 0.20);
        returnBackYoung = youngPrice-(youngPrice * 0.20);

        if (distance > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
            System.out.println("Tutar: " + totalPrice);
            if (age < 12 && flightType == 1) {
                System.out.println("Ödeyeceğiniz indirimli tutar: " + kidsPrice);
            } else if (age < 12 && flightType == 2) {
                System.out.println("Ödeyeceğiniz indirimli tutar: " + returnBackKids);
            }
            if (65 < age && flightType == 1) {
                System.out.println("Ödeyeceğiniz indirimli tutar: " + elderPrice);
            } else if (65 < age && flightType == 2) {
                System.out.println("Ödeyeceğiniz indirimli tutar: " + returnBackElder);
            }
            if (12 <= age && 24 >= age) {
                if (flightType == 1) {
                    System.out.print("Ödeyeceğiniz indirimli tutar: " + youngPrice);
                } else if (flightType == 2) {
                    System.out.println("Ödeyeceğiniz indirimli tutar: " + returnBackYoung);
                }
            }
        } else {
            System.out.print("Hatalı bir tuşlama yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
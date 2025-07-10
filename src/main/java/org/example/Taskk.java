package org.example;

import java.util.Scanner;

public class Taskk {
    public static void main(String[] args) {

        String[] userNames = {"Azur", " Aysu", "Miray"};

        double[] balance = {100.0, 150.0, 80.0};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mini Bank Menyusu");

            System.out.println(" 1.Balansa bax");
            System.out.println(" 2.Pul artır");
            System.out.println(" 3.Pul çıxar");
            System.out.println(" 4.Adı dəyiş");
            System.out.println(" 5.Çıxış");
            System.out.print(" Seçim edin : ");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    balancaBax(userNames, balance, sc);
                    break;
                case 2:
                    pulArtir(userNames, balance, sc
                    );
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }

    public static void balancaBax(String[] names, double[] balance, Scanner sc) {
        sc.nextLine();
        System.out.print("user adini daxil et:  ");
        String name = sc.nextLine();
        int index = -1;
        for (int j = 0; j < names.length; j++) {
            if (names[j].equals(name)) {
                index = j;
            }
        }
        System.out.println("balans : " + balance[index]);
    }

    public static void pulArtir(String[] names, double[] balances, Scanner sc) {
        String Scanner = sc.nextLine(); //

        Scanner sc1 = new Scanner(Scanner);
        System.out.print("İstifadəçi adını daxil et: ");
        String name = sc.nextLine();

        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("İstifadəçi tapılmadı!");
            return;
        }

        System.out.print("Artırılacaq məbləği daxil et: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Məbləğ müsbət olmalıdır!");
            return;
        }

        balances[index] += amount;
        System.out.println("Yeni balans: " + balances[index]);
    }
}

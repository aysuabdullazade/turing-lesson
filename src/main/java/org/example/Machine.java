package org.example;

import java.util.Scanner;

public class Machine {
    public static void main(StringApp[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println(" Chocolate  Bar -$2.00");
            case 2:
                System.out.println(" Soda -$1.50");
            case 3:
                System.out.println(" Chips -$1.20");
            case 4:
                System.out.println(" Sandwich -$3.00");
            case 5:
                System.out.println(" Water -$1.00");

        }


    }

}


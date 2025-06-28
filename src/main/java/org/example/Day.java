package org.example;

public class Day {
    public static void main(StringApp[] args) {
        int a = 80;
        if (a < 40) {
            System.out.println("Failed- One or more exam scores are too low");
        } else if (a >= 85) {
            System.out.println("Congratulations! You have earned  a Certifacate of Excellence");

        } else if (a >= 60 && a >= 70 && a < 85) {
            System.out.println("Well done!  You have earned a Certificate of Achievement");
        } else if (a >= 50 && a < 70) {
            System.out.println("You passed");
        }
    }
}


package org.example;

public class MotoAPP {

    public static void main(String[] args) {

        Moto Aysu= new Moto("Yamaha","gray","4- stroke", 45.000);
        Moto Suzuki = new Moto("Suzuki","blue","4-stroke",50.000 );
        Moto Ducati = new Moto("Ducati","gelb","V4", 27.000 );

        System.out.println(Aysu);
        System.out.println(Suzuki);
        System.out.println(Ducati);
    }
}

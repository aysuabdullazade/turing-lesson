package org.example;

public class StringApp {

    public static void main(String[] args) {
        String a = "Aysu Abdullazde";
        String b = "aysu Abdullazde";
        String c = "Aysu abdullazde";


        boolean cavab1 = a.equals(b);
        boolean cavab2 = a.equals(c);
        char c1 = a.charAt(0);
        int d = a.length();
        char c2 = a.charAt(5);
        int e = 3;
        System.out.println(b);
        char a1 = a.charAt(0);
        System.out.println(a1);

        String soyad = a.substring(0, 5);
        System.out.println(soyad);
        System.out.println(" a equals b:" + cavab1);
        System.out.println("a eqauals c:" + cavab2);


    }

}
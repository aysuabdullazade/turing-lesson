package org.example;


public class CustomStringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer( " Qarabağ ");
        sb.append(" Azərbaycandır");
        sb.append(" Dağlıq ");
        sb.insert( 0, "Dağlıq");
        sb.delete(30, sb.length());

        System.out.println(sb);
    }
}
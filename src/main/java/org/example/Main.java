package org.example;


class Main {
    public static void main(StringApp[] args) {
        byte number = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4;
        float number5 = 5;
        double number6 = 6;
        char number7 = 'a';
        boolean number8 = true;
        System.out.println(number++);
        System.out.println(--number);
        int a = 166;
        int b = 288;
        float c=7;
        System.out.println(a+c);
        System.out.print(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a = 5);
        System.out.println(a += 3);
        System.out.println(a -= 2);
        System.out.println(a *= 2);
        System.out.println(a /=2);
        System.out.println(a %= 3);
        System.out.println(a ==b);
        System.out.println(a !=b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a >b);
        System.out.println(a <= b);
        System.out.println(a>= b);
        System.out.println(a >0 && b>0);
        System.out.println(! true);
        System.out.println(a>0|| b>0);
        System.out.printf("%d",(a++)+(--b)-(a+1)+(a+=3)+(++a));
        System.out.printf("%s",(a++)+(--b)-(a+1)+(a+=3)+(++a));
        System.out.printf("result: %2.0f",(a++)+(--b)-(a+1)+(a+=3)+(++c));
        System.out.println(a<b ?"aysu": a>b ?"murad":"tural");

    }
}

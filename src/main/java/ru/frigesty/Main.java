package ru.frigesty;

public class Main {
    public static void main(String[] args) {
        // Целечисленные типы данных
        byte b = 69;
        int i0 = 2147483640;
        int i1 = 2147483000;
        short s = 43;
        int i = 150;
        long l = 2000L;
        //Числа с плавующей точкой
        float f = 49.4F;
        double d = 49.4;

        System.out.println("Операторы арифметики +, -, *, /, %");
        System.out.println(b + " + " + s + " = " + (b + s));
        System.out.println(i + " + " + d + " = " + (i + d));
        System.out.println(b + " - " + s + " = " + (b - s));
        System.out.println(b + " * " + i + " = " + (b * i));
        System.out.println(i + " / " + b + " = " + (i / b));
        System.out.println(l + " / " + s + " = " + (l / s) + " Остаток: " + (l % s));

        System.out.println("Операторы сравнения >, <, >=, <=, !=, ==");
        System.out.println(b + " > " + s + " = " + (b > s));
        System.out.println(b + " < " + s + " = " + (b < s));
        System.out.println(b + " >= " + s + " = " + (b >= s));
        System.out.println(b + " <= " + (s + 26) + " = " + (b <= (s+26)));
        System.out.println(b + " != " + b + " = " + (b != b));
        System.out.println(f + " == " + d + " = " + (f == d));

        System.out.println("Переполнение");
        System.out.println(i1 + " + " + i0 + " + " + i +" = " + (i1 + i0 + i));
    }
}

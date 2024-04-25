import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);
    private static final float p = 3.14F;

    public static void main(String[] args) {
        Tamrin_1();
//        Tamrin_2();
//        Tamrin_3();
    }

    private static void Tamrin_1() {
        System.out.println("Enter Radius");
        float Radius = input.nextFloat();

        float pi = (float) Math.PI;
        float area = 4 * pi * Radius * Radius;
        float volume = (4 / 3) * pi * Radius * Radius * Radius;

        System.out.println("مساحت کره : " + area);
        System.out.println("حجم کره : " + volume);
    }

    private static void Tamrin_2() {
        int result1 = -1 + 4 * 6;
        int result2 = (35 + 5) % 7;
        int result3 = 14 + -4 * 6 / 11;
        int result4 = 2 + 15 / 6 * 1 - 7 % 2;

        System.out.println("-1 + 4 * 6 = " + result1);
        System.out.println("(35 + 5) % 7 = " + result2);
        System.out.println("14 + -4 * 6 / 11 = " + result3);
        System.out.println("2 + 15 / 6 * 1 - 7 % 2 = " + result4);
    }

    private static void Tamrin_3() {
        System.out.println("enter a number :");
        double celsius = input.nextFloat();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("جواب شما است :" + fahrenheit);
    }
}
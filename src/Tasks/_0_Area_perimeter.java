package Tasks;

import java.util.Scanner;

public class _0_Area_perimeter {
    public static void main(String[] args) {
        /*
        Напишите программу на Java,
        которая принимает  два числа - ширину и длинну. Нужно найти периметр и площадь,
        вывести их на печать. Значение считается с плавающей точкой.
        */
        area_per();
    }
    static void area_per(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину: ");
        double a = scanner.nextDouble();

        System.out.println("Введите длинну: ");
        double b = scanner.nextDouble();

        double p = (a + b) * 2;
        double s = a * b;
        System.out.println("Периметр равен: " + p);
        System.out.println("Площадь равна: " + s);

    }
}


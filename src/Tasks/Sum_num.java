package Tasks;

import java.util.Scanner;

//С клавиатуры вводится число, нужно
// посчитать сумму цифр этого числа и вывести на печать
public class Sum_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int b = 0;
        while (a != 0) {
            b = b + a % 10;
            a = a / 10;
        }
        System.out.println(b);
    }

}

package Tasks;

import java.util.Scanner;

public class Even_not_even {
    //Вводится два числа, если певрое число четное
    //выводится первое число умноженное на второе, иначе выводится
    //первое число плюс второе
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        if (a % 2 == 0){
            System.out.println(a * b);
        }
        else {
            System.out.println(a + b);
        }
    }
}

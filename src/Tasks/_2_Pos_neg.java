package Tasks;

import java.util.Scanner;

public class _2_Pos_neg {
    //С консоли вводится целое число, если это число положительное, вывести строку *Число n - положительное*,
    // если это число отрицательное, вывести  *Число n - отрицательное*
    //иначе вывести *Число n = 0*
    public static void main(String[] args) {
        System.out.println("Программа по определению положительного числа или отрицательного");
        System.out.println();
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0){
            System.out.println("Число " + n + " - положительное ");
        }
        else if (n < 0 ){
            System.out.println("Число " + n + " - отрицательное ");
        }
        else {
            System.out.println("Число " + n + " = 0 ");
        }
    }
}

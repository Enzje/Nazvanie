package Tasks;

import java.util.Scanner;

public class _4_Simple_calc {
    //На вход поступает два числа, после этого из предложенного списка требуется выбрать математическую операцию
    // напечатав соответствующую цифру:
    //1. Сложение
    //2. Вычетание
    //3. Умножение
    //4. Деление
    //Если введно значение не из указанного диапазона, вывести сообщение: Вы неправильно выбрали знак
    //В качестве результата должен быть выведен результат математической операции.
    public static void main(String[] args) {
        System.out.println("Задача простейшего калькулятора");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите знак: ");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");

        int operand = scanner.nextInt();
        if (operand < 1 || operand > 4)
            System.out.println("Вы неправильно выбрали знак");
        else {
            switch (operand){
                case 1:
                    System.out.println("Сложение");
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println("Вычитание");
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println("Умножение");
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println("Деление");
                    System.out.println(num1 / num2);
                    break;
            }
        }

    }
}

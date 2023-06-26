package Tasks;

import java.util.Scanner;

public class _5_Bank_system {
    //Задача по подсчету суммы вклада в банк. Вводится два целых значения. Первое - сумма вклада в рублях.
    // Второе - количетсво лет, на, которое будет произведеен вклад. Нужно вывести итогувую сумму, которую получит клиент банка.
    //Условия для вклада:
    //1. Минимальная процентная ставка = 6%
    //2. Минимальное количество лет = 1 год
    //3. Если сумма вклада >= 1 000 000 рублей, то к процентной ставке добавляется 0.5%
    //4. Если количество лет >= 7, к процентной ставке добавляется 0.4%
    public static void main(String[] args) {
        System.out.println("Задачи по вычислению суммы вклада в банк");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        double percent = 6;
        double res;

        System.out.println("Введите сумму вклада: ");
        double start_sum = scanner.nextInt();

        System.out.println("Введите количество лет вклада: ");
        int year = scanner.nextInt();


        if (start_sum >= 1_000_000){
            percent +=0.5;
        }
        if (year >= 7){
            percent += 0.4;

        }

        for (int i = 0; i <year; i++){
            start_sum = start_sum *(percent/100) + start_sum;
        }
        res = start_sum;
        System.out.println(res);
    }
}

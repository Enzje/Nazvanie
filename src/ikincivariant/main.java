package ikincivariant;

import ikincivariant.manager;
import ikincivariant.base;

public class main {
    public static void main(String[] args) {
        manager manager1 = manager.getByConsole();

        manager[] exp = new manager[3];

        for(int i = 0; i < exp.length; i++){
            exp[i] = manager.getByConsole();
        }

        boolean equal = false;

        for (manager manager: exp) {
            double b = manager.calculate();

            if(b == manager1.calculate()){
                equal = true;
            }

            System.out.println(b);
        }

        System.out.println("Совпадает с каким-либо из массива: " + equal);

        base equt1 = new base(3, 0, 0, 1, 0);
        base equt2 = new base(-1, 0, 0, 0, 1);
        base equt3 = new base(1, 0, 0, 0, 0);

        System.out.println("equt1 = " + equt1.calc());
        System.out.println("equt2 = " + equt2.calc());
        System.out.println("equt3 = " + equt3.calc());
    }
}
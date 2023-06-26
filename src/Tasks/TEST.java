package Tasks;

public class TEST {
    public static void main(String[] args) {
        int a = 78, b = 0, c = 0;
        //int b, c, d;
        b = b + a % 10;
        a = a / 10;
        c = a + b;
        //c = (a - b) / 10;
        //d = c / 0.1;
        // d = (b - c) /10;
        System.out.println(c);
    }
}

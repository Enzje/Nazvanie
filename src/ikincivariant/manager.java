package ikincivariant;

import java.lang.Math;
import java.util.Scanner;

public class manager {
    double x;
    double y;
    double z;

    public manager(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static manager getByConsole(){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        return new manager(x, y, z);
    }

    public double calculate(){
        return (Math.sin(z) + Math.cos(2 * x)) / (2 * Math.pow(x, 5) + Math.tan(x)) + Math.pow(3 * x + 2 * y, 1 / 3);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    @Override

    public String toString(){
        String str = String.format("X: %f \nY: %f \n Z: %f", x, y, z);

        return str;
    }
}

package ikincivariant;


public class base extends manager{
    double a;
    double b;

    public base(double x, double y, double z, double a, double b){
        super(x, y, z);
        this.a = a;
        this.b = b;
    }

    public double calc(){
        if(x > 2){
            return Math.pow(Math.cos(Math.pow(a * x, 2)), 3);
        }
        else if(x <= -1){
            return Math.pow(Math.sin(x), 2) + b / x;
        }
        else{
            return Math.pow(2 - x * x, 3);
        }
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }
}

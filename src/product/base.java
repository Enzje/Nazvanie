package product;

import java.util.Scanner;

public class base {
    String title;
    String processor;
    int ram;
    int ssd;

    public base(String title, String processor, int ram, int ssd){
        this.title = title;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    public base(){
        this.title = null;
        this.processor = null;
        this.ram = 0;
        this.ssd = 0;
    }

    public static base getByConsole(){
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String processor = sc.nextLine();
        int ram = sc.nextInt();
        int ssd = sc.nextInt();

        return new base(title, processor, ram, ssd);
    }

    public String getTitle(){
        return title;
    }

    public String getProcessor(){
        return processor;
    }

    public double getRam(){
        return ram;
    }

    public int getSsd(){
        return ssd;
    }

    @Override

    public String toString(){
        String str = String.format("Название: %s \nПроцессор: %s \nRAM: %d \nSSD: %d", title, processor, ram, ssd);

        return str;
    }
}

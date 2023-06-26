import product.base;

public class main {
    public static void main(String[] args) {
        base[] an = {
                new base ("Dell901", "Ryzen7", 16, 1024),
                new base ("Asus2009", "i3Core", 8, 512),
                new base ("Acer1000", "AMD1500", 6, 128),
                new base ("ThinkpadX250", "i5Core", 32, 256),
                new base (),
                new base ()

        };

        an[4] = base.getByConsole();
        an[5] = base.getByConsole();

        System.out.println("Все  объекты, Название которых начинается на \"A\": ");

        for(base laptop: an){
            if(laptop.getTitle().charAt(0) == 'A'){
                System.out.println(laptop.toString());
            }
        }

        String minTitle = an[0].getTitle();
        int indexOfMIn = 0;
        int counter512 = 0;
        int midRAm = 0;

        for (int i = 0; i < an.length; i ++){
            if(an[i].getTitle().length() < minTitle.length()){
                minTitle = an[i].getTitle();
                indexOfMIn = i;
            }

            if(an[i].getSsd() >= 512){
                counter512++;
            }

            midRAm += an[i].getRam();
        }

        midRAm /= an.length;

        System.out.println("Среднее значение объема RAM:" + midRAm);

        System.out.println("Количество объектов у которых размер SSD не меньше чем 512: " + counter512);

        System.out.println("Объект с самым коротким названием: ");
        System.out.println(an[indexOfMIn].toString());
    }
}

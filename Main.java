import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObh = new Scanner(System.in);
        Television panasonic = new Television("Panasonic",120,12,12999);
        Television msi = new Television("MSI",240,32,8999);
        Computer asus = new Computer("Asus",240,22,29999);
        Charger glo = new Charger("GLO",12,3,499);
        Charger apple = new Charger("Apple",10,2,999);
        Electrics[] electrics = {panasonic,asus,apple};
        System.out.println("Список всіх приладів під'єднаних до розетки");
        for (int i =0;i<electrics.length;i++){
            System.out.println(electrics[i].toString());
        }
        System.out.println("\nПотужність приладів ввімкнутих в розетку: " + Electrics.pwrUsage(electrics)+"Вт");
        Arrays.sort(electrics,new SortByPower());
        System.out.println("\nприлади відсортовані за потужністю");
        for (int i=0;i<electrics.length;i++){
            System.out.println(electrics[i].toString());
        }
        System.out.println("Введіть менше число діапазона пошуку:");
        int a = myObh.nextInt();
        System.out.println("Введіть більше число з діапазону пошуку:");
        int b = myObh.nextInt();
        //int a = 2;
        //int b = 30;
        for (int i =0;i<electrics.length;i++){
            if ((electrics[i].getRadiation()>=a) && (electrics[i].getRadiation()<=b)){
                System.out.println("Прилад в заданому діапазоні випромінювання: \n"+electrics[i].toString());
            }
        }
    }
}
import java.util.Arrays;
import java.util.Comparator;

public class Electrics {
    public String name;
    public int power;
    public int radiation;
    public int price;


    public int getPower(){
    return power;
    }
    public String getName(){
        return name;
    }
    public int getRadiation(){
        return radiation;
    }
    public int getPrice(){
        return price;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRadiation(int radiation){
        this.radiation = radiation;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Electrics(String name,int pw,int rad,int prc){
        setName(name);
        setPower(pw);
        setRadiation(rad);
        setPrice(prc);
    }
    public static int pwrUsage(Electrics[] m){
        int usage = 0;
        for(int i = 0;i<m.length;i++){
            usage += m[i].getPower();
        }
        return usage;
    }
    public String toString(){
        return this.name + " " + this.power + "Вт" + " " + this.price + "Uah" + " " + this.radiation+"rad";

    }

}

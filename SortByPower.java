import java.util.Comparator;

public class SortByPower implements Comparator<Electrics>{
    @Override
    public int compare(Electrics o1, Electrics o2) {
        return o1.power - o2.power;
    }
}

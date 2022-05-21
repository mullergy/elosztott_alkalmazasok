package JavaGarden;

import java.util.Comparator;

public class NovenyArComparator implements Comparator<Noveny>{
    
    @Override
    public int compare(Noveny n1, Noveny n2) {
        return n1.getEgysegar() - n2.getEgysegar();
    }
}

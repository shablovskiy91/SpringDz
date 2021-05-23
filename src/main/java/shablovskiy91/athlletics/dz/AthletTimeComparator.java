package shablovskiy91.athlletics.dz;

import java.util.Comparator;

public class AthletTimeComparator implements Comparator<Athlet> {

    public int compare(Athlet a, Athlet b) {

        return a.getTime().compareTo(b.getTime());
    }
}

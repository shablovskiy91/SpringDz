package shablovskiy91.athlletics.dz;

import java.io.File;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public interface ResultProcessor {

    public List<Athlet> getNFastests(File file, TreeSet<Athlet> athletes, int n, String gender, String distance);

    public void printResults(List<Athlet> NfastestAthlets);

}

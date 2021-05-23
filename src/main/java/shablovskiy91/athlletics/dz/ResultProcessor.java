package shablovskiy91.athlletics.dz;

import java.io.File;
import java.util.List;
import java.util.TreeSet;


public interface ResultProcessor {
    List<Athlet> getNFastests(File file, TreeSet<Athlet> athletes, int n, String gender, String distance);
    void printResults (List<Athlet> filteredAthlets);
}

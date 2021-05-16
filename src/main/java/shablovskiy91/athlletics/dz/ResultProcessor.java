package shablovskiy91.athlletics.dz;

import java.io.File;
import java.util.HashSet;

public interface ResultProcessor {
    void printResults(File file, HashSet<Athlet> athletes);
    void printNFastests(File file, HashSet<Athlet> athletes, int n, String sex, String distance);
}

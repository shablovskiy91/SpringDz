package shablovskiy91.athlletics.dz;

import java.util.HashSet;
import java.util.TreeSet;

public interface Converter {
    Athlet convertLineToAthlet(String line);
    TreeSet<Athlet> convertCsvToAthletes(String inputData);
}

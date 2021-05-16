package shablovskiy91.athlletics.dz;

import java.util.HashSet;
import java.util.TreeSet;

public interface Converter {
    Athlet convertLineToAthlet(String line);
    HashSet<Athlet> convertCsvToAthletes(String inputData);
}

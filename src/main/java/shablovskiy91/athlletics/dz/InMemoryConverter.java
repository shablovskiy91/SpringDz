package shablovskiy91.athlletics.dz;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.TreeSet;

@Service
public class InMemoryConverter implements Converter {
    private final HashSet<Athlet> competitionsData;

    public InMemoryConverter(HashSet<Athlet> competitionsData) {
        this.competitionsData = competitionsData;
    }

    @Override
    public HashSet<Athlet> convertCsvToAthletes(String inputData) {
        HashSet<Athlet> athlets = new HashSet<Athlet>();
        String [] lines = inputData.split("\r\n");
        for (int i = 1; i < lines.length; i++ ) {
            athlets.add(convertLineToAthlet(lines[i]));
        }
        return athlets;
    }

    @Override
    public Athlet convertLineToAthlet(String line) {
        String[] athletData = line.split(",");
        return new Athlet(athletData[1], athletData[2], athletData[3], athletData[4]);
    }
}

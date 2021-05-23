package shablovskiy91.athlletics.dz;

import org.springframework.stereotype.Service;

import java.util.TreeSet;

@Service
public class InMemoryConverter implements Converter {
    private final TreeSet<Athlet> competitionsData;

    public InMemoryConverter(TreeSet<Athlet> competitionsData) {
        this.competitionsData = competitionsData;
    }

    @Override
    public TreeSet<Athlet> convertCsvToAthletes(String inputData) {
        TreeSet<Athlet> athlets = new TreeSet<Athlet>(new AthletTimeComparator());

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

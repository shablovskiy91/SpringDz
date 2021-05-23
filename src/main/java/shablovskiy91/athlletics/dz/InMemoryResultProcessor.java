package shablovskiy91.athlletics.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class InMemoryResultProcessor implements ResultProcessor {

    private final Collection<Athlet> results;

    // объект интерфейса
    private final Converter converter;

    // Конструктор принимает интерфейс
    @Autowired
    public InMemoryResultProcessor(Collection<Athlet> results, Converter converter) {
        this.results = results;
        this.converter = converter;
    }

    @Override
    public List<Athlet> getNFastests(File file, TreeSet<Athlet> athletes, int n, String gender, String distance) {
        // Print only N athletes filtered by distance and sex
        return athletes.stream()
                .filter(athlet -> athlet.getGender().equals(gender) && athlet.getDistance().equals(distance))
                .limit(n)
                .collect(Collectors.toList());
    }

    @Override
    public void printResults (List<Athlet> NfastestAthlets) {
        for (Athlet athlet : NfastestAthlets)
        {
            System.out.println(athlet.toString());
        }
    };
}

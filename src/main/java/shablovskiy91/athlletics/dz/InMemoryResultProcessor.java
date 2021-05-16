package shablovskiy91.athlletics.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Service
public class InMemoryResultProcessor implements ResultProcessor {

    // объект интерфейса
    private final Converter converter;

    // Конструктор принимает интерфейс
    @Autowired
    public InMemoryResultProcessor(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void printResults(File file, HashSet<Athlet> athletes) {
        for (Athlet athlet : athletes) {
            System.out.println(athlet.toString());
        }

    }

    @Override
    public void printNFastests(File file, HashSet<Athlet> athletes, int n, String distance, String sex) {
        //Создаём сет n быстрых легкоатлетов
        HashSet<Athlet> fastests = new HashSet<Athlet>();
        
    }
}

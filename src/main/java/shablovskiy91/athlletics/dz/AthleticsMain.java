package shablovskiy91.athlletics.dz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class AthleticsMain {
    public static void main(String[] args) throws IOException {
        var applicationContext = new AnnotationConfigApplicationContext(AthleticsConfig.class);

        var converter = applicationContext.getBean(Converter.class);
        var resultProcessor = applicationContext.getBean(ResultProcessor.class);

        File inputFile = new File("AthleticsData.csv");
        String string = Files.readString(inputFile.toPath(), Charset.defaultCharset());

        // Выведем результат
        resultProcessor.printResults(inputFile, converter.convertCsvToAthletes(string));

        // Выведем 5 быстрых женщин на дистанции 10 км.
        resultProcessor.printNFastests(inputFile, converter.convertCsvToAthletes(string), 5, "Ж", "10 км");

    }
}

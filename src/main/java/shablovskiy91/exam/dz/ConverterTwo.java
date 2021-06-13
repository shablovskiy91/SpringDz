package shablovskiy91.exam.dz;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public interface ConverterTwo {
    TreeMap<Integer, String> convertCsvToTheAnswers(File file) throws IOException;
    Integer convertLineToTaskNumber(String line);
    String convertLineToTaskAnswer(String line);
}

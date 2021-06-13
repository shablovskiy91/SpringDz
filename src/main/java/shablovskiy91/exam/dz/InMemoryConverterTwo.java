package shablovskiy91.exam.dz;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.TreeMap;

@Service
public class InMemoryConverterTwo implements ConverterTwo {

    @Override
    public TreeMap<Integer, String> convertCsvToTheAnswers(File inputFile) throws IOException {
        String oneBigString = Files.readString(inputFile.toPath(), Charset.defaultCharset());
        TreeMap<Integer, String> answers = new TreeMap<Integer, String>(new AnswerComparator());

        String [] lines = oneBigString.split("\r\n");

        // line[0] is the header of table
        for (int i = 1; i < lines.length; i++) {
            answers.put(convertLineToTaskNumber(lines[i]), convertLineToTaskAnswer(lines[i]));
        }

        return answers;
    }

    // String answerData = "taskNumber, variant1, variant2, ..., variantN"

    @Override
    public Integer convertLineToTaskNumber(String line) {
        String[] answerData = line.split(",");
        return Integer.valueOf(answerData[0]);
    }

    @Override
    public String convertLineToTaskAnswer(String line) {
        String[] answerData = line.split(",");
        String taskAnswer = answerData[1].trim();
        // If variants > 1, concat all the variants to one "answer string" and return this
        if (answerData.length > 2) {
            for (int i = 2; i < answerData.length; i++) {
                taskAnswer = taskAnswer.concat(answerData[i].trim());
            }
        }

        return taskAnswer;
    }

}

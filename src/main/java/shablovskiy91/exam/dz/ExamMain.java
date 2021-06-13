package shablovskiy91.exam.dz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.TreeMap;

public class ExamMain {
    public static void main(String[] args) throws IOException {
        var applicationContext = new AnnotationConfigApplicationContext(ExamConfig.class);

        var converterTwo = applicationContext.getBean(ConverterTwo.class);
        var resultsProcessor = applicationContext.getBean(ResultsProcessor.class);

        // Get both files: correct answers and pupil answers
        File correctExamAnswers = new File("CorrectExamAnswers.csv");
        File pupilExamAnswers = new File("ExamAnswers.csv");

        int pupilTotalScore = 0;

        try {
            pupilTotalScore = resultsProcessor.calcExamTotalScore(
                    converterTwo.convertCsvToTheAnswers(correctExamAnswers),
                    converterTwo.convertCsvToTheAnswers(pupilExamAnswers));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Pupil pupil1 = new Pupil("Василий Васильевич Васильев", pupilTotalScore);

        //print pupil results
        resultsProcessor.printResults(pupil1);

    }
}

package shablovskiy91.exam.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
public class InMemoryResultsProcessor implements ResultsProcessor {

    private final ConverterTwo converterTwo;
    private final TaskRateResolver taskRateResolver;

    @Autowired
    public InMemoryResultsProcessor(ConverterTwo converterTwo, TaskRateResolver taskRateResolver) {
        this.converterTwo = converterTwo;
        this.taskRateResolver = taskRateResolver;
    }

    @Override
    public int calcExamTotalScore(TreeMap correctAnswers, TreeMap pupilAnswers) throws Exception {
        int totalScore = 0;
        // Check data validity
        if (correctAnswers.size() != pupilAnswers.size())
            throw new Exception("Exam data not correct! File size is different" + correctAnswers.size() + pupilAnswers.size());
        for (Object key : correctAnswers.keySet()) {
            if (!correctAnswers.get(key).equals(pupilAnswers.get(key))) {
                throw new Exception("Exam data not correct! " + pupilAnswers.get(key));
            }
        }

        // compare values


        System.out.println(correctAnswers);

        return totalScore;
    }

    @Override
    public void printResults(Pupil pupil) {
        System.out.println(pupil.toString());
    }

}

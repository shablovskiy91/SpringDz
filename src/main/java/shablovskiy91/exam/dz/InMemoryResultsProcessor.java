package shablovskiy91.exam.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;
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
    public int calcExamTotalScore(Map correctAnswers, Map pupilAnswers) throws Exception {
        int totalScore = 0;

        // Check data validity
        if (correctAnswers.size() != pupilAnswers.size()) {
            throw new Exception("Exam data not correct! File size is different" + correctAnswers.size() + pupilAnswers.size());
        }

        // compare answer values
        Iterator<Integer> iterator = correctAnswers.keySet().iterator();
        while(iterator.hasNext()) {
            int taskNumber = iterator.next();
            String correctAnswer = (String) correctAnswers.get(taskNumber);
            String pupilAnswer = (String) pupilAnswers.get(taskNumber);
            if (pupilAnswer.equals(correctAnswer)) {
                int taskRate = taskRateResolver.getTaskRate(taskNumber);
                totalScore = totalScore + taskRate;
            }
        }

        return totalScore;
    }

    @Override
    public void printResults(Pupil pupil) {
        System.out.println(pupil.toString());
    }

}

package shablovskiy91.exam.dz;

import java.util.Map;

public interface ResultsProcessor {

    int calcExamTotalScore(Map correctAnswersFile, Map pupilAnswersFile) throws Exception;

    void printResults(Pupil pupil);
}

package shablovskiy91.exam.dz;

import java.io.File;
import java.util.TreeMap;

public interface ResultsProcessor {

    int calcExamTotalScore(TreeMap correctAnswersFile, TreeMap pupilAnswersFile) throws Exception;

    void printResults(Pupil pupil);
}

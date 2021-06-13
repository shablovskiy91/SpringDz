package shablovskiy91.exam.dz;

import java.util.TreeMap;

public class Pupil {
    private final String fullName;
    private final int totalScore;

    public Pupil(String fullName, int totalScore) {
        this.fullName = fullName;
        this.totalScore = totalScore;
    }

    public String getFullName() {
        return fullName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString(){
        return "Ученик " +
                fullName + "." +
                " Набрано баллов: " +
                totalScore;
    }

}

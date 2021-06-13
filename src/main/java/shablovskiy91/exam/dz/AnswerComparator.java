package shablovskiy91.exam.dz;

import java.util.Comparator;

public class AnswerComparator implements Comparator<Integer> {

    @Override
    public int compare (Integer a, Integer b) {

        return a.compareTo(b);
    }
}

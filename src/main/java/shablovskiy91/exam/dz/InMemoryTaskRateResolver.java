package shablovskiy91.exam.dz;

import com.google.inject.OutOfScopeException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InMemoryTaskRateResolver implements TaskRateResolver {

    @Value("#{'${rate.group1}'}")
    private int rateGroup1;

    @Value("#{'${rate.group2}'}")
    private int rateGroup2;

    @Value("#{'${rate.group3}'}")
    private int rateGroup3;

    @Override
    public int getTaskRate(Integer taskNumber) throws Exception {
        for (int i = 1; i <= 4; i++) {
            if (taskNumber.equals(i)){
                return rateGroup1;
            }
        }
        for (int i = 5; i <= 8; i++) {
            if (taskNumber.equals(i)){
                return rateGroup2;
            }
        }
        for (int i = 9; i <= 10; i++) {
            if (taskNumber.equals(i)){
                return rateGroup3;
            }
        }
        throw new Exception("No such Task number: " + taskNumber);
    }
}

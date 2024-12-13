
/**
 * Write a description of class DailyStepLog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DailyStepLog
{
    // instance variables - replace the example below with your own
    private String day;
    private int stepCount;
    private boolean metTarget;

    /**
     * Constructor for objects of class DailyStepLog
     */
    public DailyStepLog(String day, int stepCount) {
        this.day = day;
        this.stepCount = stepCount;
        this.metTarget = stepCount >= 10_000;
    }

    
    public String getDay() {
        return day;
    }

    
    public int getStepCount() {
        return stepCount;
    }

    
    public boolean isTargetAchieved() {
        return metTarget;
    }
}




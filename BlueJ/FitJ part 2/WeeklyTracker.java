import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * 
 * Write a description of class WeeklyTracker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeeklyTracker
{
    // instance variables - replace the example below with your own
    private DailyStepLog[] weeklySteps;
    private int dailyStepTarget;

    /**
     * Constructor for objects of class WeeklyTracker
     */
    public WeeklyTracker()
    {
        weeklySteps = new DailyStepLog[7];
        dailyStepTarget=10_000;
    }
    

    //getter
    public DailyStepLog[] getWeeklySteps(){
        return this.weeklySteps;
    }
        
    
    //setter
    public void setWeeklySteps(DailyStepLog[] weeklySteps){
        this.weeklySteps = weeklySteps;
    }
    

    //getMax
    public int getMax() {
        int max = weeklySteps[0].getStepCount();
        for (int i = 1; i < weeklySteps.length; i++) {
            if (weeklySteps[i].getStepCount() > max) {
                max = weeklySteps[i].getStepCount();
            }
        }
        return max;
    }
    

    //getMin
    public int getMin() {
        int min = weeklySteps[0].getStepCount();
        for (int i = 1; i < weeklySteps.length; i++) {
            if (weeklySteps[i].getStepCount() < min) {
                min = weeklySteps[i].getStepCount();
            }
        }
        return min;
    }
    
    
    //getAverage
    public double getAverage() {
        int total = 0;
        for (int i = 0; i < weeklySteps.length; i++) {
            total += weeklySteps[i].getStepCount();
        }
        return (double) total / weeklySteps.length;
    }
    
 
    //{dailySte1, dailySte2, dailySte3}
    //print steps
    public void listWeeklySteps(){ 
        for(int i = 0; i < weeklySteps.length; i++){
            System.out.print(weeklySteps[i].getStepCount());
            if (i < weeklySteps.length - 1){
                System.out.print( ", ");
            }
            }
        }        
    

    //getNumber of days step target achieved
    public int getNumDaysTargetAchieved(){
        int count = 0;
    
        for(int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i].getStepCount() >= dailyStepTarget){
                count++;
            }
        }
        return count;
    }
    
        
    //get days target achieved
    public String[] getDaysAchieved(){ //change this to match getWeekDays
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", 
                            "Friday", " Saturday", "Sunday"};
        String[] daysAchieved = new String [getNumDaysTargetAchieved()];
        int count = 0;
        
        for(int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i].getStepCount() >= dailyStepTarget){
                daysAchieved[count] = weekDays[i];
                count ++;
            }
        }
        return daysAchieved;
    }
    

    //getWeekDay steps
    public DailyStepLog[] getWeekdaySteps() {
        DailyStepLog[] weekDaySteps = new DailyStepLog[5];
        
        for (int i = 0; i < 5; i++) {
            weekDaySteps[i] = weeklySteps[i];
        }
        return weekDaySteps;
    }   
    

    //getWeekEnd steps
    public DailyStepLog[] getWeekendSteps() { //same here
        DailyStepLog[] weekendSteps = new DailyStepLog[2];
        
        for (int i = 0; i < 2; i++) {
            weekendSteps[i] = weeklySteps[i + 5];
        }
        return weekendSteps;
    }
 
    
    //bubble sort
    public void bubbleSort() {
        for (int i = 0; i < weeklySteps.length; i++) {
            for (int j = 0; j < weeklySteps.length - 1 - i; j++) {
                if (weeklySteps[j].getStepCount() > weeklySteps[j + 1].getStepCount()) {
                    DailyStepLog temp = weeklySteps[j];
                    weeklySteps[j] = weeklySteps[j + 1];
                    weeklySteps[j + 1] = temp;
                }
            }
        }
    }
 

    //remove element
    public void removeElement(int num){
        DailyStepLog[] newArray = new DailyStepLog[weeklySteps.length - 1];        
        int j = 0;
        
        for (int i = 0; i < weeklySteps.length; i++){
            if(i != num){
                newArray[j] = weeklySteps[i];
                j++;
            } 
        }
        this.weeklySteps = newArray;
    }
    

    // array list days achieved
    public ArrayList<String> arrayListDaysAchieved(){
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", 
                            "Friday", " Saturday", "Sunday"};
                            
        ArrayList <String> daysAchieved = new ArrayList <>();
        
        for (int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i].getStepCount() >= dailyStepTarget) {
                daysAchieved.add(weekDays[i]);
            }                
        }
        
        if (daysAchieved.isEmpty()){
            
            System.out.println("The goal was not achieved on any day.");
        }else{
            System.out.println("The goal was achieved on " + String.join(", ", daysAchieved));
        }
        return daysAchieved;        
    }
    


    /**
     * loads data from steps file
     * @param  filesName name of file
     * 
     */
    public void loadData(String fileName)
    {
        // put your code here
        try {
            Scanner scanner = new Scanner( Paths.get(fileName));
            String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int i=0;
            while(scanner.hasNextInt()){
                   // weeklyLogs[i].setStepCount(scanner.nextInt());
                   // weeklyLogs[i].setDay(days[i]);
                   int steps=scanner.nextInt();
                   boolean metTarget=false;
                   if (steps>dailyStepTarget){
                       metTarget = true;
                   }
                   this.weeklySteps[i] = new DailyStepLog(days[i], steps);
                i++;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

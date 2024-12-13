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
    private int[] weeklySteps;
    private int dailyStepTarget;


    /**
     * Constructor for objects of class WeeklyTracker
     */
    public WeeklyTracker()
    {
        // initialise instance variables
        weeklySteps = new int[7];
        dailyStepTarget=10_000;
    }
    
    //getter
    public int[] getWeeklySteps(){
        return this.weeklySteps;
    }
        
    
    //setter
    
    public void setWeeklySteps(int[] weeklySteps){
        this.weeklySteps = weeklySteps;
    }
    
    //getMax
    
    public int getMax(){
        int max = weeklySteps[0];
        for(int i = 1; i < weeklySteps.length; i++){
            if (weeklySteps[i] > max){
                max = weeklySteps[i];
            }
        }
        return max;
    }
    

    
    //getMin
    
    public int getMin(){
        int min = weeklySteps[0];
        
        for(int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i] < min){
                min = weeklySteps[i];
            }
        }
        return min;
    }
    
    
    //getAverage
    
    public double getAverage(){
        int total = 0;
        
        for(int i = 0; i < weeklySteps.length; i++){
            total += weeklySteps[i];
        }
        return (double)total/ weeklySteps.length;
    }
    
 
    
    //print steps
    
    public void listWeeklySteps(){
        for(int i = 0; i < weeklySteps.length; i++){
            if (i < weeklySteps.length - 1){
                System.out.print(weeklySteps[i]+ ", ");
            }else{
                System.out.print(weeklySteps[i]);
            }
        }
    }
    


    
    //getNumber of days step target achieved
    
    public int getNumDaysTargetAchieved(){
        int count = 0;
    
        for(int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i] >= dailyStepTarget){
                count++;
            }
        }
        return count;
    }
    
        
    //get days target achieved
    public String[] getListDaysAchieved(){
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", 
                            "Friday", " Saturday", "Sunday"};
        String[] daysAchieved = new String [getNumDaysTargetAchieved()];
        int count = 0;
        
        for(int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i] >= dailyStepTarget){
                daysAchieved[count] = weekDays[i];
                count ++;
            }
        }
        
        
        return daysAchieved;
    }
    
    //getWeekDay steps
    public int[] getWeekdaySteps() {
        int[] weekDaySteps = new int[5];
        
        for (int i = 0; i < 5; i++) {
            weekDaySteps[i] = weeklySteps[i];
        }
        return weekDaySteps;
    }    
    
    //getWeekEnd steps
    
    public int[] getWeekendSteps() {
        int[] weekendSteps = new int[2];
        
        for (int i = 0; i < 2; i++) {
            weekendSteps[i] = weeklySteps[i + 5];
        }
    
        return weekendSteps;
    }

    public ArrayList<String> arrayListDays(){
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", 
                            "Friday", " Saturday", "Sunday"};
                            
        ArrayList <String> daysAchieved = new ArrayList <>();
        
        for (int i = 0; i < weeklySteps.length; i++){
            if (weeklySteps[i] >= dailyStepTarget) {
                daysAchieved.add(weekDays[i]);
            }                
        }
        System.out.println("The goal was achieved on " + String.join(", ", daysAchieved));
        
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
           
            int i=0;
            while(scanner.hasNextInt()){
               
                weeklySteps[i]=scanner.nextInt();
                i++;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
            
    }
}

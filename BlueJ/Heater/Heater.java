/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    private int temperature;
    private int min;
    private int max;
    private int increment;
    

    /**
     * Constructor for objects of class Heater
     */
    public Heater(int minTemp, int maxTemp)
    {
        this.temperature = 15;
        this.min = minTemp;
        this.max = maxTemp;
        this.increment = 5;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void warmer()
    {
        if (temperature + increment <= max){
                    temperature += increment;

        }
        else{
            System.out.println("It's too hot in here.");
        }
    }
    
        public void cooler()
    {
                if (temperature - increment >= min){
                    temperature -= increment;

        }
        else{
            System.out.println("It's too cold in here.");
        }
    }


    public int currentTemp()
    {
        // put your code here
        return temperature;
    }
}

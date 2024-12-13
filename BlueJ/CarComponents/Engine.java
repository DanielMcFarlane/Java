
/**
 * Write a description of class Engine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Engine {
    private boolean engine;
    private boolean running;
    
    public void start() {
        System.out.println("Engine started.");
        engine = true;
    }
    
    public void stop(){
        System.out.println("Engine stopped");
        engine = false;
    }
    
    public boolean getRunning(){
        return this.running;
    }
}
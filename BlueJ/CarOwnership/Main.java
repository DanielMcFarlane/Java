
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    // instance variables - replace the example below with your own
    public static void main(String[] args){
        // create cars and people objects here
        Car bmw = new Car("BMW", "5 Series");
        Car audi = new Car("Audi", "A6");
        Person daniel = new Person("Daniel");
        Person jordan = new Person("Jordan");
        // call acquireCar on the people objects to associate owners with cars
        daniel.acquireCar(bmw);
        jordan.acquireCar(audi);
        daniel.displayOwnership();
        jordan.displayOwnership();
        //display ownership
    }
}


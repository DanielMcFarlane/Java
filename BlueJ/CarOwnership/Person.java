
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Person {
    private String name;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.car = null; // Initialize with no car
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void acquireCar(Car car) {
        if (this.car == null){
            this.car = car;
        }else{
            System.out.println("You already have a " + car.getMake());
        }
    }
    
    public void displayOwnership(){
        
    }
}








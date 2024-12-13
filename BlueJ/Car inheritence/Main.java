import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", 2018, 4, 5);
        Car car2 = new Car("Ford", "Mustang", 2021, 2, 4);
        Car car3 = new Car("BMW", "X5", 2019, 5, 5);

        Motorcycle bike1 = new Motorcycle("Yamaha", "MT-07", 2020, false);
        Motorcycle bike2 = new Motorcycle("Ducati", "Panigale V4", 2022, false);

        Garage garage = new Garage();

        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.addVehicle(car3);

        garage.addVehicle(bike1);
        garage.addVehicle(bike2);

        garage.test();
    }
}
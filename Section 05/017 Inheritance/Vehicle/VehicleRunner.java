package OOP.Inheritance.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Volvo volvo = new Volvo(36);

        volvo.steering(45);         // degrees
        volvo.accelerate(30);
        volvo.accelerate(20);
        volvo.accelerate(-42);
    }
}

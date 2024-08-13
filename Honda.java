package day2;

public class Honda implements Vehicle {
    @Override
    public int totalWheels() {
        return 4;
    }

    @Override
    public String make() {
        return "Honda";
    }

    @Override
    public String model() {
        return "Civic";
    }

    //@todo add toString
}

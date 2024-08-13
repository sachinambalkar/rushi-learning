package day2;

public class Bajaj implements Vehicle {

    int totalWheels = 2;
    String make = "Bajaj";
    String mode = "Pulsar";

    public int totalWheels(){
            return totalWheels;
    }
    public String make(){
        return make;
    }
    public String model(){
        return mode;
    }

    @Override
    public String toString() {
        return "Bajaj{" +
                "totalWheels=" + totalWheels +
                ", make='" + make + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }
}

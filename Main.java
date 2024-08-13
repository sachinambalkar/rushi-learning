package day2;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String args[]){
        new Main().start();
    }


    public void start(){
        vehicleList();
    }


    public void vehicleList(){
        List<Vehicle> list = new ArrayList();
        //Datatype => String, Integer, Double, Float
        Vehicle bajaj = new Bajaj();
        Vehicle honda = new Honda();
        Vehicle duke = new Duke();

        list.add(bajaj);
        list.add(honda);
        list.add(duke);

        for(Vehicle vehicle:list){
            System.out.println(vehicle);
        }

    }

    public void stringList(){
        List<String> list = new ArrayList();
        String name = "Rushi";
        list.add(name);
        for(String str:list){
            System.out.println(str);
        }
    }

    public   void listCommon(){
        List list = new ArrayList();
        //Datatype => String, Integer, Double, Float
        String name = "Rushi";
        Integer val = 10;
        Double percentage = 20.50;
        Float f = 40.50f;
        //Object or Variable
        list.add(name);
        list.add(val);
        list.add(percentage);
        list.add(f);
        for(Object obj:list){
            System.out.println(obj);
        }

    }

    class Rushi{

    }

}

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Bmw");
        cars.add("Benz");
        cars.set(0, "Hyundai");
        System.out.println(cars.get(0)+"\n");
        cars.remove(0);
        for(String i: cars) {
            System.out.println(i);
        }
        System.out.println("\n");
        cars.clear();
        cars.add("Volvo");
        cars.add("Bmw");
        for(int i =0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("\n");
        Collections.sort(cars);
        for(String i: cars) {
            System.out.println(i);
        }
        System.out.println("\n");
    }
}
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
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

        cars.addFirst("Acura");
        cars.addLast("VW");

        System.out.println( cars.getFirst()+"\n");
        System.out.println( cars.getLast()+"\n");

        for(String i: cars) {
            System.out.println(i);
        }
        System.out.println("\n");
        
        cars.removeFirst();
        cars.removeLast();

        for(String i: cars) {
            System.out.println(i);
        }
        System.out.println("\n");

    }
}


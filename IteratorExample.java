import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // get Iterartor
        Iterator<String> iterator = cars.iterator();

        // System.out.println(iterator.next()+"\n");

        while(iterator.hasNext()) {
            String car = iterator.next();
            if(car == "Volvo") iterator.remove();
        }
        System.out.println("\n");

        
        System.out.println(cars);
        
    }
    
}

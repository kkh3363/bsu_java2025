package arraysec;
import java.util.LinkedList;

public class LinkedExam {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        System.out.println(cars);
        // Use addLast() to add the item to the end
        cars.addLast("Mazda");
        System.out.println(cars);
        // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println(cars);
        // Use getFirst() to display the first item in the list
        System.out.println(cars.getFirst());
        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());
  }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
list.add(13);
list.add(42);
list.add(52);
list.add(69);
list.remove(3);
list.forEach(System.out::println);
        System.out.println(list.contains(0));
        SmartArray smartArray =new SmartArray();
        smartArray.add(13);
        smartArray.add(42);
        smartArray.add(52);
        smartArray.add(69);
        smartArray.remove(3);
smartArray.add(1, 5);
        System.out.println(smartArray.contains(0));
        smartArray.forEach(System.out::println);
    }
}
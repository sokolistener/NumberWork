import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(n -> n <= 0);
        intList.removeIf(n -> n % 2 !=0);
        Collections.sort(intList);

        intList.forEach(System.out::println);
        //System.out.println(intList);

    }
}
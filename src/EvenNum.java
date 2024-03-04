import java.util.Arrays;
import java.util.List;

public class EvenNum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,34,56,11,5,7,56,78);

        list.stream().filter(a -> a%2 == 0).forEach(System.out::println);
    }
}

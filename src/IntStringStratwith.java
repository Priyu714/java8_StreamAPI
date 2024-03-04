import java.util.Arrays;
import java.util.List;

public class IntStringStratwith {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,34,56,11,5,7,56,78,1,19);

        list.stream().map(s -> s +"")
                .filter(s-> s.startsWith("1")).forEach(System.out::println);
    }
}

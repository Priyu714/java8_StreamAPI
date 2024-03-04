import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,35,56,12,5,35,56,78,12);

        Set<Integer> set = new HashSet<>();

        //Finding out the Duplicates
        System.out.println(list.stream().filter(s->!set.add(s)).collect(Collectors.toSet()));

      //  Finding first element in the list
        list.stream().findFirst().ifPresent(System.out::println);

      //Counting the elements of the list
        long count =list.stream().count();
        System.out.println(count);


        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);

    }
}

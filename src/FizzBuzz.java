import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public class FizzBuzzBangStream {

        public static List<Integer> range = IntStream.range(1, 201).boxed().collect(Collectors.toList());

        public static Stream<String> create() {
            
            Stream<String> resultStream = range.stream()
            .map(int -> {
                if (int % 3 == 0) {
                    Integer.toString(int);
                    int = "Fizz";
                }
                if (i % 5 == 0) {
                    result.add("Buzz");
                }
                if (i % 7 == 0) {
                    result.add("Bang");
                }
            });
            
            return resultStream;
            
        }
    }

    public static void main(String[] args) throws Exception {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                result.add("Fizz");
            }
            if (i % 5 == 0) {
                result.add("Buzz");
            }
            if (i % 7 == 0) {
                result.add("Bang");
            }
            if (result.size() == 0) {
                result.add(String.valueOf(i));
            }

            System.out.println(String.join("", result));

            result.clear();
        }
    }
}
